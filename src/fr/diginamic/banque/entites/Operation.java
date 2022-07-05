package fr.diginamic.banque.entites;

import java.sql.Date;

public abstract class Operation {
	//les attributs de la classes Operations 
	private String date_operation;
	private double montantOpération;
	
	
	// le constructeur avec des parametres 
	
	public Operation(String date_operation, double montantOpération) {
		super();
		this.date_operation = date_operation;
		this.montantOpération = montantOpération;
	}

	

	@Override
	public String toString() {
		return "Operation [date_operation=" + date_operation + ", montantOpération=" + montantOpération + ", getType()="
				+ getType() + "]";
	}



	// les getters
	public String getDate_operation() {
		return date_operation;
	}
	public double getMontantOpération() {
		return montantOpération;
	}
	//Dans la classe Operation, ajoutez la méthode abstraite suivante : String getType()
	
	public abstract String getType();
		
	
    
	// les setters
	
	public void setDate_operation(String date_operation) {
		this.date_operation = date_operation;
	}

	

	public void setMontantOpération(double montantOpération) {
		this.montantOpération = montantOpération;
	}

	
	
	
	
	
	
	
	
	

}
