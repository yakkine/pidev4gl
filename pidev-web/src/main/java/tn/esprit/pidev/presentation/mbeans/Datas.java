package tn.esprit.pidev.presentation.mbeans;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import tn.esprit.pidev.persistence.*;

@ManagedBean
@ApplicationScoped
public class Datas {
	
	public Role[] getRoles(){
		return Role.values();
		
		
	}

}