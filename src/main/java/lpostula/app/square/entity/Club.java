package lpostula.app.square.entity;

import java.util.ArrayList;
import java.util.List;


public class Club {
    private int Id;
    private String Name;
    private List<Dancer> Dancers = new ArrayList<Dancer>(0);
    
    public Club(){
	
    }
    
    public Club(String Name) {
	this.Name = Name;
    }
    
    public void addDancer(Dancer dancer){
	this.Dancers.add(dancer);
    }
    
    public int getId() {
	return Id;
    }
    public void setId(int id) {
	Id = id;
    }
    public String getName() {
	return Name;
    }
    public void setName(String name) {
	Name = name;
    }
    public List<Dancer> getDancers() {
	return Dancers;
    }
    public void setDancers(List<Dancer> dancers) {
	Dancers = dancers;
    }
    
    @Override
    public String toString() {
	return this.getName();
    }

}
