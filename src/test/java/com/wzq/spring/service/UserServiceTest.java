package com.wzq.spring.service;

import com.wzq.spring.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wangzhenqing
 * @data: 2015年04月13日10:50:58
 * @Description: UserService测试类
 */
//extends TestCase
public class UserServiceTest{

    private UserService userService = null;

    @Before
    public void testBefore(){
        ApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(cp);
        userService = (UserService) cp.getBean("userService");
        if (userService == null){
            System.out.println("anc");
        }
    }

    @Test
    public void testGetUserName() throws Exception {
//        System.out.println("11");
        User user = new User("zhenqing.wang","123");
        userService.modifyUser(user);

    }

    @Test
    public void testModifyUser() throws Exception {
        User user = new User("zhenqing.wang","123");
        userService.modifyUser(user);

    }

    @Test
    public void testDeleteUser() throws Exception {
        String username = "zhenqing.wang";
        userService.deleteUser(username);

    }

    @Test
    public void testAddUser() throws Exception {
        User user = new User("zhenqing.wang","123");
        userService.addUser(user);

    }
}