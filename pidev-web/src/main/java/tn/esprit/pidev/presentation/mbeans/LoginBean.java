package tn.esprit.pidev.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


import tn.esprit.pidev.persistence.Role;
import tn.esprit.pidev.persistence.User;
import tn.esprit.pidev.services.UserService;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {
	private String login;
	private String password;
	private User user;
	private Boolean loggedIn; 
	
	
	
	@EJB
	UserService userservice;
	
	public String doLogin(){
		String navigateTo = null;
		user = userservice.getUserByEmailAndPassword(login,password);
		FacesContext.getCurrentInstance().addMessage("form:btn",new FacesMessage("bad Credentials"));

		if(user != null && user.getRole()==Role.administrateur){
			if(user != null ){
			navigateTo = "/pages/admin/accueiladmin?faces-redirect=true";
			loggedIn=true;
			}}
		else  {
				if(user != null && user.getRole()==Role.ingenieur){
				if(user != null ){
				navigateTo = "/pages/admin/connectuser?faces-redirect=true";
				loggedIn=true;
			}}}
		  {
			if(user != null && user.getRole()==Role.chefDepartement ){
			if(user != null ){
			navigateTo = "/pages/admin/connectuser?faces-redirect=true";
			loggedIn=true;
		}}}
		  
			 {
			FacesContext.getCurrentInstance().addMessage("form:btn",new FacesMessage("bad Credentials"));
		}
			
		return navigateTo;
		
		
	}

	
	public String doLogout(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}



}
