package exo_GSON;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* TKL- 30 déc. 2021:
* Exercice (GSON)
Ajouter la librairie GSON: com.google.code.gson:gson:2.8.9.jar
https://search.maven.org/artifact/com.google.code.gson/gson/2.8.9/jar

Instancier trois objets JSON et y remplir les valeurs suivantes :

{
	nom : “Médor”
	age : “10”
}
{
	nom : “Milou”
	age : “5”
}
{
	nom : “Minou”
	age : “7”
}

Afficher les trois objets à l’aide de la méthode appropriée

Instancier ensuite un tableau JSON et y ajouter les trois précédents objets JSON

Afficher le tableau à l’aide de la méthode appropriée

*/
public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n----------Exercice (GSON)-------------------\n");

		// Instancier trois objets type Person
		Person person1 = new Person("Médor",10);
		Person person2 = new Person("Médor",10);
		Person person3 = new Person("Médor",10);
		
		// Declarer 1 objet Gson pour convertir json en java et java en json
		Gson gson = new Gson();
		
		// Instancier trois objets JSON grace a la type String dans Java
		// transformer de type Persone à type Json grace à Gson
		String json1 = gson.toJson(person1);
		String json2 = gson.toJson(person2);
		String json3 = gson.toJson(person3);

		// Afficher les 3 objets Json
		System.out.println(" Affichage des 3 objets type Json : \n"+
							" Objet 1: " + json1 + 
							"\n Objet 2: " + json2 + 
							"\n Objet 3: " +json3) ;
		
		// Instancier un tableau JSON
		List<String> tabJson = new ArrayList<>();
		
		// ajouter les trois précédents objets JSON
		tabJson.add(json1);
		tabJson.add(json2);
		tabJson.add(json3);
		
		// Afficher tableau Json
		System.out.println("\n Affichage du tableau Json: " + tabJson);
		
		// Definir 1 objet Type pour List<Person> pour convertir valeur type Json en type List<>
		Type type = new TypeToken<List<Person>>() {}.getType();
        List<Person> listPersonJson = gson.fromJson(tabJson.toString(),type);
		
        // Afficher les objet type Person qui est converti de type Json
        System.out.println("\n Affichage list des objets type Person");
        int i = 1;
        for (Person person : listPersonJson) {
			System.out.println(" person "+i+" : " + person);
			i++;
		}
				
	
	}
	
	

	
	
}
