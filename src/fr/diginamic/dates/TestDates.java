package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creer une instance avec la date du jour 
		Date date =new Date();
		// afficher une instance de la classe java.util.Date à la date du jour en utilisantundeses constructeurs
		System.out.println(date);
		//Affichez l’instance ainsi créée au format suivant :jour/mois/année
		Date date1=new Date(116,04,19);
		System.out.println("\n date au format jour/mois/année " + date1);
		// autre façon avec object SimpleDateFormat en rentrant en parametre les  informations 
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		//affichage de la date du format de jour avec instance creer
		System.out.println("\n test :"+  format.format(date));
		
		//Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30secondes
		
		Date date2=new Date(116,04,19,23,59,30);
		
		//Affichez l’instance ainsi créée au format suivant : ▪ année/mois/jour heure:minute:seconde
		System.out.println("\n date au format jour/mois/année heure:minute:seconde " + date2);
		//DEFINISSANT LA DATE AVEC OBJECT SIMPLEFORMAT
		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("\n test :"+  format.format(date2));
		Calendar calendrier=Calendar.getInstance();
		calendrier.set(2016, 05, 19);

	}

}
