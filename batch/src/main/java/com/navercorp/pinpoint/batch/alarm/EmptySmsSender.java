/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.batch.alarm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.navercorp.pinpoint.batch.alarm.checker.AlarmChecker;
import com.navercorp.pinpoint.batch.alarm.vo.sms.ShortMessageBodyReply;
import com.navercorp.pinpoint.batch.alarm.vo.sms.ShortMessageParam;
import com.navercorp.pinpoint.batch.common.BatchConfiguration;
import com.navercorp.pinpoint.common.util.CollectionUtils;
import com.navercorp.pinpoint.exception.PinpointException;
import com.navercorp.pinpoint.web.service.UserGroupService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.batch.core.StepExecution;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;

import java.util.List;

/**
 * @author minwoo.jung
 */

public class EmptySmsSender implements SmsSender {
    private String url;
    
    private int  port;
    
    private String address;
    private final Logger logger = LogManager.getLogger(this.getClass());
  
    private final UserGroupService userGroupService;
    public EmptySmsSender(BatchConfiguration batchConfiguration, UserGroupService userGroupService){
        this.userGroupService =userGroupService;
        this.port=batchConfiguration.getPort();
        this.url=batchConfiguration.getUrl();
        this.address=batchConfiguration.getAddress();
    }
    @Override
    public void sendSms(AlarmChecker<?> checker, int sequenceCount, StepExecution stepExecution) {
        logger.info("can not send sms message.");
        List<String> phoneList = userGroupService.selectPhoneNumberOfMember(checker.getUserGroupId());
        
        if (phoneList.isEmpty()) {
            return;
        }
        List<String> smsMessageList =checker.getSmsMessage();
        if(CollectionUtils.isEmpty(smsMessageList)){
            return;
        }
        for (String phone:phoneList){
            ShortMessageParam param = new ShortMessageParam(smsMessageList.get(0),phone);
          String reply=  sendPost(JSONObject.toJSONString(param));
            ShortMessageBodyReply bodyReply = JSONObject.toJavaObject(JSON.parseObject(reply), ShortMessageBodyReply.class);
            if ("0000".equals(bodyReply.getCode().trim())) {
                //成功后逻辑
               // return true;
            }
        }
        
        
    }
    private String sendPost(String s) {
        //Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = null;
        try {
            response = Unirest.post(address + ":" + port+url)
                .header("User-Agent", "")
                .header("Content-Type", "application/json")
                .header("Accept-Encoding", "gzip, deflate, br")
                .body(s)
                .asString();
        } catch (UnirestException e) {
            throw new PinpointException("调用服务失败", e);
        }
        return response.getBody();
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public int getPort() {
        return port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
