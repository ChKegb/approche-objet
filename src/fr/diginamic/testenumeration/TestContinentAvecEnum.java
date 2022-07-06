package fr.diginamic.testenumeration;

import java.util.ArrayList;

import listes.Continent;
import listes.Ville;
//TP N°3 –LES ENUMERATIONS:Exercice 2
public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// Créez une liste de villes avec tous les paramètres attendus dont le continent :
		
		ArrayList<Ville> listeVille=new ArrayList<>();
		listeVille.add(new Ville("New York",4000000,Continent.AMERIQUE));
		listeVille.add(new Ville("Paris",8957855,Continent.EUROPE));
		listeVille.add(new Ville("Pékin",1525255,Continent.ASIE));
		listeVille.add(new Ville("Moscou",5865585,Continent.EUROPE));
		listeVille.add(new Ville("Berlin",89586,Continent.EUROPE));
		listeVille.add(new Ville("Sydney",0,Continent.OCEANIE));
		listeVille.add(new Ville("Sao Paulo",58964444,Continent.AMERIQUE));
		listeVille.add(new Ville("Dakar",10,Continent.AFRIQUE));
		
		
		
		//Réalisez une boucle qui affiche l’ensemble des villes avec leur continent respectif
		
		System.out.println("\n l’ensemble des villes avec leur continent respectif \n");
		for(Ville ville:listeVille) {
			System.out.println(ville);
		}

	}

}
