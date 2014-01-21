package lpostula.app.square.session;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lpostula.app.square.dao.DancerDAO;
import lpostula.app.square.dao.DancerDAOImpl;
import lpostula.app.square.entity.Dancer;
import lpostula.app.square.util.HibernateUtil;

public class DancerManagerImpl implements DancerManager {

    final Logger logger = LoggerFactory.getLogger(DancerManagerImpl.class.getCanonicalName());
    private DancerDAO dancerDAO = new DancerDAOImpl();
    
    public Dancer findByDancerName(String FirstName, String LastName) {
	Dancer dancer = null;
        try {
            HibernateUtil.beginTransaction();
            dancer = dancerDAO.findByName(FirstName, LastName);
            HibernateUtil.commitTransaction();
        } catch (NonUniqueResultException ex) {
            logger.error("Query returned more than one results.", ex);
        } catch (HibernateException ex) {
            logger.error("", ex);
        }
        return dancer;
    }

    @SuppressWarnings("unchecked")
    public List<Dancer> loadAllDancer() {
	List<Dancer> allDancers = new ArrayList<Dancer>();
        try {
            HibernateUtil.beginTransaction();
            allDancers = dancerDAO.findAll(Dancer.class);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            logger.error("", ex);
        }
        return allDancers;
    }

    public void saveNewDancer(Dancer dancer) {
	try {
            HibernateUtil.beginTransaction();
            dancerDAO.save(dancer);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            logger.error("", ex);
            HibernateUtil.rollbackTransaction();
        }
    }

    public Dancer findDancerById(Integer id) {
	Dancer dancer = null;
        try {
            HibernateUtil.beginTransaction();
            dancer = (Dancer) dancerDAO.findByID(Dancer.class, id);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            logger.error("", ex);
        }
        return dancer;
    }

    public void deleteDancer(Dancer dancer) {
	try {
            HibernateUtil.beginTransaction();
            dancerDAO.delete(dancer);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            logger.error("Error during the suppression", ex);
            HibernateUtil.rollbackTransaction();
        }
    }

}
