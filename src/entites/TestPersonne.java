package entites;
import java.util.*;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creer instances de la classe Personne en renseignant la valeur de tous les attributs.
		
		Personne p1=new Personne("Jacques","Laurent");
		AdressePostale adresse1= new AdressePostale(34,"avenue banquier",3400,"Montpellier");
		AdressePostale adresse2= new AdressePostale(4,"avenue banquier",3400,"Montpellier");
		p1.setAdressePostale(adresse1);
		System.out.println(p1);
		
		
		// Creation de l'instance en utilisant l'instance de la classe AdressePostale
		
		Personne p2=new Personne("Rolland","Laurent",adresse1);
		System.out.println(p2);
		// Mis à jour de l'adresse de p2
		p2.setAdressePostale(adresse2);
		System.out.println(p2);
		
	}

}
