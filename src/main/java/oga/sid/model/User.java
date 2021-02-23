package oga.sid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fournisseur")
public class User {
	@Id
	@GeneratedValue
    private  Long id;
	private  String name;
    private  String email;
    private   SocialProvider provider;
	
	
	    public User(Long id, String name, String email, SocialProvider provider) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.provider = provider;
	}
		public Long getId() {
		return id;
	}
	
		

}
