package lpostula.app.square.session;

import lpostula.app.square.entity.Dancer;

import java.util.List;

public interface DancerManager {
    public Dancer findByDancerName(String FirstName, String LastName);
 
    public List<Dancer> loadAllDancer();
 
    public void saveNewDancer(Dancer dancer);
 
    public Dancer findDancerById(Integer id);
 
    public void deleteDancer(Dancer dancer);

}
