package lpostula.app.square.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateUtil {

    final static Logger logger = LoggerFactory.getLogger("hibernate-util");
    private static ServiceRegistry serviceRegistry;
    private static final SessionFactory sessionFactory;

    static {
	try {
	    Configuration configuration = new Configuration();
	    configuration
		    .configure("hibernate.cfg.xml");
	    serviceRegistry = new ServiceRegistryBuilder().applySettings(
		    configuration.getProperties()).buildServiceRegistry();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	} catch (Throwable ex) {
	    // Log the exception.
	    logger.error("Initial SessionFactory creation failed." + ex);
	    throw new ExceptionInInitializerError(ex);
	}
    }

    public static SessionFactory getSessionFactory() {
	return sessionFactory;
    }

    public static Session beginTransaction() {
	Session hibernateSession = HibernateUtil.getSession();
	hibernateSession.beginTransaction();
	return hibernateSession;
    }

    public static void commitTransaction() {
	HibernateUtil.getSession().getTransaction().commit();
    }

    public static void rollbackTransaction() {
	HibernateUtil.getSession().getTransaction().rollback();
    }

    public static void closeSession() {
	HibernateUtil.getSession().close();
    }

    public static Session getSession() {
	Session hibernateSession = sessionFactory.getCurrentSession();
	return hibernateSession;
    }
}