package exo_MethodesEtMembresStatiques;
/*
 * Créer un Main et créer une classe personnage vide
Déclarer deux instances de personnages “l_perso1” et “l_perso2”
Dans la Classe Personnage, ajouter une variable membre statique private de type int avec comme valeur initiale à 0 ainsi qu’un getter public sur cette variable. Appeler la variable “m_int_compteur”.
Dans cette même classe Personnage, créer une méthode statique qui permet d’incrémenter la variable.
Dans le Main, exécuter la méthode d’incrémentation une seule fois sur l’instance “l_perso1” puis trois fois sur l’instance “l_perso2”.
Créer deux variables int, “l_int_compteurPerso1” et “l_int_compteurPerso2”, puis afficher les deux compteurs avec un System.out.println()
Que remarquez-vous ?
Vous devriez remarquer deux choses :
Les compteurs n’ont pas la valeur attendue, mais la somme de toutes les incrémentations de toutes les instances. En effet, toutes les instances partagent une seule et même variable membre statique.
Un warning devrait apparaître pour vous indiquer que la méthode devrait être utilisée de façon statique.
NOTE : Pour exécuter une méthode statique écrire directement le nom de la classe suivi d’un point et du nom de la méthode
EXEMPLE : Personnage.incrementerCompteur()

 */
public class Main {

	public static void main(String[] args) {
		
		Personnage l_perso1 = new Personnage();
		
		Personnage l_perso2 = new Personnage();
		
		// exécuter la méthode d’incrémentation une seule fois sur l’instance “l_perso1”
		System.out.println("Lancer du perso1");
		l_perso1.incrementer();
		
		//puis trois fois sur l’instance “l_perso2”.
		System.out.println("Lancer du perso2");
		l_perso2.incrementer();
		l_perso2.incrementer();
		l_perso2.incrementer();

	}

}
