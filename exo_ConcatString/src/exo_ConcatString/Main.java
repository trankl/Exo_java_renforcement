package exo_ConcatString;

/* TKL- 20 déc. 2021:
 * Dans votre méthode public static void main déclarer deux Strings :
String l_str_nom = “Einstein”;
String l_str_prenom = “Albert”;

Déclarer maintenant une troisième String et lui attribuer la valeur de la concaténation du nom et du prénom séparé par un espace

NOTE : Vous pouvez utiliser l’opérateur “+” pour concaténer deux Strings
BONUS : Chercher et implémenter d’autres méthodes de concaténation.

Il y a quatre façons pour concaténer des String en Java:
1- L'opérateur de concaténation '+'
2- La fonction String.concat()
3- La classe StringBuilder.
4- La classe StringBuffer.

 */


public class Main {

	public static void main(String[] args) {

		String l_str_nom = "Einstein";
		String l_str_prenom = "Albert";

		// Methode 1- L'opérateur de concaténation '+'
		System.out.println("----------Methode 1- L'opérateur de concaténation '+'----------\n ");
		String l_str_fullNom = l_str_nom + " " + l_str_prenom;
		System.out.println( " Affichage la 3ieme String = " + l_str_fullNom);


		// Methode 2- La fonction String.concat()
		System.out.println("\n----------Methode 2- La fonction String. concat()----------\n ");
		
		String newPhase = l_str_nom;
		newPhase = newPhase.concat(" ");
		newPhase = newPhase.concat(l_str_prenom);
		System.out.println( " Affichage la 3ieme String = " + newPhase);
		
		
		// Methode 3- La classe StringBuilder 
		// Ce moyen de concaténation réduit les coûts de mémoire et de temps parce qu'il ne va pas générer des objets String. 
		// En fait, vous devez toujours utiliser StringBuilder au lieu de StringBuffer 
		// parce qu'il a les mêmes fonctionnalités mais sans synchronisation, ce qui veut dire une opération plus rapide.
		System.out.println("\n----------Methode 3- La classe StringBuilder.----------\n ");
		String resultat  = new StringBuilder().append(l_str_nom).append(" ").append(l_str_prenom).toString();
		System.out.println( " Affichage la 3ieme String = " + resultat);

	
		// Methode 4-  La classe StringBuffer
		System.out.println("\n----------Methode 4- La classe StringBuffer.----------\n ");
		String resultatAvecBuffer  = new StringBuffer().append(l_str_nom).append(" ").append(l_str_prenom).toString();
		System.out.println( " Affichage la 3ieme String = " + resultatAvecBuffer);


	}

}
