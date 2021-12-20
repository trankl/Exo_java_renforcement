package exo_IfElse;


/* TKL- 20 déc. 2021:
*
Dans votre méthode public static void main, déclarer une variable int a = 5 et b = 8
Ecrire un if / else qui vérifie si la valeur de a est plus petite que la valeur b
Si a est inférieur à b (a < b) alors afficher “a est plus petit que b”
Dans le cas contraire, (else) alors afficher “a n’est pas plus petit que b”
*/
public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("---------- Debut du exercice if_else----------");
		int a = 5;
		int b = 8;
		
		//Si a est inférieur à b (a < b) alors afficher “a est plus petit que b”
		if (a<b) {
			System.out.println(" a est plus petit que b ");
		}
		// sinon, alors afficher “a n’est pas plus petit que b”
		else {
			System.out.println("a n’est pas plus petit que b");
		}
		
	}

}
