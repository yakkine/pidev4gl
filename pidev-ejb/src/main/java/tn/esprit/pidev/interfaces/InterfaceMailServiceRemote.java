package tn.esprit.pidev.interfaces;

import java.util.List;


import javax.ejb.Remote;

import tn.esprit.pidev.persistence.Mail;

@Remote
public interface InterfaceMailServiceRemote {
	
	 
	 
	 public void MailDeleteByID(Integer mailID);
	 public List<Mail> getSent();

	 public int ajoutermail(Mail mail);
	 public List<Mail> getReceived(int id);
	 public void supprimermail(int id);
	 /*
	 private static String getFileName(Part part);
*/
	 public Mail getMailById(int id);
}
