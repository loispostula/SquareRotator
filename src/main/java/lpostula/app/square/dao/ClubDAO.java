package lpostula.app.square.dao;

import lpostula.app.square.entity.Club;
 
public interface ClubDAO extends GenericDAO<Club, Integer> {
    public Club findByName(String name);
}
