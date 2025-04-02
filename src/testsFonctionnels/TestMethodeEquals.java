package testsFonctionnels;

import cartes.Borne;

public class TestMethodeEquals {
	
	
	public static void main(String[] args) {
        Borne borne1 = new Borne(25);
        Borne borne2 = new Borne(25);
        System.out.println("Deux cartes de 25km sont identiques ? " + borne1.equals(borne2));
		
		
		
		
	}
	
	
	

}
