package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
        
        long debut = System.currentTimeMillis(); 
        //Danscetteclasse,ajouteztouslesnombresde1à100000dansuneinstancede StringBuilder.
        StringBuilder str=new StringBuilder();
        
        for(int i=1;i<100000;i++) {
    	 str.append(i);
        }
        System.out.println(str);
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}
