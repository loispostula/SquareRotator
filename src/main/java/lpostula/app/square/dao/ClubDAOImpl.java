package lpostula.app.square.dao;


import lpostula.app.square.entity.Club;
import lpostula.app.square.util.HibernateUtil;

import org.hibernate.Query;

public class ClubDAOImpl  extends GenericDAOImpl<Club, Integer> implements ClubDAO {

    public Club findByName(String name) {
	Club club = null;
        String sql = "SELECT c FROM Club c WHERE c.Name = :name";
        Query query = HibernateUtil.getSession().createQuery(sql).setParameter("name", name);
        club = findOne(query);
        return club;
    }
}