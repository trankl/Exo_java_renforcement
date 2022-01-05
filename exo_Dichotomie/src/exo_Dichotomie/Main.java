package exo_Dichotomie;

import java.util.Arrays;

/* TKL- 4 janv. 2022:
 * Déclarer et remplir de façon incrémentale un tableau de 1 Million de cases avec des valeurs croissantes dans l’ordre.

Rechercher une valeur dans le tableau manuellement avec une boucle for
Rechercher une valeur dans le tableau à l’aide d’un algorithme de dichotomie

Attention: algorithme de dichotomie fonction que les tableaux triés dans ordre. 

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
		int valeurAchercher= 999999; 

		// Chronométrer methode 1
		long startTime = System.currentTimeMillis();

		chercherValeurAvecFor(tab, valeurAchercher);

		long endTime = System.currentTimeMillis();

		System.out.println("Methode FOR prends : " + (endTime - startTime) + " milliseconds");

		
		
		// Chronométrer methode 2
		startTime = System.currentTimeMillis();

		chercherValeurAvecDICHOTOMIE(tab, valeurAchercher);

		endTime = System.currentTimeMillis();

		System.out.println("Methode DICHOTOMI prends : " + (endTime - startTime) + " milliseconds");



	}
	// Methode 1 :  pour rechercher une valeur dans le tableau manuellement avec une boucle for
	private static void chercherValeurAvecFor(int[] i_tab, int  valeur) {


		int nboperation = 0; 
		
		for (int i=0; i <i_tab.length; i++) {
			nboperation++;
			if (i_tab[i] == valeur) {
				System.out.println("Trouve la valeur v = "+valeur + " est au indice "+ i + " avec son valeur est "+ i_tab[i]);
				break;
			}

		}
		System.out.println("nombre operation pour le boucle for est " + nboperation);

	}

	// Methode 2 :  pour rechercher une valeur dans le tableau à l’aide d’un algorithme de dichotomie
	// on utlise Arrays.binarySearch(tab,key)
	private static void chercherValeurAvecDICHOTOMIE(int[] i_tab, int valeur) {

	

		// 1iere solution : fonction Arrays.binarySearch(i_tab,valeur)
		//int result = Arrays.binarySearch(i_tab,valeur);

		// 2ieme solution: algorithme de dichotomie
		int result = rechDicho1(i_tab, i_tab.length, valeur);

		System.out.println("Trouve la valeur v = "+valeur + " est au indice "+ result);


	}

	// Methode 2 :  pour rechercher une valeur dans le tableau à l’aide d’un algorithme de dichotomie
		// on utlise algorithme de dichotomie
	private static int rechDicho1(int[] tab, int nbElements, int valeur){
		boolean trouve = false;
		int g = 0;
		int h = nbElements-1;
		int m;
		int nboperation = 0; 
		do{
			nboperation++; 
			m = (g+h)/2;
			if (tab[m] == valeur){
				trouve = true;
			}
			else if (tab[m] < valeur){
				g = m+1;
			}
			else{
				h = m-1;
			}
		} while (!trouve);
		System.out.println("nombre operation pour algorithme de dichotomie est " + nboperation);
		
		return (m);
	}

}
