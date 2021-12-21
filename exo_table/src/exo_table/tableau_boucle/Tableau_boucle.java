package exo_table.tableau_boucle;

/* TKL- 21 déc. 2021:
 * Déclarer un tableau de 1 million de cases.
 * Remplir le tableau à l’aide d’une boucle for. 
 * La valeur à remplir dans chaque case est « 0 ». 
 * Combien de temps a besoin l’ordinateur pour remplir ce tableau ? 2s
 * Vérifier que votre tableau contient bien les valeurs insérées. 
 * (par exemple avec Debug Perspective, ou tout autre moyen, … ou bien un for qui verifie si chaque case == 0)
A l’aide d’une boucle for, remplir ensuite l’intégralité du tableau avec une valeur incrémentale.
 (Exemple, 0, 1, 2… 342234…).
 * Combien de temps a besoin l’ordinateur pour remplir ce tableau ? 21s
NOTE : Pour chronométrer d’une façon simple, mettez un system out println avant le calcul et un autre après le calcul.
Démarrer sur votre montre le chrono lorsque le premier message s’affiche et arrêter le chrono lorsque le message de fin s’affiche.

 */
public class Tableau_boucle {

	public static void main(String[] args) {
		System.out.println("----------EXO TABLEAU BOUCLE-----------------------");

		// declare un tableau de 1 000 000  valeurs
		int[] tab = new int[1000000];

		System.out.println(" Affichage du tableau de 1 000 000 valeurs");

		// ajouter les valeurs (0) et afficher chaque valeur du tableau 
		for (int i=0; i <1000000; i++) {
			tab[i] = 0;
			System.out.print(tab[i]);
		}

		System.out.println("\n FINI 1ier tableau");

		System.out.println("Remplir les valeurs incrementale au tableau");
		// ajouter les valeurs (de 1 à 5) et afficher chaque valeur du tableau 
		for (int i=0; i <1000000; i++) {
			tab[i] = i;
			System.out.print(tab[i]);
		}
		System.out.println("\n FINI 2iem tableau");
	}

}
