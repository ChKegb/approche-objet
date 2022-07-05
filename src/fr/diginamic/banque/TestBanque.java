package fr.diginamic.banque;
import fr.diginamic.banque.entites.*;
// Tp5 : METTRE EN PLACE LES REGLES DE L’ENCAPSULATION
//TP 7: HERITAGE ET CONSTRUCTEURS
 
public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//créez une instance de la classe Compte avec un numéro et un solde de votre choix .
		
		Compte cp1=new Compte(345,5698.89);
		Compte cp2=new CompteTaux(258, 5896.85, 9);
		System.out.println(cp1.toString());
		
		
		//Créez un tableau de comptes. Dans ce tableau, stockez 2 instances de comptes :
		Compte[] tab1= {cp1,cp2};
		
		for(int i=0;i<tab1.length;i++) {
			System.out.println(tab1[i].toString());
		}
		
	}

}
