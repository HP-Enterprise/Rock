package com.incar.user.service;

import com.incar.user.vo.AccountShow;
import org.springframework.stereotype.Service;

/**
 * Created by Incar on 2016/10/10.
 */
@Service
public class AccountService implements IAccountService {

    /**
     * 通过ID查询账户信息
     * @param id 账户ID
     * @return 账户信息
     */
    @Override
    public AccountShow findById(int id) {
        return null;
    }
}
