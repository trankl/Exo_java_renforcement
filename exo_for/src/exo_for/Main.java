package exo_for;

//Déclarer un tableau quelconque, ajouter des valeurs et afficher chaque valeur du tableau à l’aide d’un for.

public class Main {

	public static void main(String[] args) {
	
		// declare un tableau de 5 valeurs
		int[] tab = new int[5];
		
		System.out.println(" Affichage du tableau de 5 valeurs");
		
		// ajouter les valeurs (de 1 à 5) et afficher chaque valeur du tableau 
		for (int i=0; i <5; i++) {
			tab[i] = i+1;
			System.out.print(tab[i] + " | ");
		}
		
	}
}
