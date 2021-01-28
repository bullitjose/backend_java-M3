package backendjava.Modul3.MileStone1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
FASE 4
- Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de
cada string ( string nomCiutat.Length). crea un array bidimensional capaç de guardar 3 notes de 5
alumnes.
- Ompliu els nous arrays lletra per lletra.
- Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).

 */

public class Fase4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea sis variables tipu string buides.
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		ArrayList<String> ciutats = new ArrayList<String>();

		// Crear HashMap ciutatsMap
		HashMap<String, ArrayList<Character>> ciutatsMap = new HashMap<String, ArrayList<Character>>();
		/*
		 * Demana per consola que s’introdueixin els noms. Introdueix els següents noms
		 * de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per
		 * teclat.
		 */
		for (int i = 0; i < 6; i++) {
			/*
			 * Metode per initroduir per consola els noms de 6 ciutats, introduirCiutat i es
			 * guarden en ArrayList ciutats
			 */

			ciutats.add(introduirCiutat(i));

		}

		// Afegim keys la ciutat,values arraylist de mida longitud de key
		System.out.println("-------- Imprimir hashMap, key la ciutat, valor arraylist de los caracteres");

		for (String aux : ciutats) {

			ciutatsMap.put(aux, convertirStringAListChar(aux));

		}

		/*
		 * Imprimir HasMap, key és String amb nom de la ciutat, value és ArrayList dels
		 * caracters que formen el en nom del key
		 */

		for (HashMap.Entry m : ciutatsMap.entrySet()) {

			System.out.println("Key = " + m.getKey() + "  Valor = " + m.getValue());
		}

		// Cridar metode gira l'ordre els caracters de cada value del HashMap

		for (String m : ciutatsMap.keySet()) {
			// Crear una llista buida de caracters
			ArrayList<Character> miListaCharGirada = new ArrayList<>();
			// Passem els values del key a la llista

			miListaCharGirada = ciutatsMap.get(m);
			// Cridar metode reverse de Collections per revertir la llista
			Collections.reverse(miListaCharGirada);
			// Afegim nova llista revertida al key del HashMap
			ciutatsMap.put(m, miListaCharGirada);

		}

		// Imprimir resultat girat del HashMap
		System.out.println("-------Valors de les ciutats girats---------------------------");
		System.out.println(ciutatsMap);

		// Collection permet cridar metode sort per ordenar alfabeticament arraylist de
		// les ciutats
		System.out.println("-------Ordenar alfaberticament valors de les ciutats----------");
		Collections.sort(ciutats);
		System.out.println(ciutats);
		/*
		 * Definim ArrayCiutatsModificades que contindrà l'arraylist de les ciutats amb
		 * les a's substituides per 4
		 */
		ArrayList<String> ArrayCiutatsModificades = new ArrayList<String>();

		/*
		 * Cridar metode substituirA, que retorna arrayList amb les ciutats amb les "a"
		 * substituides per "4"
		 */
		System.out.println("-------Substituir A per 4 als valors de les ciutats----------");
		ArrayCiutatsModificades = substituirA(ciutats);
		System.out.println(ArrayCiutatsModificades);

	}

	private static void crearArrayBidimensional () {
		
		
	}
	
	
	
	/**
	 * Metode girarArray passat per parametre
	 */
	private static ArrayList<Character> girarArray(ArrayList<Character> inputArrayList) {
		// Crear una lista vacia de caracteres
		ArrayList<Character> miListaCaracters = new ArrayList<>();

		// Tornem la llista de caracters
		return miListaCaracters;

	}

	/**
	 * Metode que passa el text dins la variable nomComplet a array de caracters i
	 * els mostra per pantalla
	 * 
	 * @author
	 * @param String text
	 * @return ArrayList<Character> miListaCaracters
	 */
	private static ArrayList<Character> convertirStringAListChar(String text) {

		// Crear una lista vacia de caracteres
		ArrayList<Character> miListaCaracters = new ArrayList<>(text.length());

		// Bucle que recorre tot l'string text i afegeix cada caracter a la llista
		for (char ocurrencia : text.toCharArray()) {
			miListaCaracters.add(ocurrencia);

		}
		// Tornem la llista de caracters
		return miListaCaracters;

	}

	private static void convertirTextEnArrayDeChars(String text) {
		char[] arrayChars = text.toCharArray();

		for (char ocurrencia : arrayChars) {
			System.out.println(ocurrencia);

		}

	}

	/**
	 * Metode per introduir per consola un nombre, num, de ciutats passat per
	 * parametre
	 * 
	 * @param int num
	 * @return String inputText
	 */
	static String generarArray(int num) {

		Scanner myObj = new Scanner(System.in);
		String inputText;

		// Enter ciutat and press Enter
		System.out.println("Introdueix Ciutat (" + num + ")");
		inputText = myObj.nextLine();

		// retornem string introduit
		return inputText;
	}

	/**
	 * Metode per introduir per consola un nombre, num, de ciutats passat per
	 * parametre
	 * 
	 * @param int num
	 * @return String inputText
	 */
	static String introduirCiutat(int num) {
		Scanner myObj = new Scanner(System.in);
		String inputText;

		// Enter ciutat and press Enter
		System.out.println("Introdueix Ciutat (" + num + ")");
		inputText = myObj.nextLine();

		// retornem string introduit
		return inputText;
	}

	/**
	 * Metode que substituir les "a" de les ciutats guardades per "4" i retornar-ho
	 * en un ArrayList
	 * 
	 * @param ArrayList<String> ciutats
	 * @return ArrayList<String> substituirAs
	 * 
	 */

	private static ArrayList<String> substituirA(ArrayList<String> ciutats) {
		ArrayList<String> substituirAs = new ArrayList<String>();
		for (String i : ciutats) {

			i = i.replaceAll("a", "4");
			substituirAs.add(i);

		}

		return substituirAs;

	}

}
