package com.navercorp.pinpoint.plugin.bizlog.interceptor;

import com.navercorp.pinpoint.bootstrap.context.MethodDescriptor;
import com.navercorp.pinpoint.bootstrap.context.SpanEventRecorder;
import com.navercorp.pinpoint.bootstrap.context.Trace;
import com.navercorp.pinpoint.bootstrap.context.TraceContext;
import com.navercorp.pinpoint.bootstrap.interceptor.AroundInterceptor;
import com.navercorp.pinpoint.bootstrap.logging.PLogger;
import com.navercorp.pinpoint.bootstrap.logging.PLoggerFactory;
import com.navercorp.pinpoint.plugin.bizlog.BizlogPlugin;

/**
 * logger info method interceptor
 *
 * @author willzhao
 */
public class BizlogInterceptor implements AroundInterceptor {
  private final TraceContext traceContext;
  private final MethodDescriptor descriptor;
  private final PLogger logger = PLoggerFactory.getLogger(getClass());
  
  public BizlogInterceptor(TraceContext traceContext, MethodDescriptor descriptor) {
    this.traceContext = traceContext;
    this.descriptor = descriptor;
  }
  
  private static boolean shouldTrace(Object[] args){
    return null!=args
        && args.length>0
        && (args[0] instanceof String)
        && ((String)args[0]).indexOf("pinpoint_bizlog_name")>-1;
  }
  
  @Override
  public void before(Object target, Object[] args) {
    if (logger.isDebugEnabled()) {
      logger.beforeInterceptor(target, args);
    }
    
    final Trace trace = traceContext.currentTraceObject();
    if (trace == null) {
      return;
    }
    
    if(!shouldTrace(args)){
      return;
    }
    
    trace.traceBlockBegin();
    
  }
  
  @Override
  public void after(Object target, Object[] args, Object result, Throwable throwable) {
    if (logger.isDebugEnabled()) {
      logger.afterInterceptor(target, args);
    }
    
    Trace trace = traceContext.currentTraceObject();
    if (trace == null) {
      return;
    }
    
    if(!shouldTrace(args)){
      return;
    }
    
    try {
      SpanEventRecorder recorder = trace.currentSpanEventRecorder();
      recorder.recordServiceType(BizlogPlugin.BIZLOG_SERVICE_TYPE);
      recorder.recordApi(descriptor);
      recorder.recordException(throwable);
      recorder.recordAttribute(BizlogPlugin.BIZLOG_ANNOTATION_KEY_INFO, args[0]);
    } finally {
      trace.traceBlockEnd();
    }
  }
}
