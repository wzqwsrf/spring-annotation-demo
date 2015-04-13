package com.wzq.spring.service;

import com.wzq.spring.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

    private Log log = LogFactory.getLog(this.getClass());

    private UserService userService = null;

    @Before
    public void testBefore(){
        ApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (UserService) cp.getBean("userService");
        if (userService == null){
            log.error("userService is null!");
        }
    }

    @Test
    public void testGetUserName() throws Exception {
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