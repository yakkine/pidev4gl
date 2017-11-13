package tn.esprit.pidev.presentation.mbeans;

import java.util.Date;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;

import tn.esprit.pidev.persistence.Role;
import tn.esprit.pidev.persistence.Sexe;
import tn.esprit.pidev.persistence.User;
import tn.esprit.pidev.services.UserService;
@ManagedBean
@SessionScoped
public class UserBean {
	
	private String lastname;
	private String firstname;
	@Column(unique=true,nullable=false)
	private String email;
	private String cin;
	private Role role;
	private String password;
	private Sexe sexe;
	private int age;
	private float salaire;
	private Boolean isValid;
	private List<User> users;
	private Integer userIDToBeUpdated;
	@EJB
	UserService userservice;
	
	 public void adduser(){
		 userservice.AjouterUser( new User(lastname,firstname,email,cin,role,password,sexe,age,salaire,isValid));
		   
	   }
	   public List<User> getUsers(){
		   users = userservice.getAllUsers();
		   return users;
	   }
	
	
	   
	   public void DeleteUser(Integer UserID){
		   userservice.UserDeleteByID(UserID);
	   }
	   
	   public void modifier(User user){
		   this.setEmail(user.getEmail());
		   this.setPassword(user.getPassword());
		   this.setLastname(user.getLastname());
		   this.setFirstname(user.getFirstname());
		   this.setSalaire(user.getSalaire());
		   this.setAge(user.getAge());
		   this.setRole(user.getRole());
		   this.setIsValid(user.IsValid());
		   this.setUserIDToBeUpdated(user.getId());
	   }
	public void  mettreAjourUser(){
		userservice.updateUser(new User(lastname,firstname,email,cin,password,isValid,role,sexe,age,salaire,userIDToBeUpdated));
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}

	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Sexe getSexe() {
		return sexe;
	}



	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	
	
	public Boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Integer getUserIDToBeUpdated() {
		return userIDToBeUpdated;
	}
	public void setUserIDToBeUpdated(Integer userIDToBeUpdated) {
		this.userIDToBeUpdated = userIDToBeUpdated;
	}
	
	

}
