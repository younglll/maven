package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/find")
    public  String findAccounts(Model model){
        List<Account> accounts = accountService.findAccounts();
        model.addAttribute("Accounts", accounts);
        return "itemDetail";
    }
}
