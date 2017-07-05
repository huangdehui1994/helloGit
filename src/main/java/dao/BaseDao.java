package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * BaseDao
 * Created by huang on 2017/7/4.
 */
public class BaseDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
