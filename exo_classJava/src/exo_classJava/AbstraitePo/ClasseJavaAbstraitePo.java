package exo_classJava.AbstraitePo;

/* TKL- 5 janv. 2022:
* Déclarer une classe intitulée “Animal”. Cette classe doit être abstraite.
Déclarer trois classes “Chien”, “Chat”, “Oiseau”. Ces classes étendent la classe Animal.
Chaque race d’animal doit crier d’une façon différente. Exemple un chien “WOUAF”, un chat “MIAOU”, un oiseau “CUI CUI CUI”
Ajouter donc une méthode abstraite “crier” et définir cette méthode dans chacune des trois sous classes d’animaux.
NOTE : Les variables membres “nom” et “age” doivent être déclarées dans la classe abstraite Animal
NOTE : Dans le constructeur de vos sous classes exécuter le constructeur super(nom, age)

*/

public class ClasseJavaAbstraitePo {

	public static void main(String[] args) {
		System.out.println("----------Exercice (ClasseJavaAbstraitePo)-----------------------");
		
		Chien chien = new Chien("Kiki", 1);
		Chat chat = new Chat("Mini", 2);
		Oiseau coq = new Oiseau("MrCoq", 1);
		
		System.out.println(" Ce chien s'appelle " + chien.getNom() + ". Il a " + chien.getAge() + " ans.  Il crie ");
		chien.crier();
		
		System.out.println(" Ce chat s'appelle " + chat.getNom() + ". Il a " + chat.getAge() + " ans. Il crie ");
		chat.crier();
		
		System.out.println(" Ce oiseau s'appelle " + coq.getNom() + ". Il a " + coq.getAge() + " ans. Il crie ");
		coq.crier();
		
		
		

	}

}
