package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
        
        long debut = System.currentTimeMillis(); 
        
        StringBuilder sr=new StringBuilder();
        
        for(int i=1;i<100000;i++) {
    	 sr.append(i);
        }
      
      
        
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}