package entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Employee
 * Created by huang on 2017/7/4.
 */
@Entity
public class Employee {

    private Integer id;
    // 不能被修改
    private String lastName;
    private String email;
    // 从前端传入的是 String 类型, 所以需要注意转换
    private Date birth;

    // 不能被修改
    private Date createTime;
    // 单向 n-1 的关联关系
    private Department department;

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @ManyToOne
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
