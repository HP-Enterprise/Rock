package com.incar.user.service;

import com.incar.user.vo.AccountShow;

/**
 * Created by Incar on 2016/10/10.
 */
public interface IAccountService {

    AccountShow findById(int id);
}
