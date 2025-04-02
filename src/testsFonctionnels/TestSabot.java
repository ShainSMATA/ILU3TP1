package testsFonctionnels;
import jeu.Sabot;
import cartes.Carte;
import cartes.JeuDeCartes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestSabot {
	public static void main(String[] args) {
		JeuDeCartes jeu = new JeuDeCartes(); 
        Carte[] cartesDuJeu = jeu.creerSabot(); 
        
        Sabot sabot = new Sabot(cartesDuJeu);

//         Partie a)
//        System.out.println("=== Partie a) : Utilisation de piocher() ===");
//        try {
//            while (!sabot.estVide()) {
//                Carte cartePioche = sabot.piocher();
//                System.out.println("Je pioche " + cartePioche);
//            }
//        } catch (NoSuchElementException e) {
//            System.out.println("Erreur : " + e.getMessage());
//        }

        // Partie b)
        try {
            Iterator<Carte> it = sabot.iterator();
            while (it.hasNext()) {
                Carte carte = it.next();
                System.out.println("Je retire " + carte);
                it.remove(); 
                
            }
        } catch (NoSuchElementException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
	}
}