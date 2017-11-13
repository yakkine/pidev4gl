package tn.esprit.pidev.interfaces;

import java.util.List;


import tn.esprit.pidev.persistence.Document;
import tn.esprit.pidev.persistence.Todo;

public interface InterfaceDocumentServiceRemote {
	
	
		public void create(Document doc);
	    
	    public List<Document> findAll();

}
