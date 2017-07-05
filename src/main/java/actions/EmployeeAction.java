package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import entities.Department;
import entities.Employee;
import org.apache.struts2.interceptor.RequestAware;
import service.EmployeeService;

import java.security.AccessControlContext;
import java.util.Map;

/**
 * EmployeeAction
 * Created by huang on 2017/7/4.
 */
public class EmployeeAction extends ActionSupport implements RequestAware,
        ModelDriven<Employee>, Preparable {

    private static final long serialVersionUID = -8987572011654296842L;

    private EmployeeService employeeService;


    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String list() {
        request.put("employees", employeeService.getAll());
        return "list";
    }

    private Employee model;

    public Employee getModel() {
        return model;
    }

    public void prepare() throws Exception {

    }

    private Map<String, Object> request;

    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }
}
