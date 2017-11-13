package tn.esprit.pidev.persistence;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Document {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private String path;
	private String size;
	private String name;
	private Date datesubmit;
	
	
	@ManyToOne
	private User user;
	
	public Document(int id, String path, String size, String name, Date datesubmit) {
		super();
		this.id = id;
		this.path = path;
		this.size = size;
		this.name = name;
		this.datesubmit = datesubmit;
	}
	public Document() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDatesubmit() {
		return datesubmit;
	}
	public void setDatesubmit(Date datesubmit) {
		this.datesubmit = datesubmit;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
