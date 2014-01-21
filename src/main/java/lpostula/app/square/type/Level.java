package lpostula.app.square.type;

public enum Level {
    BASIC_30, 
    MAINSTREAM,
    PLUS, 
    ADVANCED_1, 
    ADVANCED_2, 
    CHALLENGE_1, 
    CHALLENGE_2, 
    CHALLENGE_3_A,
    CHALLENGE_3_B,
    CHALLENGE_4;
    
    @Override 
    public String toString(){
	String s = super.toString();
	s.replace('_', ' ');
	return s.substring(0, 1) + s.substring(1).toLowerCase();
    }
}
