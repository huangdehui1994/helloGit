package service;

import dao.EmployeeDao;
import entities.Employee;

import java.util.List;

/**
 * EmployeeService
 * Created by huang on 2017/7/5.
 */
public class EmployeeService {

    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAll() {
        List<Employee> employees = employeeDao.getAll();
//		employees.clear();
        return employees;
    }

}
