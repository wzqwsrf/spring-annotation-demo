package com.wzq.spring.dao.impl;

import com.wzq.spring.dao.UserDao;
import com.wzq.spring.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

/**
 * @author: wangzhenqing
 * @data: 2015年04月13日10:45:03
 * @Description: userDao实现类
 */
@Repository
public class UserDaoImpl implements UserDao {
    
    private Log log = LogFactory.getLog(this.getClass());

    public User getUserName(String username) {
        log.info("getUserName: username=" + username);
        return new User();
    }

    public boolean modifyUser(User user) {
        log.info("modifyUser: username=" + user.getUsername() + ", password=" + user.getPassword());
        return true;
    }

    public boolean deleteUser(String username) {
        log.info("deleteUser: username="+username);
        return true;
    }

    public boolean addUser(User user) {
        log.info("addUser: username=" + user.getUsername() + ", password=" + user.getPassword());
        return true;
    }
}
