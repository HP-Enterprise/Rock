package com.incar.common;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Incar on 2016/10/11.
 */
public class CommomHostUtil {

    @Value("${service.ip}")
    String ip;

    @Value("${service.port}")
    String port;

    public String getHost()
    {
        return "http://" + ip + ":" + port;
    }
}
