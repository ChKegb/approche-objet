package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class FusionMap {

	public static void main(String[] args) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>(); 
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		//Créer une map appelée map3 et qui contient l’ensemble des données des 2 maps précédentes avec les mêmes clés et les mêmes valeurs
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		//Dans le cas ou ils ont meme type 
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println(map3);
		
		
		
		
		
		
	}

}
