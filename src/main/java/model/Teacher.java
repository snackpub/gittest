package model;

import java.io.Serializable;

/**
 * @program: MybatisWork
 * @Date: 2018/9/2/002 22:57
 * @Author: Mr.Qiu
 * @Description:
 */
public class Teacher implements Serializable {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
