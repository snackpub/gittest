package domain;

import com.util.MybatisUtil;
import model.Classes;
import model.Order;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @program: MybatisWork
 * @Date: 2018/9/2/002 23:13
 * @Author: Mr.Qiu
 * @Description:
 */
public class ClassMain {

    public static void main(String[] args) {
        SqlSession session = MybatisUtil.getSession();
        // sql标识字符串
        String statement = "mapper.classMapper.getClass";
        Classes o = session.selectOne(statement, 1);
        System.out.println(o);
        MybatisUtil.getClose();
    }

    @Test
    public void classMain() {
        SqlSession session = MybatisUtil.getSession();
        // sql标识字符串
        String statement = "mapper.classMapper.getClass2";
        Classes o = session.selectOne(statement, 1);
        System.out.println(o);
        MybatisUtil.getClose();
    }

    @Test
    public void class1Main() {
        SqlSession session = MybatisUtil.getSession();
        // sql标识字符串
        String statement = "mapper.classMapper.getClass3";
        Classes o = session.selectOne(statement, 1);
        System.out.println(o);
        MybatisUtil.getClose();
    }

    @Test
    public void class1Main3() {
        SqlSession session = MybatisUtil.getSession();
        // sql标识字符串
        String statement = "mapper.classMapper.getClass4";
        Classes o = session.selectOne(statement, 1);
        System.out.println(o);
        MybatisUtil.getClose();
    }
}
