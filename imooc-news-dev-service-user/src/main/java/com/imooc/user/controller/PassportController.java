package com.imooc.user.controller;

/*
 * @author haoyu
 * @date 2021/9/11 20:50
 */

import com.imooc.api.controller.user.PassportControllerApi;
import com.imooc.grace.result.GraceJSONResult;
import com.imooc.utils.MyInfo;
import com.imooc.utils.SMSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassportController implements PassportControllerApi {
    final static Logger logger = LoggerFactory.getLogger(PassportController.class);

    @Autowired
    private SMSUtils smsUtils;

    @Override
    public GraceJSONResult getSMSCode() {
        String random  = "123789";
        smsUtils.sendSMS(MyInfo.getMobile(), random);
        return GraceJSONResult.ok();
    }
}
