package tn.esprit.pidev.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.pidev.persistence.User;



@Remote
public interface InterfaceUserServiceRemote {
	
	public int AjouterUser(User User);
	public User getUserByEmailAndPassword(String email,String password);
	public List<User> getAllUsers() ;
	public void UserDeleteByID(Integer userID);
	public void updateUser(User User);

}
