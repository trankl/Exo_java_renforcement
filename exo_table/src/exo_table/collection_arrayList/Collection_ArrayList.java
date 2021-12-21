package exo_table.collection_arrayList;

import java.util.ArrayList;

/* TKL- 21 déc. 2021:
* Dans votre programme main, déclarer une ArrayList et initialisez-la avec la valeur null.
Instancier ensuite la ArrayList afin de la rendre opérationnelle et utilisable.
Ajouter dans la ArrayList les valeurs suivantes :

Afficher le résultat à l’écran de façon bien lisible. (Vous pouvez séparer les valeurs avec un PIPE « | »)
Calculer et afficher la taille de la liste. (nombre total d’element)
Retirer de la ArrayList la valeur 170.
Calculer la taille de la ArrayList (Le nombre d’éléments que la collection contient) et afficher à l’écran le résultat.
Modifier ensuite la zone mémoire référençant la valeur « 16356 ». Remplacer par « -16356 ».
Extraire ensuite toutes les valeurs négatives (-2, -190, -3052, -16356) et les mémoriser dans une seconde ArrayList. Ainsi vous obtiendrez deux ArrayList, une contenant uniquement des nombres positifs, la seconde uniquement des valeurs négatives.
Afficher ensuite les deux ArrayList avec leurs tailles respectives.
 
Résultat attendu :
Affichage de la liste initiale :
1|-2|10|-190|60|192|170|1052|-3052|16356|
 
Taille de la ArrayList initiale avant suppression de l’élément : 10
Taille de la ArrayList initiale après suppression de l’élément : 9

*/


public class Collection_ArrayList {

	public static void main(String[] args) {
		System.out.println("----------EXO COLLECTION ARRAYLIST-----------------------");
		//déclarer une ArrayList et initialisez-la avec la valeur null
		ArrayList<Integer> arr= null;
		//Instancier ensuite la ArrayList
		arr = new ArrayList<Integer>();
		// Declare 1 tableau des valeurs pour mettre dans ArrayList
		int [] tab = new int[] {1,-2,10, -190, 60, 192, 170, 1052, -3052, 16356};
		// Mettre ces valeurs dans ArrayList
		for (int i =0; i<tab.length; i++) {
			arr.add(tab[i]);
		}
		System.out.println("Affichage du liste des valeurs du ArrayList :");
		// Afficher les valeurs de la ArrayList
		afficherArrayList(arr);
		// Calculer et afficher la taille de la liste
		System.out.println("Taille de la ArrayList initiale avant suppression de l’élément :" + arr.size());
		
		// Retirer de la ArrayList la valeur 170.
		for (int i =0; i<arr.size(); i++) {
			if (arr.get(i) == 170) {
				arr.remove(i);
			}
		}
		//Calculer la taille de la ArrayList et afficher à l’écran le résultat.
		System.out.println("Taille de la ArrayList initiale apres suppression de l’élément de la valeur 170 :" + arr.size());

		//Modifier ensuite la zone mémoire référençant la valeur « 16356 ». Remplacer par « -16356 ».
		for (int i =0; i<arr.size(); i++) {
			if (arr.get(i) == 16356) {
				arr.set(i, -16356);
			}
		}
		System.out.println("Affichage du liste des valeurs du ArrayList apres avoir remplacer valeur -16356 :");
		// Afficher les valeurs de la ArrayList
		afficherArrayList(arr);		
		
		// Creer 2 nouveaux ArrayList pour stocker les valeurs negatives et les valeurs positives
		ArrayList<Integer> arrPositive= new ArrayList<>();
		ArrayList<Integer> arrNegative= new ArrayList<>();
		
		// Extraire ensuite toutes les valeurs négatives (-2, -190, -3052, -16356) et les mémoriser dans une seconde ArrayList. Ainsi vous obtiendrez deux ArrayList, une contenant uniquement des nombres positifs, la seconde uniquement des valeurs négatives.
		for (int i =0; i<arr.size(); i++) {
			if (arr.get(i) <0) {
				// Ajouter valeur negative a la ArrayList qui contient les valeurs negatives
				arrNegative.add(arr.get(i));
			}
			if (arr.get(i)>0) {
				// Ajouter valeur positif a la ArrayList qui contient les valeurs positives
				arrPositive.add(arr.get(i));
			}
		}
		
		//Afficher ensuite les deux ArrayList avec leurs tailles respectives.
		System.out.println(" Affichage du liste de valeurs positives de la 1ere ArrayList avec sa taille est : " + arrPositive.size());
		afficherArrayList(arrPositive);
		System.out.println(" Affichage du liste de valeurs negatives de la 2ieme ArrayList avec sa taille est : " + arrNegative.size());
		afficherArrayList(arrNegative);
	}
	
	
	// Methode pour afficher 1 ArrayList
	public static void afficherArrayList(ArrayList<Integer> arrayListAAfficher) {
		for (int i =0; i<arrayListAAfficher.size(); i++) {
			System.out.print(arrayListAAfficher.get(i) + " | ");
		}
		System.out.println("\n");
	}

}
