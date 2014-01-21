package lpostula.app.square.type;

public enum Ability {
    NON_DANCER , NEOPHYTE, DANCER, ADVANCED_DANCER, LIMIT;
    
    @Override 
    public String toString(){
	String s = super.toString();
	s.replace('_', ' ');
	return s.substring(0, 1) + s.substring(1).toLowerCase();
    }
}
