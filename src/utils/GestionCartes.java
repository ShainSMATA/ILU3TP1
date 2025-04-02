package utils;


import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class GestionCartes {
	
	//LES Methode sont static et genreique
	
	public static <E> E extraire(List<E> liste) {
		if(liste == null || liste.isEmpty()) {
			throw new NoSuchElementException("vide ou non existante");
		}
		Random rand = new Random();
        int index = rand.nextInt(liste.size());
        return liste.remove(index);
	}
	
	
	
    // Méthode utilisant un ListIterator
    public static <E> E extraireAvecIterateur(List<E> liste) {
        if (liste == null || liste.isEmpty()) {
            throw new NoSuchElementException("La liste est vide ou nulle.");
        }
        Random rand = new Random();
        int index = rand.nextInt(liste.size());
        ListIterator<E> it = liste.listIterator(index);
        E element = it.next();
        it.remove();
        return element;
    }
    
    
    public static <T> List<T> melanger(List<T> list) {
        // Créer une nouvelle liste pour stocker le résultat mélangé
        List<T> listMelange = new ArrayList<>();
        Random random = new Random();

      
        while (!list.isEmpty()) {
            int randomIndex = random.nextInt(list.size());

            // Extraire l'élément de l'index aléatoire et l'ajouter à la nouvelle liste
            T element = list.remove(randomIndex);

            listMelange.add(element);
        }

        // Retourner la liste mélangée
        return listMelange;
    }
    
    
    
    public static <T> boolean verifierMelange(List<T> list1, List<T> list2) {   
        if (list1.size() != list2.size()) {
            return false;
        }

      
        for (T element : list1) {
            // comprer la frequence de chaque element dans list1 et list2
            if (Collections.frequency(list1, element) != Collections.frequency(list2, element)) {
                return false;
            }
        }

        
        for (T element : list2) {
            // Comparer la fréquence de chaque élément dans list1 et list2
            if (Collections.frequency(list1, element) != Collections.frequency(list2, element)) {
                return false;
            }
        }

        // Si toutes les fréquences correspondent, les listes sont un mélange
        return true;
    }
    
//    public static <T> List<T> rassembler(List<T> list) {
//        // Créer une map pour stocker la fréquence de chaque élément
//        Map<T, Integer> elementCountMap = new HashMap<>();
//        List<T> result = new ArrayList<>();
//
//        // Parcourir la liste d'origine et compter la fréquence de chaque élément
//        for (T element : list) {
//            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
//        }
//
//        // Parcourir la liste d'origine à nouveau pour maintenir l'ordre d'apparition
//        for (T element : list) {
//            // Si l'élément est dans la map, ajouter toutes ses occurrences
//            if (elementCountMap.containsKey(element)) {
//                int count = elementCountMap.get(element);
//                for (int i = 0; i < count; i++) {
//                    result.add(element);
//                }
//                // Retirer l'élément de la map pour ne pas le traiter à nouveau
//                elementCountMap.remove(element);
//            }
//        }
//
//        // Retourner la liste rassemblée
//        return result;
//    }
    public static <T> List<T> rassembler(List<T> list) {
    	List<T> listeRassembler= new ArrayList<>();

        for(ListIterator<T> iter = list.listIterator();iter.hasNext();) {
            T elem = iter.next();
            if (listeRassembler.contains(elem)){
                listeRassembler.add(listeRassembler.lastIndexOf(elem), elem);
            } else {
                listeRassembler.add(elem);
            }
        }

        return listeRassembler;
    }

    
    public static <T> boolean verifierRassemblement(List <T> list) {
    	 ListIterator<T> iterator1 = list.listIterator();
         T curseur = iterator1.next(); 
         while(iterator1.hasNext()) {
        	 T prochain = iterator1.next(); 
        	 if(!curseur.equals(prochain)) {
        		  ListIterator<T> iterator2 = list.listIterator(iterator1.nextIndex());

                // Parcourir le reste de la liste pour voir s'il y a une duplication de currentValue
                while (iterator2.hasNext()) {
                    if (curseur.equals(iterator2.next())) {
                        return false; // Si on retrouve currentValue après un changement, ce n'est pas bien rassemblé
                    }
                }
                // Mettre à jour currentValue à la nouvelle valeur
                curseur = prochain;
            }
        }

        // Si aucune rupture n'est trouvée, c'est bien rassemblé
        return true;
    }
	
	
	
}
