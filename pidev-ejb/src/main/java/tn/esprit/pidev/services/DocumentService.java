package tn.esprit.pidev.services;

import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.pidev.interfaces.InterfaceDocumentServiceRemote;
import tn.esprit.pidev.persistence.Document;


@Stateless
public class DocumentService implements InterfaceDocumentServiceRemote {
	@PersistenceContext
	private EntityManager em;

    public DocumentService() {
    }
    @Override
    public void create(Document doc) {
		em.persist(doc);
	}
    @Override
    public List<Document> findAll() {
		return em.createQuery("from Document", Document.class).getResultList();
	}

}
