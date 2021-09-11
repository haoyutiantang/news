package com.imooc.api.controller.user;

/*
 * @author haoyu
 * @date 2021/9/11 20:42
 */


import com.imooc.grace.result.GraceJSONResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("passport")
public interface PassportControllerApi {

    @GetMapping("/getSMSCode")
    public GraceJSONResult getSMSCode();
}
