package org.sid.model;

import java.util.Date;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @NoArgsConstructor @AllArgsConstructor
@ToString
public class Transaction {
	 
	  private Long id;
	  private Long num;
	  private Date transDate;
	  private Long montant;
	  private String type;
	  
}