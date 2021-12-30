package exo_switch;

/* TKL- 30 déc. 2021:
 * Exercice (Switch)
Ecrire un nouveau Enum intitulé “TypeAnimal” contenant trois clefs : “CHIEN”, “CHAT”, “OISEAU”
Déclarer une nouvelle variable Enum TypeAnimal.
Exemple  TypeAnimal l_enum_typeAnimal = TypeAnimal.CHAT;

Ecrire un switch qui selon la valeur de “l_enum_typeAnimal” exécutera une action différente

String l_str_nom = “Minou”;
int l_int_age = 5;
Animal l_obj_animal = null;

System.out.println(“On demande de créer un nouveau [“+l_enum_typeAnimal+”]”);

switch (l_enum_typeAnimal) {
case TypeAnimal.CHIEN : 
System.out.println(“Initialisation Animal avec nouvelle instance de CHIEN”);
l_obj_animal = new Chien(l_str_nom, l_int_age);
break;
case TypeAnimal.CHAT: 
System.out.println(“Initialisation Animal avec nouvelle instance de CHAT”);
l_obj_animal = new Chat(l_str_nom, l_int_age);
break;
case TypeAnimal.OISEAU: 
System.out.println(“Initialisation Animal avec nouvelle instance de OISEAU”);
l_obj_animal = new Oiseau(l_str_nom, l_int_age);
break;
}

// On demande à l’animal de crier
l_obj_animal.crier();

Retirer les BREAK et tester ce qui se passe. Remettre ensuite le break.

ATTENTION : Bien penser à écrire break à la fin de chaque CASE du SWITCH
BONUS : Utiliser la nouvelle syntaxe Java 17 pour les switchs

 */
public class Main{

	public enum TypeAnimal{
		CHIEN, CHAT, OISEAU;
	}

	public static void main(String[] args) {

		System.out.println("\n----------Exercice (Switch)-------------------\n");

		
		TypeAnimal l_enum_typeAnimal = TypeAnimal.CHIEN;

		String nom = "Minou";
		int age = 5;
		Animal animal = null;

		System.out.println(" On demande de créer un nouveau ["+l_enum_typeAnimal+"]");

		switch (l_enum_typeAnimal) {
		case CHIEN : 
			System.out.println(" Initialisation Animal avec nouvelle instance de CHIEN");
			animal = new Chien(nom, age);
			System.out.println(" Ce chien s'appelle "+ animal.getNom()+ ", il a " + animal.getAge()+ " ans");
			break;
		
		case CHAT: 
			System.out.println(" Initialisation Animal avec nouvelle instance de CHAT");
			animal = new Chat(nom, age);
			System.out.println(" Ce chat s'appelle "+ animal.getNom()+ ", il a " + animal.getAge()+ " ans");
			break;
			
		case OISEAU: 
			System.out.println(" Initialisation Animal avec nouvelle instance de OISEAU");
			animal = new Oiseau(nom, age);
			System.out.println(" Cet oiseau s'appelle "+ animal.getNom()+ ", il a " + animal.getAge()+ " ans");
			break;
		}

		System.out.print(" Il crie: ");
		// On demande à l’animal de crier
		animal.crier();
	}

}
