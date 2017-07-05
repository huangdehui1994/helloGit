import entities.Department;
import entities.Employee;
import javafx.scene.chart.PieChart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Date;

/**
 * testBean
 * Created by huang on 2017/7/4.
 */
public class testBean {

    private SessionFactory sessionFactory;
    private Session session;

    @Test
    public void run() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        sessionFactory = (SessionFactory) context.getBean("sessionFactory");

        session = sessionFactory.openSession();

        Session session = sessionFactory.openSession();

        //3. 开启事务
        Transaction transaction = session.beginTransaction();

        //4. 执行保存操作
        Department department = session.get(Department.class, 1);

        Employee employee = new Employee();
        employee.setLastName("黄德辉");
        employee.setDepartment(department);

        session.save(employee);


        //5. 提交事务
        transaction.commit();

        //6. 关闭 Session
        session.close();

        //7. 关闭 SessionFactory 对象
        sessionFactory.close();


    }


    @Test
    public void test() {

        //1. 创建一个 SessionFactory 对象
        SessionFactory sessionFactory = null;

        //1). 创建 Configuration 对象: 对应 hibernate 的基本配置信息和 对象关系映射信息
        Configuration configuration = new Configuration().configure();

        //4.0 之前这样创建
//		sessionFactory = configuration.buildSessionFactory();

        //2). 创建一个 ServiceRegistry 对象: hibernate 4.x 新添加的对象
        //hibernate 的任何配置和服务都需要在该对象中注册后才能有效.
//        ServiceRegistry serviceRegistry =
//                new ServiceRegistryBuilder().applySettings(configuration.getProperties())
//                        .buildServiceRegistry();

        //3).
        //sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        sessionFactory = new Configuration().configure().buildSessionFactory();

        //2. 创建一个 Session 对象
        Session session = sessionFactory.openSession();

        //3. 开启事务
        Transaction transaction = session.beginTransaction();

        //4. 执行保存操作


        //5. 提交事务
        transaction.commit();

        //6. 关闭 Session
        session.close();

        //7. 关闭 SessionFactory 对象
        sessionFactory.close();

    }

}
