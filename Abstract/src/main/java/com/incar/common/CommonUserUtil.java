package com.incar.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Incar on 2016/10/11.
 */
@Service
public class CommonUserUtil {

    @Autowired
    CommomHostUtil commomHostUtil;

    @Value("${service.api.user.account.findById}")
    String findById;

    public String findById()
    {
        return commomHostUtil.getHost() + this.findById;
    }
}
