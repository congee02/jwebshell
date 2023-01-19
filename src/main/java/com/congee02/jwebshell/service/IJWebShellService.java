package com.congee02.jwebshell.service;

import java.io.IOException;

/**
 * @author congee(congee02 @ 163.com)
 * @date 1/19/2023 9:06 AM
 */
public interface IJWebShellService {

    String execute(String cmd) throws IOException;

}
