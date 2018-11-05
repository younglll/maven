package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDao {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("springMybatisConfig.xml");
//        AccountDao dao = ac.getBean(AccountDao.class);
//        List<Account> list = dao.findAccounts();
//        for (Account account : list) {
//            System.out.println(account);
//        }
        AccountService service = ac.getBean(AccountService.class);
        List<Account> accounts = service.findAccounts();
        for (Account s : accounts) {
            System.out.println(s);
        }


    }
}
