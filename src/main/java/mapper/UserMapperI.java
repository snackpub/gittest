package mapper;

import model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: MybatisWork
 * @Date: 2018/9/2/002 10:31
 * @Author: Mr.Qiu
 * @Description: 定义映射接口，基于注解实现
 */
public interface UserMapperI {

    @Insert("insert into user(name,age) values(#{name},#{age})")
    public int add(User user);

    @Delete("delete from user where id=#{id}")
    public int deleteById(int id);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    public int udpate(User user);

    @Select("select * from user where id=#{id}")
    public User getById(int id);

    @Select("select * from user")
    public List<User> getAll();

}
