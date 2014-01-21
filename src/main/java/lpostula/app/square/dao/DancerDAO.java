package lpostula.app.square.dao;


import lpostula.app.square.entity.Dancer;
 
public interface DancerDAO extends GenericDAO<Dancer, Integer> {
    public Dancer findByName(String FirstName, String LastName);
}
