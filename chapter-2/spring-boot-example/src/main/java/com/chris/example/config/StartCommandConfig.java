package com.chris.example.config;

import com.chris.example.util.ServerPortUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 21:13
 */
@Configuration
public class StartCommandConfig {
    private Logger log = LoggerFactory.getLogger(StartCommandConfig.class);

    public StartCommandConfig(String[] args) {
        boolean isServerPort = false;
        String serverPort = "";
        if (args != null) {
            for (String arg : args) {
                if (StringUtils.hasText(arg) && arg.startsWith("--server.port")) {
                    isServerPort = true;
                    serverPort = arg;
                    break;
                }
            }
        }

        // 如果没有端口, 则随机生成一个可用的端口
        if (!isServerPort) {
            int port = ServerPortUtil.getAvailablePort();
            log.info("current port: " + port);
            System.setProperty("server.port", String.valueOf(port));
        } else {
            log.info("current port: " + serverPort.split("=")[1]);
            System.setProperty("server.port", String.valueOf(serverPort.split("=")[1]));
        }

    }
}
