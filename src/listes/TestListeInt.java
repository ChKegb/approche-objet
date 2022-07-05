package listes;

import java.util.ArrayList;
import java.util.Iterator;

//Tp 10 APPRENDRE A UTILISER LIST ET ARRAYLIST


public class TestListeInt {

	public static void main(String[] args) {
		// instanciez une ArrayList d’entiers et placez y les éléments suivants : -1, 5, 7, 3, -2, 4, 8, 5
	   ArrayList<Integer> liste=new ArrayList<>();
	   liste.add(-1);
	   liste.add(5);
	   liste.add(7);
	   liste.add(3);
	   liste.add(-2);
	   liste.add(4);
	   liste.add(8);
	   liste.add(5);
	   
	   //Affichez tous les éléments de la liste
	   System.out.println(liste);
	   //Affichez la taille de la liste
	   System.out.println("\n la taille de la liste est :"+liste.size());
	   //Recherchez et affichez le plus grand élément de la liste
	   int max=0;
	   for(int i : liste) {
		 if(i>max) {
			 max=i;
		 }
	   }
	   System.out.println("\n la valeur maximale est :"+max);
	   
	   // Supprimant le plus petit element de la liste en utilisant les boucles 
	   
	   int min=0;
	   int index=0;
	   for(int i=0;i<liste.size();i++) {
		   if(liste.get(i) < min) {
			   min=liste.get(i);
			   
			   index=i;		   
;		   }
	   }
	   // affichant la valeur min
	   System.out.println(min);
	   // affichant l'index de la valeur min
	   System.out.println("\n l'index de la valeur min :"+index);
	   // suprimons le plus petit valeur en utilisant l'index pointe sur la valeur
	   liste.remove(index);
	   // affichant la nouvelle liste apres avoir supprimer le plus petit valeur
	   System.out.println("\n la nouvelle liste est :"+liste);
	   
	   //Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs
	  
	   
	   for(int i=0;i<liste.size();i++) {
		   int val=liste.get(i);
		   if(val < 0) {
			   val=liste.set(i, -val);
		   }
		
	   }
	   //Affichez enfin la liste résultante
	   System.out.println("\n la liste positve est :"+ liste);
	
	
	
	}

}
