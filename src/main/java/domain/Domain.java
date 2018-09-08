package domain;

import com.util.MybatisUtil;
import model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @program: MybatisWork
 * @Date: 2018/9/1/001 22:07
 * @Author: Mr.Qiu
 * @Description:
 */
public class Domain {

    public static void main(String[] args) {
        String resource = "mybatis-config.xml";

        // 使用类加载器加载mybatis配置文件
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sessionFactory.openSession();
            String statement = "mapper.UserMapper.getUser";
            User user = sqlSession.selectOne(statement,2);
            System.out.println(user);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addUser() {
        SqlSession session = MybatisUtil.getSession();
        User user = new User();
        user.setAge(100);
        user.setName("柳志清");
        session.insert("mapper.UserMapper.addUser", user);
        session.commit();   //手动提交事务
        MybatisUtil.getClose();
    }

    @Test
    public void delUser() {
        SqlSession session = MybatisUtil.getSession();
        session.insert("mapper.UserMapper.delUser", 4);
        session.commit();   //手动提交事务
        MybatisUtil.getClose();
    }

    @Test
    public void editUser() {
        SqlSession session = MybatisUtil.getSession();
        User user = new User();
        user.setId(2);
        user.setAge(100);
        user.setName("柳志清");
        session.update("mapper.UserMapper.editUser", user);
        session.commit();   //手动提交事务
        MybatisUtil.getClose();
    }


    @Test
    public void getUser() {
        SqlSession session = MybatisUtil.getSession();
        List<User> objects = session.selectList("mapper.UserMapper.getAll",new User());
        System.out.println(objects.size());
        MybatisUtil.getClose();
    }



}
