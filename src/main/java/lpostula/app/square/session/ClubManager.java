package lpostula.app.square.session;

import java.util.List;

import lpostula.app.square.entity.Club;

public interface ClubManager {
    public Club findByClubName(String Name);
    
    public List<Club> loadAllClub();
 
    public void saveNewClub(Club club);
 
    public Club findClubById(Integer id);
 
    public void deleteClub(Club club);

}
