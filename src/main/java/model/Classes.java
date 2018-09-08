package model;

import java.util.List;

/**
 * @program: MybatisWork
 * @Date: 2018/9/2/002 22:58
 * @Author: Mr.Qiu
 * @Description:
 */
public class Classes {
    private Integer id;
    private String name;

    /**
     * class表中有一个teaher_id字段，所以在classes类中定义一个teacher属性
     * 用于维护teacher和class之间一对一关系
     */
    private Teacher teacher;

    /**
     * 使用一个List<Student> 来表示一个班级所拥有的学生
     */
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
