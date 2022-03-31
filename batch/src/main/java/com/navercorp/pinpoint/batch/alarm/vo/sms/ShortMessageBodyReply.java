package com.navercorp.pinpoint.batch.alarm.vo.sms;


import java.util.Map;
 
public class ShortMessageBodyReply {
  //("请求的消息流水")
  
  public String getTransactionId() {
    return transactionId;
  }
  
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  
  public String getResponseTime() {
    return responseTime;
  }
  
  public void setResponseTime(String responseTime) {
    this.responseTime = responseTime;
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getMsg() {
    return msg;
  }
  
  public void setMsg(String msg) {
    this.msg = msg;
  }
  
  /**
   * 请求的消息流水作为结果内容的一部分返回
   */
  private String transactionId;
  
  //("响应时间")
  /**
   *响应时间，格式：yyyy-mm-dd hh24:mi:ss
   */
  private String responseTime;
  
  //("处理结果编码")
  /**
   *处理结果编码，0000表示成功，其他表示失败
   */
  private String code;
  
  //("处理结果描述")
  /**
   *处理结果描述
   */
  private String msg;
  
  public ShortMessageBodyReply() {
  }
  
  public ShortMessageBodyReply(Map<String, Object> map) {
    this.transactionId = (String) map.get("TransactionId");
    this.responseTime = (String) map.get("ResponseTime");
    this.code = (String) map.get("code");
    this.msg = (String) map.get("msg");
  }
}
