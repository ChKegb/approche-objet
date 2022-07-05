package fr.diginamic.dates;
import java.text.SimpleDateFormat;
//TP – APPRENDRE A UTILISER LES DATES ET CALENDAR
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		/* Utilisezlaclassejava.util.CalendarpourcréeruneinstancedeDateàladatedu
		19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant :
		*/
		
		Calendar calendrier=Calendar.getInstance();
		
		//initialisation de notre calendrier 
		//calendrier.set(2016, 05, 19, 23, 59, 30);
		calendrier.set(2016, 04, 19);
		
		//recuperons la date à partir du calendrier 
		
		Date date=calendrier.getTime();
		/* affichez-la au format suivant : 
		     jour/mois/année(le mois est toujours en MAjuscule dans l'object Simpleformat
		     
		  */
		
		SimpleDateFormat forme1=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(forme1.format(date));
		
		
		/*
		 * Avec JavaUtil Affichez l’instance ainsi créée au format suivant : ▪ année/mois/jour heure:minute:seconde
		 * */

		//avec java util pour afficher la date du jour 
		SimpleDateFormat forme2=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Calendar calendrier1=Calendar.getInstance();
		Date date1=calendrier1.getTime();
		System.out.println("\n la date du jour :"+ forme2.format(date1));
		
		/*
		 * Affichez la même instance avec le nom des jours et des mois en français, russe, chinois et allemand
		 * EEEE pour le nombre de jour
		 * MMMM pour le nombre de mois 
		 * Locale.pays pour creer plusieur local
		 * 		  
		 * */
		// En france 
		SimpleDateFormat formeNomsFrance=new SimpleDateFormat("EEEE dd MMMM hh:mm:ss",Locale.FRANCE);
		//En chinois 
		SimpleDateFormat formeNomsChinois=new SimpleDateFormat("EEEE dd MMMM hh:mm:ss",Locale.CHINA);
		/* En russe 
		 * si le locale n'existe pas , on fait new Locale("","") pour les creer 
		 * */
		SimpleDateFormat formeNomsRusse=new SimpleDateFormat("EEEE dd MMMM hh:mm:ss",new Locale("ru","RU"));
		
		
		//afficher la date dans les differentes langues
		
		System.out.println("\n la date du jour en français :"+ formeNomsFrance.format(date1));
		System.out.println("\n la date du jour en Russe:"+ formeNomsRusse.format(date1));
		System.out.println("\n la date du jour en Chinois :"+ formeNomsChinois.format(date1));
	}

}
