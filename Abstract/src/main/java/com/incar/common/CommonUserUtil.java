package com.incar.common;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Incar on 2016/10/11.
 */
public class CommonUserUtil extends CommomHostUtil{

    @Value("${service.api.user.account.findById}")
    String findById;

    public String findById()
    {
        return getHost() + this.findById;
    }
}
