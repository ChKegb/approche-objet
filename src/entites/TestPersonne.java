package entites;
import java.util.*;
public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cr�er 2 instances de la classe Personne en renseignant la valeur de tous les attributs.
		Personne p1=new Personne();
		Personne p2=new Personne();
		p1.nom ="Jacques";
		p1.pr�nom ="Laurent";
		// les affectations de l'instances de personne li�es � la classe adresseP
		p1.adressePersonnelle.code_postal=34970 ;
		p1.adressePersonnelle.libell�_de_la_rue="test";
		p1.adressePersonnelle.num�ro_de_rue=25;
		p1.adressePersonnelle.ville ="Lattes";
	}

}
