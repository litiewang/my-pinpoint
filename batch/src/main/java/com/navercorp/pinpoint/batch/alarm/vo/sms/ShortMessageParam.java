package com.navercorp.pinpoint.batch.alarm.vo.sms;


/**
 * @author litiewang
 * @version 1.0
 * @date 2021/12/14 20:00
 */
public class ShortMessageParam {
  
  
  //("发送内容")
  private String OrderContent;
  //("用户号码")
  private String AccNbr;

  public ShortMessageParam(String orderContent, String accNbr) {
    this.OrderContent = orderContent;
    this.AccNbr = accNbr;
  }
  public String getOrderContent() {
    return OrderContent;
  }
  
  public void setOrderContent(String orderContent) {
    OrderContent = orderContent;
  }
  
  public String getAccNbr() {
    return AccNbr;
  }
  
  public void setAccNbr(String accNbr) {
    AccNbr = accNbr;
  }
}
