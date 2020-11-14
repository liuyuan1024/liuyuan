package cn.itcast.dao;


import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 */
@Repository
public interface UserDao {
    //查询所有用户信息
    @Select("select * from user")
    public List<User> findAll();

    //增加用户信息
    @Insert("insert into user(mobile,password,sex,birthdate,address,email,state,create_time,update_time) " +
            "values(#{mobile},#{password},#{sex}),#{birthdate},#{address},#{email},#{state},#{create_time},#{update_time})")
    public  void saveUser(User user);

    //删除用户信息
    @Delete("delete from user where id=#{id}")
    public void  delUser(int id);

    //修改用户信息
    @Update("update user set mobile=#{mobile},password=#{password},sex=#{sex})," +
            "birthdate=#{birthdate},address=#{address},email=#{email}," +
            "state=#{state},create_time=#{create_time},update_time=#{update_time} where id=#{id}")
    public int update ( User user );


}
