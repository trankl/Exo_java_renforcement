package exo_while;

/* TKL- 20 déc. 2021:
 *Déclarer un tableau quelconque et afficher chaque valeur du tableau à l’aide d’un while.

INDICE : Cette méthode est tout à fait similaire à un for, 
sauf qu’il faut bien penser à incrémenter “i” dans le while

 */
public class Main {

	public static void main(String[] args) {
		// declare un tableau de 5 valeurs
		int[] tab = new int[5];

		System.out.println(" Affichage du tableau de 5 valeurs");
		
		// declare une objet i type int pour faire la boucle
		int i = 0;
		
		while (i<5) {
			// Ajouter chaque valeur du tableau
			tab[i] = 1;
			// Afficher le valeur
			System.out.print(tab[i] + " | ");
			//  incrementer valeur de l'objet i
			i++;
		}

	}


}
