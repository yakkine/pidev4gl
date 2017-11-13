package tn.esprit.pidev.presentation.mbeans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import tn.esprit.pidev.persistence.Sexe;
@ManagedBean
@ApplicationScoped
public class Sex {
	public Sexe[] getSexe(){
		return Sexe.values();

}
}
