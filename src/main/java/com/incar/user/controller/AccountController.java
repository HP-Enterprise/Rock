package com.incar.user.controller;

import com.incar.controller.BaseController;
import com.incar.controller.ObjectResult;
import com.incar.user.service.IAccountService;
import com.incar.user.vo.AccountShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Incar on 2016/10/10.
 */
@RestController
@RequestMapping("/api")
public class AccountController extends BaseController {

    @Autowired
    IAccountService accountService;

    /**
     * 根据账户ID查询账户信息
     * @param id 账户ID
     * @return 账户信息
     */
    @RequestMapping(value="/account/{id}",method = RequestMethod.GET)
    public String findAccountById(@PathVariable("id") int id)
    {
        return accountService.findById(id);
    }
}
