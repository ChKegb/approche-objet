package utils;
import java.lang.Integer ;
import java.util.Scanner;
// TP N°4  UTILISATION DE METHODES STATIC EXISTANTES
public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "12";
		// Utilisons une méthode de la classe java.lang.Integer pour  convertir une chaîne de caractères en entier.
		int convert = Integer.parseInt(chaine);
		System.out.println(convert);
		int a,b;
		Scanner console=new Scanner(System.in);
		System.out.println("\n Veuillez saisir la valeur de a :");
		a=console.nextInt();
		console.nextLine();
		System.out.println("\n Veuillez saisir la valeur de b :");
		b=console.nextInt();
		console.nextLine();
		console.close();
		// Utilisons une méthode de la classe Integer pour calculer le nombre maximum entre a et b.
		int maximun=Integer.max(a,b);
		System.out.println("\n la valeur maximun est :"+ maximun);
	}



}