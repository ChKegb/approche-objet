package fr.diginamic.banque;
//Tp 9 INTERFACES


import interfaces.Cercle;
import interfaces.ObjetGeometrique;
import interfaces.Rectangle;


public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		Cercle c1=new Cercle(15.0);
		System.out.println("\n Le perimetre du cercle est :"+ c1.perimetre()+"\n la surface du cercle est :"+ c1.surface());
		Rectangle r1=new Rectangle(15.0, 10.0);
		System.out.println("\n Le perimetre du Rectangle  est :"+ r1.perimetre()+"\n la surface du Rectangle est :"+ r1.surface());
		
		ObjetGeometrique [] tab ={c1,r1};
		
		//Faites une boucle pour afficher le périmètre et la surface de chaque objet.
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i].toString());
					
		}
		
	
	}

}
