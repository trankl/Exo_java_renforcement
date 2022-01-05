package exo_classJava.toStringPoo;

/*
Déclarer une nouvelle classe intitulée « Animal ». Déclarer des variables telles que le nom, l'âge de l’animal.
Définir un constructeur prenant en paramètre le nom et l'âge de l’animal
Dans votre Main déclarer un objet de type Animal, instancier le et exécuter la méthode toString() sur votre objet.
Définir une méthode toString qui affiche le nom de l’animal et son âge.
Dans votre Main, exécuter à nouveau la méthode toString() sur votre objet.

Quelle différence constatez-vous ? 1iere methode donne que l'adresse du objet. 2 iemee methode donne les valeur du objet

Définir une méthode “crier()” dans laquelle vous mettrez simplement un “System.out.println()” d’un cri d’un animal.
Dans votre Main, exécuter la méthode crier sur votre instance d’animal.
Créer d’autres instances d’Animal et exécuter la méthode crier() sur chacun d’elles.
*/

public class ClasseJavaToStringPoo {

	
	public static void main(String[] args) {
		System.out.println("----------Exercice (ClasseJavaToStringPoo)-----------------------");

		// Déclarer un objet de type Animal
		Animal animal = new Animal("chien", 1);
		
		// Exécuter la méthode toString() sur votre objet
		System.out.println("Affichage animal avec methode toString() : " + animal.toString());
		
		// Exécuter à nouveau la méthode toString() sur votre objet.
		System.out.println("Affichage animal avec methode toString() declare dans class Animal : " + animal);

		System.out.println("Ce "+ animal.getAnimal_nom()+ " crie : ");
		//  exécuter la méthode crier sur votre instance d’animal
		animal.crier();
		
		// Créer d’autres instances d’Animal et exécuter la méthode crier() sur chacun d’elles.
		Animal chat = new Animal("chat", 2);
		System.out.println("Ce "+ chat.getAnimal_nom()+ " crie : ");

		chat.crier();
		
		
	}

}
