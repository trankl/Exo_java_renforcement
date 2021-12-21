package exo_EndOfLine;

/* TKL- 21 déc. 2021:
* Dans votre Main, afficher un “System.out.print()” contenant les trois mots suivants :

Chocolat
Fruit
Jus

Entre chaque mot, sauter une ligne. 
Ne pas utiliser “\n” mais rechercher dans la documentation Java 
la commande qui permet d’utiliser automatiquement et facilement le bon saut de ligne
à utiliser en fonction du système d’exploitation en cours d'exécution.


INDICE : Chercher du coté de System.getProperty("line.separator");
*/

public class Main {

	public static void main(String[] args) {
		System.out.println("----------- Exo_EndOfLine -----------");

		
		String chocolat = "Chocolat";
		String fruit = "Fruit";
		String jus = "Jus";
		
		// variable pour sauter la ligne à la place de “\n” avec methode System.lineSeparator() 
		String s = System.lineSeparator();
		
		System.out.println(" Afficher 3 mots avec methode System.lineSeparator() pour sauter une ligne");
		System.out.print(chocolat + s + fruit + s + jus + s);
		
		// variable pour sauter la ligne à la place de “\n” avec methode System.getProperty("line.separator")
		String ns = System.getProperty("line.separator");
		
		System.out.println(ns+ " Afficher 3 mots avec methode System.getProperty(line.separator) pour sauter une ligne");

		System.out.print(chocolat + ns + fruit + ns + jus);
		

	}

}
