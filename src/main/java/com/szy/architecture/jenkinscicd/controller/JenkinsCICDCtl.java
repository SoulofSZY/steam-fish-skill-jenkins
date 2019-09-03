package com.szy.architecture.jenkinscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试jenkins 自动化部署〉
 *
 * @author sunzhengyu
 * @create 2019/9/3
 * @since 1.0.0
 */
@RestController
@RequestMapping("/jenkins/cicd")
public class JenkinsCICDCtl {

    @GetMapping("/start")
    public String start() {
        return "start";
    }
}