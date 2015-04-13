package com.wzq.spring.dao;

import com.wzq.spring.model.User;

/**
 * @author: wangzhenqing
 * @data: 2015年04月13日10:49:00
 * @Description: userDao接口
 */
public interface UserDao {

    public User getUserName(String username);

    public boolean modifyUser(User user);

    public boolean deleteUser(String username);

    public boolean addUser(User user);

}
