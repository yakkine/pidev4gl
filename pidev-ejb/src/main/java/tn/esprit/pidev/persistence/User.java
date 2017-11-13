package tn.esprit.pidev.persistence;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String lastname;
	private String firstname;
	private String email;
	private String cin;
	@Enumerated(EnumType.STRING)
	private Role role;
	private String password;
	@Enumerated(EnumType.STRING)
	private Sexe sexe;
	private int age;
	private float salaire;
	private boolean isValid;
	@OneToMany (mappedBy="user")
	private List <Document> documents;
	@OneToMany (mappedBy="sender")
	private List <Mail> mailsent;
	@OneToMany (mappedBy="receiver")
	private List <Mail> mailreceived;
	@OneToMany (mappedBy="user")
	private List <Task> tasks;
	
	
	
	
	
	
	
	public User(String lastname, String firstname, String email, String cin, Role role, String password, Sexe sexe,
			int age) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.cin = cin;
		this.role = role;
		this.password = password;
		this.sexe = sexe;
		this.age = age;
	}




	public User(String lastname, String firstname,String email, String cin, Role role, String password, Sexe sexe, int age,
			float salaire, boolean isValid) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.cin = cin;
		this.role = role;
		this.password = password;
		this.sexe = sexe;
		this.age = age;
		this.salaire = salaire;
	
		this.isValid = isValid;
	}




	public User(int id, String lastname, String firstname,String email, String cin, Role role, String password, Sexe sexe,
			int age, float salaire, boolean isValid) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.email = email;
		this.firstname = firstname;
		this.cin = cin;
		this.role = role;
		this.password = password;
		this.sexe = sexe;
		this.age = age;
		this.salaire = salaire;
		
		this.isValid = isValid;
	}




	public User() {
		super();
	}













	public User(String lastname, String firstname, String email, String cin, String password, boolean isValid,
			Role role, Sexe sexe, int age, float salaire, Integer id) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.cin = cin;
		this.role = role;
		this.password = password;
		this.sexe = sexe;
		this.age = age;
		this.salaire = salaire;
		this.isValid = isValid;
		this.id = id;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
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




	



	public boolean IsValid() {
		return isValid;
	}




	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}




	public List<Document> getDocuments() {
		return documents;
	}




	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}




	




	public List<Task> getTasks() {
		return tasks;
	}




	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public List<Mail> getMailsent() {
		return mailsent;
	}




	public void setMailsent(List<Mail> mailsent) {
		this.mailsent = mailsent;
	}




	public List<Mail> getMailreceived() {
		return mailreceived;
	}




	public void setMailreceived(List<Mail> mailreceived) {
		this.mailreceived = mailreceived;
	}




	public boolean isValid() {
		return isValid;
	}








	
	
	
	
	
	
	
	
	
	
}