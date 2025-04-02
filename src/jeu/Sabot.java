package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot implements Iterable<Carte> {
    private Carte[] cartes;
    private int nbCartes; 
    private int capaciteMax; 
    private int nombreOperation = 0; 

    public Sabot(Carte[] cartes) {
        this.cartes = cartes;
        this.nbCartes = cartes.length;
        this.capaciteMax = cartes.length;
    }

    public Carte[] getCartes() {
        return cartes;
    }

    
    public int getNbCartes() {
        return nbCartes;
    }
    
    
    
    
    
    
    
    
    
    
    
    


    public boolean estVide() {
        return nbCartes == 0;
    }


    public void ajouterCarte(Carte carte) throws Exception {
        if (nbCartes >= capaciteMax) {
            throw new Exception("");
        }
        cartes[nbCartes] = carte; 
        nbCartes++; 
        nombreOperation++;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    public Carte piocher() {
        Iterator<Carte> it = this.iterator();
        if (it.hasNext()) {
            Carte premiereCarte = it.next(); 
            it.remove(); 
            return premiereCarte; 
        } 
        else {
            throw new NoSuchElementException("Le sabot est vide, impossible de piocher.");
        }
    }

    @Override
    public Iterator<Carte> iterator() {
    	return new SabotIterator();
    }

   
    private class SabotIterator implements Iterator<Carte> {
        private int indice = 0; 
        private int nombreOperationEsperer = nombreOperation; 
        private boolean nextEffectue = false; 

      
        public boolean hasNext() {
            return indice < nbCartes;
        }

        
        public Carte next() {
          
            if (hasNext()) {
                Carte carte = cartes[indice]; 
                indice++; 
                nextEffectue = true; 
                return carte;
            }
            throw new NoSuchElementException("Plus de cartes dans le sabot.");
        }

      
        public void remove() {
            if (!nextEffectue) {
                throw new IllegalStateException("");
            }
            for (int i = indice - 1; i < nbCartes - 1; i++) {
                cartes[i] = cartes[i + 1]; 
            }
            cartes[nbCartes - 1] = null; 
            nbCartes--; 
            indice--; 
            nextEffectue = false; 
            nombreOperation++; 
        }

      
        private void verifConcurence() {
            if (nombreOperationEsperer != nombreOperation) {
                throw new ConcurrentModificationException("concurent");
            }
        }
    }
}