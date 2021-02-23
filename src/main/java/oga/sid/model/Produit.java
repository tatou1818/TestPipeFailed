package oga.sid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	
	@Id
	@GeneratedValue
    private Long id;		
		private String nom;
		private double qte;
		private double prix;

}
