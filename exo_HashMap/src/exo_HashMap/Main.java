package exo_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* TKL- 30 déc. 2021:
* Exercice (HashMap) : HashMap permet de stocker des paires clé et valeur. Les clés ne peuvent pas être dupliquées.
ces méthodes: HashMap.put(K,V) -> mettre le cle K avec son valeur V
 			  HashMap.get(K)   -> appeller la valeur du clef K
 			  HashMap.remove(key)-> remove 1 clef K avec son valeur

Déclarer une hashmap, ayant comme clef un type Integer et comme valeur un type String

Ajouter dans la HashMap trois valeurs :
1 - Minou
2 - Milou
3 - Médor

Écrire un foreach permettant de parcourir toute la hashmap et d’afficher la clef et la valeur de chaque élément avec un System.out.println()

Retirer de la HashMap la clef 2. 
Afficher le contenu de toute votre HashMap
Modifier la valeur de la clef numéro 3 et mettre la valeur null
Afficher à nouveau le contenu de toute votre HashMap

*/
public class Main {

	
	public static void main(String[] args) {
		
		System.out.println("\n----------Exercice (HashMap)-------------------\n");

		// Déclarer une hashmap, ayant comme clef un type Integer et comme valeur un type String
		Map<Integer, String> person = new HashMap<Integer, String>();
		 
		//Ajouter dans la HashMap trois valeurs 
		person.put(1, "Minou");
		person.put(2, "Milou");
		person.put(3, "Médor");
		
		// Prendre 1 tableau de cles du objet Hashmap
		Set<Integer> personKey= person.keySet();
		
		System.out.println(" Affichage liste des elements dans HashMap par fonction foreach: ");
		
		// Afficher chaque element du hashmap grace au fonction foreach
		for (Integer i : personKey) {
			System.out.println(" Element "+i+ " - " + person.get(i));
		}
		
		// Retirer de la HashMap la clef 2
		person.remove(2);
		
		System.out.println("\n Affichage liste des elements dans HashMap apres avoir retire la clef 2:");
		
		System.out.println(person);
		
		// Modifier la valeur de la clef numéro 3 et mettre la valeur null
		person.put(3, null);
		
		// Afficher à nouveau le contenu de toute votre HashMap
		System.out.println("\n Affichage liste des elements dans HashMap apres avoir mis la valeur du clef 3 est null:");
		System.out.println(person);
		
	}
}
