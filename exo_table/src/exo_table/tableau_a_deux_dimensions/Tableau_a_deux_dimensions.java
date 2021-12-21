package exo_table.tableau_a_deux_dimensions;


/* TKL- 21 déc. 2021:
 * Déclarer un tableau à deux dimensions. Remplir toutes les cases avec la valeur 0. Afficher le résultat à l’écran.

Remplir ensuite ce tableau avec les valeurs suivantes manuellement : (Vous pouvez séparer les valeurs avec un PIPE « | »)

 */
public class Tableau_a_deux_dimensions {

	public static void main(String[] args) {
		System.out.println("----------EXO TABLEAU A 2 DIMENSIONS-----------------------");

		int [][] tab2 = new int [4][7] ;

		System.out.println(" Affichage du tableau des valeurs = 0");
		for (int i =0; i<tab2.length; i++) {
			for (int j = 0; j<tab2[i].length; j++) {
				tab2[i][j] = 0;
			}
		}

		afficherTab(tab2);

		int [] tab = new int[] { 898,0,160,161, 162, 0, 164};

		System.out.println("Affichage du tableau avec les valeurs differents");
		for (int i = 0; i<7; i++) {
			tab2[0][i] = i;
			tab2[1][i] = tab[i];
			tab2[2][i] = -1;	
		}

		afficherTab(tab2);


	}

	public static void afficherTab(int [][] tab2) {
		for (int i =0; i<tab2.length; i++) {
			for (int j = 0; j<tab2[i].length; j++) {
				System.out.print(tab2[i][j] + " | ");
			}
			System.out.println("\n");
		}

	}

}
