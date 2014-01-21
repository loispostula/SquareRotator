package lpostula.app.square.entity;

//import java.util.HashMap;
//import java.util.Map;
//
//import lpostula.app.square.type.Level;
//import lpostula.app.square.type.Ability;


public class Dancer {
    private int Id;
    private String FirstName;
    private String LastName;
    private Club Club;
//    private Map<Level, Ability> DanceLevel;
    
    public Dancer() {
	
    }
    
    public Dancer( String FirstName, String LastName ) {
	this.FirstName = FirstName;
	this.LastName = LastName;
//	this.DanceLevel = new HashMap<Level, Ability>();
//	this.DanceLevel.put(Level.BASIC_30, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.MAINSTREAM, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.PLUS, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.ADVANCED_1, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.ADVANCED_2, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.CHALLENGE_1, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.CHALLENGE_2, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.CHALLENGE_3_A, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.CHALLENGE_3_B, Ability.NON_DANCER);
//	this.DanceLevel.put(Level.CHALLENGE_4, Ability.NON_DANCER);
    }
    
    public int getId() {
	return Id;
    }
    public void setId(int id) {
	Id = id;
    }
    public String getLastName() {
	return LastName;
    }
    public void setLastName(String lastName) {
	LastName = lastName;
    }
    public String getFirstName() {
	return FirstName;
    }
    public void setFirstName(String firstName) {
	FirstName = firstName;
    }
    public Club getClub() {
	return Club;
    }
    public void setClub(Club club) {
	Club = club;
    }

//    public Map<Level, Ability> getDanceLevel() {
//	return DanceLevel;
//    }
//
//    public void setDanceLevel(Map<Level, Ability> danceLevel) {
//	DanceLevel = danceLevel;
//    }
//    
//    public void setAbility(Level Level, Ability Ability){
//	this.DanceLevel.put(Level, Ability);
//    }
//    
//    public Ability getAbility(Level Level){
//	return this.DanceLevel.get(Level);
//    }
    @Override
    public String toString(){
	return this.getFirstName() + " " + this.getLastName();
    }
}
