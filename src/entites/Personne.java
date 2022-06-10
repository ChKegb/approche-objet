package entites;
import java.util.*;

public class Personne {
	String nom;
	String prénom;
	AdressePostale adressePersonnelle;

	// constructeur par defaut 
	public Personne(String nom,String prénom,AdressePostale adressePersonnelle) {
		this.nom=nom;
		this.prénom=prénom;
		this.adressePersonnelle =adressePersonnelle;
			
	}
	public String getnom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prénom;
	}
	
    }
