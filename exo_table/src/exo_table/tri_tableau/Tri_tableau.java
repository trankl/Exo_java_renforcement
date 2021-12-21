package exo_table.tri_tableau;

import java.util.Arrays;

/* TKL- 21 déc. 2021:
* A partir du tableau fourni, 
* créer un nouveau tableau et y reporter les valeurs de façon triées du plus petit au plus grand par une programmation automatique. 
* L’algorithme que vous implémenterez doit être capable de trier n’importe quel tableau.

Afficher les valeurs triées. (Vous pouvez séparer les valeurs avec un PIPE « | »)
Résultat attendu :
-13298|-13|-12|1|6|9|9|67|189|456865|
BONUS : Renseignez-vous sur les algorithmes de tri de données.
BONUS : Implémenter un programme qui utilise un algorithme de tri déjà existant

*/


public class Tri_tableau {

	public static void main(String[] args) {
		System.out.println("----------EXO TRI TABLEAU-----------------------");

		// declare un tableau de 10  valeurs
		int[] tab = new int[]{1,9,6,189,-12,-13, 67, 456865, -13298, 9};
		System.out.println(" Affichage du tableau de 1 000 000 valeurs");
		// afficher chaque valeur du tableau 
		for (int i=0; i <tab.length; i++) {
			System.out.print(tab[i] +" | ");
		}
		// Methode 1: utiliser programmation
		trierTableau(tab);
		
		System.out.println("\n \nMethode1: Affichage du tableau apres triées du plus petit au plus grand");
		
		for (int i=0; i <tab.length; i++) {
			System.out.print(tab[i] + " | ");
		}
		
		// Methode 2: utiliser fonction sort()
		tab = new int[]{1,9,6,189,-12,-13, 67, 456865, -13298, 9};
		
		Arrays.sort(tab);
		
		System.out.println("\n \nMethode 2: Affichage du tableau apres triées du plus petit au plus grand");
		
		for (int i=0; i <tab.length; i++) {
			System.out.print(tab[i] + " | ");
		}
	}

	// Methode de trier 1 taleau de plus petit au plus grand
	public static int[] trierTableau (int[] tabATrier) {
		
	
		for (int i =0; i<tabATrier.length; i++) {
			for (int j =0; j<tabATrier.length; j++)
			if (tabATrier[i]<tabATrier[j]) {
				int t = tabATrier[i];
				tabATrier[i]=tabATrier[j];
				tabATrier[j] = t;
			}
		}
		
		return tabATrier;
	}
}
