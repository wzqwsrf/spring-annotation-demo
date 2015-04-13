package com.wzq.spring.dao.impl;

import com.wzq.spring.dao.UserDao;
import com.wzq.spring.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author: wangzhenqing
 * @data: 2015年04月13日10:45:03
 * @Description: userDao实现类
 */
@Repository
public class UserDaoImpl implements UserDao {

    public User getUserName(String username) {
        System.out.println("getUserName: username=" + username);
        return new User();
    }

    public boolean modifyUser(User user) {
        System.out.println("modifyUser: username=" + user.getUsername() + ", password=" + user.getPassword());
        return true;
    }

    public boolean deleteUser(String username) {
        System.out.println("deleteUser: username="+username);
        return true;
    }

    public boolean addUser(User user) {
        System.out.println("addUser: username=" + user.getUsername() + ", password=" + user.getPassword());
        return true;
    }
}
