package exo_break_for;


/* TKL- 20 déc. 2021:
 * Déclarer une variable a = 8
Déclarer un tableau de 10 cases remplies avec les valeurs de 0 à 9
Parcourir le tableau avec une boucle for et si la valeur parcouru dans le tableau a la valeur 8,
alors exécuter la commande break
Afficher la valeur sur laquelle le programme s’arrete
Résultat attendu : 8

 */
public class Main {

	public static void main(String[] args) {

		int a = 8;
		int j = 0;
		
		// declare un tableau de 10 valeurs
		int[] tab = new int[10];

		System.out.println(" Affichage du tableau de 10 valeurs");
		
		// ajouter les valeurs (de 0 à 9) et afficher chaque valeur du tableau 
		for (int i=0; i <10; i++) {
			tab[i] = i;
			System.out.print(tab[i] + " | ");
		}
		
		// chercher l'indice où son valeur est egale 8
		for (int i=0; i <10; i++) {
			if (tab[i] == a) {
				j = i;
				break;
			}
		}
		//Afficher la valeur sur laquelle le programme s’arrete
		System.out.println("\n Le programme est s'arrete au indice "+ j+ " avec valeur est " + tab[j]);
	}

}
