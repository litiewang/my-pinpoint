//package com.navercorp.pinpoint.web.alarm;
//
//
//import com.navercorp.pinpoint.web.alarm.checker.AlarmChecker;
//import com.navercorp.pinpoint.web.alarm.mail.MailSenderInfo;
//import com.navercorp.pinpoint.web.alarm.mail.SimpleMailSender;
//import com.navercorp.pinpoint.web.service.UserGroupService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
///**
// * Created by 许恕 on 2018/4/3.
// */
//public class AlarmMessageSenderImple implements AlarmMessageSender{
//  private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//  @Autowired
//  private UserGroupService userGroupService;
//
//  @Override
//  public void sendSms(AlarmChecker checker, int sequenceCount) {
//
//    List<String> receivers = userGroupService.selectPhoneNumberOfMember(checker.getuserGroupId());
//
//    if (receivers.size() == 0) {
//      return;
//    }
//
//    List<String> sms = checker.getSmsMessage();
//
//    for (String message : sms) {
//      logger.info("send SMS : {}", message);
//
//      // TODO Implement logic for sending SMS
//    }
//  }
//
//  @Override
//  public void sendEmail(AlarmChecker checker, int sequenceCount) {
//
//    List<String> receivers = userGroupService.selectEmailOfMember(checker.getuserGroupId());
//
//    if (receivers.size() == 0) {
//      return;
//    }
//
//    for (String emailId : receivers) {
//
//      /*  这个类主要是设置邮件
//       *  mailServerHost:邮箱服务器
//       *  userName:发送方邮件用户名
//       *  password:发送方邮件密码
//       *  fromAddress:发送方邮件用户名
//       *  toAddress:接收方邮件用户名
//       */
//      MailSenderInfo mailInfo = new MailSenderInfo();
//      mailInfo.setMailServerHost("smtp.21cn.com");
//      mailInfo.setMailServerPort("25");
//      mailInfo.setValidate(true);
//      mailInfo.setUserName("yourname@21cn.com");
//      mailInfo.setPassword("yourpass");
//      mailInfo.setFromAddress("yourname@21cn.com");
//      mailInfo.setToAddress(emailId);
//      mailInfo.setSubject("Pinpoint报警");
//      mailInfo.setContent(checker.getEmailMessage());
//      // 这个类主要来发送邮件
//      SimpleMailSender sms = new SimpleMailSender();
//      boolean con = false;
//
//      try {
//        con = sms.sendTextMail(mailInfo);// 发送文体格式
//      } catch (Exception e) {
//        logger.error("=AlarmMessageSenderImple.sendEmail=>错误原因是:" + e.getMessage(),e);
//      }
//      if (con) {
//        logger.info("=AlarmMessageSenderImple.sendEmail=>"+emailId+"发送成功！邮件内容："+checker.getEmailMessage());
//      } else {
//        logger.info("=AlarmMessageSenderImple.sendEmail=>"+emailId+"发送失败！邮件内容："+checker.getEmailMessage());
//      }
//    }
//
//  }
//}