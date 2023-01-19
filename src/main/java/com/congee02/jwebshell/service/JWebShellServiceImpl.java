package com.congee02.jwebshell.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;

/**
 * @author congee(congee02 @ 163.com)
 * @date 1/19/2023 9:06 AM
 */
@Service
@Slf4j
public class JWebShellServiceImpl implements IJWebShellService {
    @Override
    public String execute(String cmd) throws IOException {

        InputStream is = Runtime.getRuntime().exec(cmd).getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        StringBuilder sb = new StringBuilder();
        String lineBuffer = "";
        while ((lineBuffer = br.readLine()) != null) {
            sb.append(lineBuffer);
            sb.append('\n');
        }

        System.out.println(sb.toString());

        return sb.toString();
    }
}
