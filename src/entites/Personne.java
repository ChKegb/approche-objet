package entites;
import java.util.*;

public class Personne {
	String nom;
	String pr�nom;
	AdressePostale adressePersonnelle;

	// constructeur par defaut 
	public Personne(String nom,String pr�nom,AdressePostale adressePersonnelle) {
		this.nom=nom;
		this.pr�nom=pr�nom;
		this.adressePersonnelle =adressePersonnelle;
			
	}
	public String getnom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.pr�nom;
	}
	
    }
