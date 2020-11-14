package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import cn.itcast.utils.DateUtil;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    /**
     * 测试查询
     * @throws Exception
     */
    @Test
    public void run1() throws Exception{
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取 到代理对象
        UserDao dao = session.getMapper(UserDao.class);
        //查询所有数据
        List<User> list=    dao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        //释放资源
        session.close();
         in.close();
    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception{
        User user=new User();
        user.setMobile("123456789");
        user.setPassword("123456");
        user.setSex("男");
        user.setBirthdate(DateUtil.string2Date("1998-12-1 13:45:55"));
        user.setAddress("四川省成都市锦江区");
        user.setEmail("6165456@qq.com");
        user.setState("1");
        user.setCreate_time(DateUtil.string2Date("2001-12-1 13:45:55"));
        user.setUpdate_time(DateUtil.string2Date("2002-12-1 13:45:55"));
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();

        //获取 到代理对象
        UserDao dao = session.getMapper(UserDao.class);
       dao.saveUser(user);
       session.commit();

        //释放资源
        session.close();
        in.close();
    }
}
