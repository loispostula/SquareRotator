package lpostula.app.square.session;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lpostula.app.square.dao.ClubDAO;
import lpostula.app.square.dao.ClubDAOImpl;
import lpostula.app.square.entity.Club;
import lpostula.app.square.util.HibernateUtil;

public class ClubManagerImpl implements ClubManager {

    final Logger logger = LoggerFactory.getLogger(ClubManagerImpl.class.getCanonicalName());
    private ClubDAO clubDAO = new ClubDAOImpl();
    
    public Club findByClubName(String Name) {
	Club club = null;
        try {
            HibernateUtil.beginTransaction();
            club = clubDAO.findByName(Name);
            HibernateUtil.commitTransaction();
        } catch (NonUniqueResultException ex) {
            logger.error("Query returned more than one results.", ex);
        } catch (HibernateException ex) {
            logger.error("", ex);
        }
        return club;
    }

    @SuppressWarnings("unchecked")
    public List<Club> loadAllClub() {
	List<Club> allClubs = new ArrayList<Club>();
        try {
            HibernateUtil.beginTransaction();
            allClubs = clubDAO.findAll(Club.class);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            logger.error("", ex);
        }
        return allClubs;
    }

    public void saveNewClub(Club club) {
	try {
            HibernateUtil.beginTransaction();
            clubDAO.save(club);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            logger.error("", ex);
            HibernateUtil.rollbackTransaction();
        }
    }

    public Club findClubById(Integer id) {
	Club club = null;
        try {
            HibernateUtil.beginTransaction();
            club = (Club) clubDAO.findByID(Club.class, id);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            logger.error("", ex);
        }
        return club;
    }

    public void deleteClub(Club club) {
	try {
            HibernateUtil.beginTransaction();
            clubDAO.delete(club);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            logger.error("Error during the suppression", ex);
            HibernateUtil.rollbackTransaction();
        }
    }

}
