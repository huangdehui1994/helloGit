package dao;

import entities.Department;

import java.util.List;

/**
 * DepartmentDao
 * Created by huang on 2017/7/4.
 */
public class DepartmentDao extends BaseDao {
    public List<Department> getAll() {
        String hql = "FROM Department";
        return getSession().createQuery(hql).list();
    }
}
