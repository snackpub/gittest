package domain;

import com.util.MybatisUtil;
import model.Order;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @program: MybatisWork
 * @Date: 2018/9/2/002 22:36
 * @Author: Mr.Qiu
 * @Description:
 */
public class OrderDoMain {

    public static void main(String[] args) {
        SqlSession session = MybatisUtil.getSession();
        String statement = "mapper.OrderMapper.getOrder";
        Order o = session.selectOne(statement, 1);
        System.out.println(o);
        MybatisUtil.getClose();
    }

    @Test
    public void test1() {
        SqlSession session = MybatisUtil.getSession();
        // sql标识字符串
        String statement = "mapper.OrderMapper.selectOrderResultMap";
        Order o = session.selectOne(statement, 1);
        System.out.println(o);
        MybatisUtil.getClose();
    }

}
