package com.wzq.spring.service;

import com.wzq.spring.dao.UserDao;
import com.wzq.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author: wangzhenqing
 * @data: 2015-04-11 20:25:00
 * @Description: 用户service
 */

@Service
public class UserService {

    private UserDao userDao;

    public User getUserName(String username){
        User user = userDao.getUserName(username);
        return user;
    }

    public boolean modifyUser(User user){
        return userDao.modifyUser(user);
    }

    public boolean deleteUser(String username){
        return userDao.deleteUser(username);
    }

    public boolean addUser(User user){
        return userDao.addUser(user);
    }


    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    @Qualifier("userDaoImpl")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
