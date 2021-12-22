package exo_PGCD;

import java.util.Scanner;


/* TKL- 21 déc. 2021:
* Ecrire un programme permettant de calculer le “plus grand commun diviseur” de deux nombres fournis en paramètre.
Demander à l’utilisateur de saisir le nombre a, et de saisir le nombre b.
Le programme doit calculer le “plus grand commun diviseur” et afficher le résultat à l’écran.
Chercher sur internet l’algorithme de calcul du plus grand commun diviseur. Essayer de l’implémenter par vous-même.
Rechercher sur internet un algorithme fonctionnel prêt à l’emploi écrit en programmation Java pour calculer le PGCD.

https://www.mathematiquesfaciles.com/exercices/exercice-maths-2/exercice-maths-23038.php
*/
public class Main {

	
	public static void main(String[] args) throws Exception {
		
		// lire le clavier
				Scanner scanner = new Scanner(System.in);	
		
		try { 	

			System.out.print("Veuillez saisir le nombre A : ");
			int numberA = scanner.nextInt();
			System.out.print("Veuillez saisir le nombre B : ");
			int numberB = scanner.nextInt();

			int pgcd = egcd(numberA,numberB);
			
		System.out.println(" plus grand diviseur commun entre A et B est :  " + pgcd);

		} // s'il y a erreur de saisir les nombres, 1 message erreur va etre affiché
		catch (Exception e) {
			System.out.println("Erreur de saisie : Number format exception ");
			extracted(e);
		} 
		scanner.close();
		
	} 
	
	//-----------Les Methodes pour calculer PGCD--------------------------------------------//
	
	
	//  l'algorithme euclidien:
	// Le principe est le même que pour les soustractions successives : 
	// on soustrait un nombre de l'autre autant de fois qu'on peut et on regarde ce qui reste : cela revient à faire une division euclidienne. Cette méthode est plus rapide en général.
	public static int gcd(int a, int b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
		}
	
	//  l'algorithme des différences:
	// Principe : si un nombre est un diviseur de 2 nombres a et b, alors il est aussi un diviseur de leur différence a - b
	public static int egcd(int a, int b) {
	    if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}
	
	
	//
	private static void extracted(Exception e) throws Exception {
		throw new Exception("Erreur de saisie : Number format exception" + e.toString());
	}
	
	
}
