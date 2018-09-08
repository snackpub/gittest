package domain;

import com.util.MybatisUtil;
import mapper.UserMapperI;
import model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: MybatisWork
 * @Date: 2018/9/2/002 10:36
 * @Author: Mr.Qiu
 * @Description:
 */
public class TestCRUDByAnnotationMapper {

    @Test
    public void addUser() {
        SqlSession session = MybatisUtil.getSession();
        // 动态构建接口的实现类
        UserMapperI mapper = session.getMapper(UserMapperI.class);
        User user = new User();
        user.setName("接口测试");
        user.setAge(0);
        mapper.add(user);
        session.commit();
        MybatisUtil.getClose();
    }

    @Test
    public void delUser() {
        SqlSession session = MybatisUtil.getSession();
        // 动态构建接口的实现类
        UserMapperI mapper = session.getMapper(UserMapperI.class);
        mapper.deleteById(6);
        session.commit();
        MybatisUtil.getClose();
    }

    @Test
    public void editUser() {
        SqlSession session = MybatisUtil.getSession();
        // 动态构建接口的实现类
        UserMapperI mapper = session.getMapper(UserMapperI.class);
        User user = new User();
        user.setName("接口测试");
        user.setAge(0);
        user.setId(2);
        mapper.udpate(user);
        session.commit();
        MybatisUtil.getClose();
    }

    @Test
    public void getUser() {
        SqlSession session = MybatisUtil.getSession();
        // 动态构建接口的实现类
        UserMapperI mapper = session.getMapper(UserMapperI.class);
        User byId = mapper.getById(2);
        System.out.println(byId);
        session.commit();
        MybatisUtil.getClose();
    }

    @Test
    public void getAll() {
        SqlSession session = MybatisUtil.getSession();
        // 动态构建接口的实现类
        UserMapperI mapper = session.getMapper(UserMapperI.class);
        List<User> all = mapper.getAll();
        for (User a : all) {
            System.out.println(a);
        }
        session.commit();
        MybatisUtil.getClose();
    }



}
