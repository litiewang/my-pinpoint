package com.navercorp.pinpoint.plugin.bizlog;

import com.navercorp.pinpoint.common.trace.TraceMetadataProvider;
import com.navercorp.pinpoint.common.trace.TraceMetadataSetupContext;

/**
 * @author willzhao
 */
public class BizlogMetadataProvider implements TraceMetadataProvider {
  /**
   * @see TraceMetadataProvider#setup(TraceMetadataSetupContext)
   */
  @Override
  public void setup(TraceMetadataSetupContext context) {
    //设定当前插件的ServiceType，既插件的唯一身份
    context.addServiceType(BizlogPlugin.BIZLOG_SERVICE_TYPE);
    //设定当前插件要展示的参数
    context.addAnnotationKey(BizlogPlugin.BIZLOG_ANNOTATION_KEY_INFO);
  }
}
