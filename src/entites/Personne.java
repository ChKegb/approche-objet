package entites;
import java.util.*;

public class Personne {
	String nom;
	String prénom;
	AdressePostale adressePersonnelle;

	// constructeur par defaut 
	public Personne() {
		
	}
	// constructeur avec des parametre
	public Personne(String nom,String prénom,AdressePostale adressePersonnelle) {
		this.nom=nom;
		this.prénom=prénom;
		this.adressePersonnelle =adressePersonnelle;
			
	}
	//les getteurs
	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prénom;
	}
	public AdressePostale getAdressePersonnelle() {
		
		return this.adressePersonnelle;
	}
	//les accessuers
	public void setNom(string nom) {
		this.nom=nom;
	}
	public void setPreNom(string prenom) {
		this.prénom=prenom;
	}
 }
