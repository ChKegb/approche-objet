package entites;
import java.util.*;

public class Personne {
	String nom;
	String pr�nom;
	AdressePostale adressePersonnelle;

	// constructeur par defaut 
	public Personne() {
		
	}
	// constructeur avec des parametre
	public Personne(String nom,String pr�nom,AdressePostale adressePersonnelle) {
		this.nom=nom;
		this.pr�nom=pr�nom;
		this.adressePersonnelle =adressePersonnelle;
			
	}
	//les getteurs
	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.pr�nom;
	}
	public AdressePostale getAdressePersonnelle() {
		
		return this.adressePersonnelle;
	}
	//les accessuers
	public void setNom(string nom) {
		this.nom=nom;
	}
	public void setPreNom(string prenom) {
		this.pr�nom=prenom;
	}
 }
