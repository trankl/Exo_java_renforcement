package exo_table.tableau_manuel;


/* TKL- 21 déc. 2021:
*Déclarer un tableau d’entiers de 10 cases. Remplir ce tableau uniquement avec des zeros. Afficher toutes les valeurs du tableau sur une seule ligne grâce à un for et à un «System.out.print()»
Résultat attendu : « 0000000000 »
Modifier ensuite manuellement le tableau avec les valeurs suivantes :

Afficher chaque valeur du tableau sur une ligne différente
*
*/
public class Tableau_manuel {

	public static void main(String[] args) {
		System.out.println("----------EXO TABLEAU MANUEL-----------------------");

		// declare un tableau de 5 valeurs
		int[] tab = new int[10];

		System.out.println(" Affichage du tableau de 10 valeurs");

		// ajouter les valeurs (de 1 à 5) et afficher chaque valeur du tableau 
		for (int i=0; i <10; i++) {
			tab[i] = 0;
			System.out.print(tab[i]);
		}
		
		System.out.println("\n Ajouter nouveaux valeurs à la table");
		tab[0] = 16;
		tab[1] = 102;
		tab[2] = -89;
		tab[4] = 1;
		tab[7] = 1909;
		tab[8] = 32;
		tab[9] = -9;
		
		for (int i=0; i <10; i++) {
			
			System.out.println(tab[i]);
		}
		
		
	}

}
