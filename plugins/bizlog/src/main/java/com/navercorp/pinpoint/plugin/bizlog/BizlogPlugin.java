package com.navercorp.pinpoint.plugin.bizlog;

import com.navercorp.pinpoint.bootstrap.instrument.InstrumentClass;
import com.navercorp.pinpoint.bootstrap.instrument.InstrumentException;
import com.navercorp.pinpoint.bootstrap.instrument.InstrumentMethod;
import com.navercorp.pinpoint.bootstrap.instrument.Instrumentor;
import com.navercorp.pinpoint.bootstrap.instrument.MethodFilters;
import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformCallback;
import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformTemplate;
import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformTemplateAware;
import com.navercorp.pinpoint.bootstrap.logging.PLogger;
import com.navercorp.pinpoint.bootstrap.logging.PLoggerFactory;
import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPlugin;
import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPluginSetupContext;
import com.navercorp.pinpoint.common.trace.AnnotationKey;
import com.navercorp.pinpoint.common.trace.AnnotationKeyFactory;
import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;
import com.navercorp.pinpoint.plugin.bizlog.interceptor.BizlogInterceptor;

import java.security.ProtectionDomain;

/**
 * @author willzhao
 */
public class BizlogPlugin implements ProfilerPlugin, TransformTemplateAware {
  //BIZLOG_SERVICE_TYPE是bizlog插件的身份定义，用了1998这个id
  public static final ServiceType BIZLOG_SERVICE_TYPE = ServiceTypeFactory.of(1998, "BIZLOG");
  
  //BIZLOG_ANNOTATION_KEY_INFO是打算在pinpoint追踪信息中显示的属性的定义，用了9998这个id
  public static final AnnotationKey BIZLOG_ANNOTATION_KEY_INFO = AnnotationKeyFactory.of(9998, "bizlog.info", com.navercorp.pinpoint.common.trace.AnnotationKeyProperty.VIEW_IN_RECORD_SET);
  
  private static final String BIZLOG_SCOPE = "BIZLOG_SCOPE";
  
  private final PLogger logger = PLoggerFactory.getLogger(this.getClass());
  
  private TransformTemplate transformTemplate;
  
  @Override
  public void setup(ProfilerPluginSetupContext context) {
    //Logger类被加载的时候，会注入这里new的TransformCallback，对这个类的实例在线程中的行为进行拦截
    transformTemplate.transform("ch.qos.logback.classic.Logger", new TransformCallback() {
      
      @Override
      public byte[] doInTransform(Instrumentor instrumentor, ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws InstrumentException {
        InstrumentClass target = instrumentor.getInstrumentClass(loader, className, classfileBuffer);
        
        //找到所有名为info的方法
        for (InstrumentMethod m : target.getDeclaredMethods(MethodFilters.name("info"))) {
        //  注入Interceptor，在Logger类的实例执行info方法的时候会执行这个interceptor
          m.addScopedInterceptor(BizlogInterceptor.class, BIZLOG_SCOPE);
        }
        
        return target.toBytecode();
      }
    });
  }
  
  
  @Override
  public void setTransformTemplate(TransformTemplate transformTemplate) {
    this.transformTemplate = transformTemplate;
  }
}

