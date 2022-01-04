package exo_Dichotomie;

import java.util.Arrays;

/* TKL- 4 janv. 2022:
* Déclarer et remplir de façon incrémentale un tableau de 1 Million de cases avec des valeurs croissantes dans l’ordre.

Rechercher une valeur dans le tableau manuellement avec une boucle for
Rechercher une valeur dans le tableau à l’aide d’un algorithme de dichotomie

Chronométrer et comparer les deux solutions

NOTE : Pour remplir le tableau, on utilise l’indice de la case parcourue.

 Chronométrer
long startTime = System.currentTimeMillis();

doReallyLongThing();

long endTime = System.currentTimeMillis();

System.out.println("That took " + (endTime - startTime) + " milliseconds");


*/

public class Main {

	public static void main(String[] args) {
		System.out.println("----------EXO DICHOTOMIE-----------------------");

		// declare un tableau de 1 000 000  valeurs
				int[] tab = new int[1000000];

				System.out.println(" Affichage du tableau de 1 000 000 valeurs");

				System.out.println("Remplir les valeurs incrementale au tableau");
				// ajouter les valeurs valeurs croissantes dans l’ordre et afficher chaque valeur du tableau 
				for (int i=0; i <1000000; i++) {
					tab[i] = i;
					//System.out.print(tab[i]);
				}
				System.out.println("\n FINI 2iem tableau");
		
				// Chronométrer methode 1
				long startTime = System.currentTimeMillis();

				chercherValeurAvecFor(tab);

				long endTime = System.currentTimeMillis();

				System.out.println("Methode FOR prends : " + (endTime - startTime) + " milliseconds");

				// Chronométrer methode 2
				startTime = System.currentTimeMillis();

				chercherValeurAvecDICHOTOMIE(tab);

				endTime = System.currentTimeMillis();

				System.out.println("Methode DICHOTOMI prends : " + (endTime - startTime) + " milliseconds");
				
		

	}
	// Methode 1 :  pour rechercher une valeur dans le tableau manuellement avec une boucle for
	private static void chercherValeurAvecFor(int[] i_tab) {
		
		int  v= 999;
		
		for (int i=0; i <1000000; i++) {
			if (i_tab[i] == v) {
				System.out.println("Trouve la valeur v = "+v + " est au indice "+ i + " avec son valeur est "+ i_tab[i]);
			}
			
		}
		
	}
	
	// Methode 2 :  pour rechercher une valeur dans le tableau à l’aide d’un algorithme de dichotomie
	// on utlise Arrays.binarySearch(tab,key)
		private static void chercherValeurAvecDICHOTOMIE(int[] i_tab) {
			
			int v = 999;
		
			int result = Arrays.binarySearch(i_tab,v);
			
			System.out.println("Trouve la valeur v = "+v + " est au indice "+ result);
				
			
		}
	
	

}
