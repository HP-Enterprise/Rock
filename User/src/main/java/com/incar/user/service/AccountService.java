package com.incar.user.service;

import com.incar.common.CommonUserUtil;
import com.incar.common.HttpRequestUtil;
import org.springframework.stereotype.Service;

/**
 * Created by Incar on 2016/10/10.
 */
@Service
public class AccountService extends CommonUserUtil implements IAccountService {

    /**
     * 通过ID查询账户信息
     * @param id 账户ID
     * @return 账户信息
     */
    @Override
    public String findById(int id)
    {
        String URL = findById();
        String realURL = URL.replace("{id}",String.valueOf(id));
        String requestResult = HttpRequestUtil.getRequest(realURL);
        return requestResult;
    }
}
