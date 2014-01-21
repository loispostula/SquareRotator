package lpostula.app.square.dao;


import lpostula.app.square.entity.Dancer;
import lpostula.app.square.util.HibernateUtil;


import org.hibernate.Query;
 
public class DancerDAOImpl extends GenericDAOImpl<Dancer, Integer> implements DancerDAO {

    public Dancer findByName(String FirstName, String LastName) {
	Dancer dancer = null;
        String sql = "SELECT d FROM Dancer d WHERE d.FirstName = :firstname AND d.LastName = :lastname";
        Query query = HibernateUtil.getSession().createQuery(sql).setParameter("firstname", FirstName).setParameter("lastname", LastName);
        dancer = findOne(query);
        return dancer;
    }
}