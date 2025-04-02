package cartes;

import java.util.ArrayList;
import java.util.List;

public class JeuDeCartes {
	private Configuration[] configurations = new Configuration[19]; 
	
					
	public String afficherJeuDeCartes() {
		StringBuilder maChaine = new StringBuilder(); 
		for(int i = 0; i < 19; i++) {
			System.out.println(configurations[i].getNbExemplaire() + " " + configurations[i].getCarte());
			//maChaine.append(configurations[i].getNbExemplaire() + " " + configurations[i].getCarte()); 
		}
		return maChaine.toString();
		
	}
	
	
	public JeuDeCartes() {
		configurations[0] =  new Configuration(new Borne(25), 10); 
		configurations[1] =  new Configuration(new Borne(50), 10); 
		configurations[2] =  new Configuration(new Borne(75), 10); 
		configurations[3] =  new Configuration(new Borne(100), 12); 
		configurations[4] =  new Configuration(new Borne(200), 4);
		
		configurations[5] =  new Configuration(new Parade(Type.FEU), 14); 
		
		configurations[6] =  new Configuration(new FinLimite(), 6); 
		configurations[7] =  new Configuration(new Parade(Type.ESSENCE), 6);
		configurations[8] =  new Configuration(new Parade(Type.CREVAISON), 6);
		configurations[9] =  new Configuration(new Botte(Type.ACCIDENT), 6);
		
		configurations[10] =  new Configuration(new Attaque(Type.FEU), 5);
		
		configurations[11] =  new Configuration(new DebutLimite(), 4);
		
		configurations[12] =  new Configuration(new Attaque(Type.ESSENCE), 3);
		configurations[13] =  new Configuration(new Attaque(Type.CREVAISON), 3);
		configurations[14] =  new Configuration(new Attaque(Type.ACCIDENT), 3);
		
		configurations[15] =  new Configuration(new Botte(Type.FEU), 1);
		configurations[16] =  new Configuration(new Botte(Type.ESSENCE), 1);
		configurations[17] =  new Configuration(new Botte(Type.CREVAISON), 1);
		configurations[18] =  new Configuration(new Botte(Type.ACCIDENT), 1);

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//configurartion sert que a jeu de carte donc on cree une class interne
	
	private static class Configuration{
		private Carte carte; 
		private int nbExemplaire;
		
		
		public Configuration(Carte carte, int nbExemplaire) {
			this.carte = carte;
			this.nbExemplaire = nbExemplaire;
		}

		public Carte getCarte() {
			return carte;
		}
		
		public int getNbExemplaire() {
			return nbExemplaire;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Carte[] creerSabot() {
		Carte[] sabot = new Carte[106]; 
		int nbCartes = 0; 
		
		for(Configuration jeu : configurations) {
			for (int i = 0; i < jeu.getNbExemplaire(); i++) {
				sabot[nbCartes] = jeu.getCarte(); 
				nbCartes ++; 
			}
		}
		return sabot; 
	}
}
