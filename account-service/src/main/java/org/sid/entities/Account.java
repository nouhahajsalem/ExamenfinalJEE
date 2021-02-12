package org.sid.entities;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import org.sid.service.model.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  private Long code;
	  private Long solde;
	  private Date accountDate;
	  private String type;
	  private String state;
	  @OneToMany(mappedBy = "account")
	  private Collection<Transaction> transactions;
	  private long clientID;
	  @Transient 
	  private Client client;
}


