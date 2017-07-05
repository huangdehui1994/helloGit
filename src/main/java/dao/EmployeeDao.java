package dao;

import entities.Employee;

import java.util.List;

/**
 * EmployeeDao
 * Created by huang on 2017/7/4.
 */
public class EmployeeDao extends BaseDao {

    public List<Employee> getAll() {
        String hql = "FROM Employee e LEFT OUTER JOIN FETCH e.department";
        return getSession().createQuery(hql).list();
    }


}
