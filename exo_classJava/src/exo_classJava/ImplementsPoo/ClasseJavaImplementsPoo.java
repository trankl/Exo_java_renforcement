package exo_classJava.ImplementsPoo;

import exo_classJava.AbstraitePo.Chat;
import exo_classJava.AbstraitePo.Chien;
import exo_classJava.AbstraitePo.Oiseau;

/* TKL- 5 janv. 2022:
* Déclarer une Interface intitulée “Animal”.
Définir dans l’interface une méthode “crier()”
Déclarer trois classes “Chien”, “Chat”, “Oiseau”. Ces classes implémentent la classe Animal.
Chaque race d’animal doit crier d’une façon différente. Exemple un chien “WOUAF”, un chat “MIAOU”, un oiseau “CUI CUI CUI”
Dans les trois sous classes, implémenter la méthode “crier()” de l’interface
BONUS : Définir une quatrième classe “Corbeau”. Cette dernière doit étendre “Oiseau”. Réaliser un “@Override” de la méthode “crier()”

*/


public class ClasseJavaImplementsPoo {

	public static void main(String[] args) {
		System.out.println("----------Exercice (ClasseJavaImplementsPoo)-----------------------");
		
		Chien chien = new Chien("Kiki", 1);
		Chat chat = new Chat("Mini", 2);
		Oiseau coq = new Oiseau("MrCoq", 1);
		Corbeau corbeau = new Corbeau("black", 3);
		
		System.out.println(" Ce chien s'appelle " + chien.getNom() + ". Il a " + chien.getAge() + " ans.  Il crie ");
		chien.crier();
		
		System.out.println(" Ce chat s'appelle " + chat.getNom() + ". Il a " + chat.getAge() + " ans. Il crie ");
		chat.crier();
		
		System.out.println(" Ce oiseau s'appelle " + coq.getNom() + ". Il a " + coq.getAge() + " ans. Il crie ");
		coq.crier();
		
		System.out.println(" Ce corbeau s'appelle " + corbeau.getNom() + ". Il a " + corbeau.getAge() + " ans. Il crie ");
		coq.crier();
		
		
		

	}

}
