package tn.esprit.pidev.presentation.mbeans;

import java.io.IOException;
import java.util.Date;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.servlet.http.Part;

import tn.esprit.pidev.persistence.Mail;
import tn.esprit.pidev.persistence.User;
import tn.esprit.pidev.services.MailService;

@ManagedBean
@SessionScoped
public class MailBean {
	
		
		private String rec;
		private String subject;
		private String context;
		private Date sentdate;
		private User receiver;
		private String receivermail;
		private User sender;
		private List<Mail> mails;
		private List<Mail> mailsent;
		private Part file;
		private String x;
		private Mail m;
		
		public String navigateto;
		
		
		
		
		
		@EJB
		MailService mailservice;
		
		 public void addmail(){
			 sender=mailservice.getUserById(1);
			 receiver=mailservice.getUserByMail(receivermail);
			 mailservice.ajoutermail( new Mail(subject,new Date(),context, receiver,sender));
			   
		   }
		 public List<Mail> getMailsent(){
			 mailsent = mailservice.getSent();
			 return mailsent;
		 }
		 public List<Mail> getMails(){
			   mails = mailservice.getReceived(1);
			   return mails;
		   }
		
		
		   
		   public void DeleteMail(Integer mailID){
			   mailservice.MailDeleteByID(mailID);
		   }
		   /*
		   public void showMail(Integer mailID){
			   mailservice.MailShowByID(mailID);
		   }
		   */
		   
		   
		   public void suppmail(int id){
				
		       
			mailservice.supprimermail(id);
			     
			}
		   
		   public String show (int id){
			   
			   m=mailservice.getMailById(id);
			   this.setSender(m.getSender());
			   this.setReceiver(m.getReceiver());
			   this.setSubject(m.getSubject());
			   this.setSentdate(m.getSentdate());
			   this.setContext(m.getContext());
			   
			   
			   navigateto="/pages/admin/details?faces-redirect=true";
			   return navigateto;
			   
		   }
		   
		   
		   
		   
		   
		public String getRec() {
			return rec;
		}
		public void setRec(String rec) {
			this.rec = rec;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getContext() {
			return context;
		}
		public void setContext(String context) {
			this.context = context;
		}
		public Date getSentdate() {
			return sentdate;
		}
		public void setSentdate(Date sentdate) {
			this.sentdate = sentdate;
		}
		public MailService getMailservice() {
			return mailservice;
		}
		public void setMailservice(MailService mailservice) {
			this.mailservice = mailservice;
		}
		public void setMails(List<Mail> mails) {
			this.mails = mails;
		}
		public User getReceiver() {
			return receiver;
		}
		public void setReceiver(User receiver) {
			this.receiver = receiver;
		}
		public User getSender() {
			return sender;
		}
		public void setSender(User sender) {
			this.sender = sender;
		}
	
		public String getReceivermail() {
			return receivermail;
		}
		public void setReceivermail(String receivermail) {
			this.receivermail = receivermail;
		}
		public void setMailsent(List<Mail> mailsent) {
			this.mailsent = mailsent;
		}
		
		
		
		
		
		
		
		public Part getFile() {
			return file;
		}
		public void setFile(Part file) {
			this.file = file;
		}
		public String getX() {
			return x;
		}
		public void setX(String x) {
			this.x = x;
		}
		
		
		
		
		
		
		
		
		
		private static String getFileName(Part part) {
		    for (String cd : part.getHeader("content-disposition").split(";")) {
		        if (cd.trim().startsWith("filename")) {
		            String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
		            return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
		        }
		    }
		    return null;
		}
		
		
		public void save() throws IOException {
			file.write("C:\\Users\\Kochbati Yakine\\JavaEE\\pidev\\pidev-web\\src\\main\\webapp\\dsi\\"+getFileName(file));
		    	/* x="C:\\Users\\Kochbati Yakine\\JavaEE\\pidev\\pi-web\\src\\main\\webapp\\DSI\\"+getFileName(file);*/
		   
		}
		
		
		
		
		   

}