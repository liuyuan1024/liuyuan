package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface UserService {

    //查询所有用户信息
    public List<User> findAll();

    //保存用户信息
    public  void saveUser(User user);

    //删除用户信息
    public void  delUser(int id);

    //修改用户信息
    public int update ( User user );

}
