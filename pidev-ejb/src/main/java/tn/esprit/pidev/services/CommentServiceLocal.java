package tn.esprit.pidev.interfaces;

import java.util.List;

import javax.ejb.Local;


import tn.esprit.pidev.persistence.Comment;
import tn.esprit.pidev.persistence.Document;
import tn.esprit.pidev.persistence.User;

@Local
public interface CommentServiceLocal {
public long documentNonValideJPQL();
	public int ajouterCommentaire(Comment commentaire);

	public void supprimerCommentaire(int commentaireId);

	
	public void updateComment(int idc,String desc);
	
	public List<Comment> showCommentairebyDocument(int  idDocument);
	 
	public Document findDocumentbyid(int id);
	
	public User findUserbyid(int id);
	
	 
	public List <Comment> getAllEmploye() ;
	
	public long documentValideJPQL();
	

}
