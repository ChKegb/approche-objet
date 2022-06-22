package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation op1=new Credit("01/06/2022", 1500);
		Operation op2=new Credit("01/07/2022", 1600);
		Operation op3=new Credit("01/08/2022", 1700);
		Operation op4=new Credit("01/09/2022", 1800);
		Operation deb1=new Debit("01/10/2022", 100);
		
		Operation[] tab1= {op1,op2,op3,op4,deb1};
		
		//Calculez enfin le montant global de toutes les opérations
		
		double montant_global=0;
		for(int i=0;i<tab1.length;i++) {
			System.out.println(tab1[i]);
			
			if(tab1[i].getType()=="CREDIT") {
				montant_global=montant_global+tab1[i].getMontantOpération();
			}else {
				montant_global=montant_global+tab1[i].getMontantOpération();
			}
		}
		System.out.println("\n le montant global est :" + montant_global);
		
		
		
	}

}
