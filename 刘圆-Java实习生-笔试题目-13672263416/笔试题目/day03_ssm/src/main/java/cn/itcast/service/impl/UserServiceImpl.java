package cn.itcast.service.impl;


import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
      @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("业务层：查询所有用户信息。。。。");
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        System.out.println("业务层：保存用户信息。。。");
   userDao.saveUser(user);
    }

    @Override
    public void delUser(int id) {
        System.out.println("业务层：删除用户信息。。。");

    }

    @Override
    public int update(User user) {
        System.out.println("业务层：修改用户信息。。。");

        return 0;
    }
}
