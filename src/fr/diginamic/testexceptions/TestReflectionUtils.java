package fr.diginamic.testexceptions;


public class TestReflectionUtils {

	public static void main(String[] args) throws Exception   {
	/*
	 * Dans cette classe, créez une instance de Ville et invoquez la méthode afficherAttributs de ReflectionUtils avec cette instance de Ville.
	 * */
		Ville ville1=new Ville("Montpellier",340000);
		//invoquez la méthode afficherAttributs de ReflectionUtils avec cette instance de Ville.
		ReflectionUtils.afficherAttributs(ville1);
	}

}
