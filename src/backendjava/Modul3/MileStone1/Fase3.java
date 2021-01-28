package backendjava.Modul3.MileStone1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 FASE 3
- Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou
array(ArrayCiutatsModificades).
- Mostreu per consola l’array modificat i ordenat per ordre alfabetic.


 */

public class Fase3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea sis variables tipu string buides.
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		ArrayList<String> ciutats = new ArrayList<String>();
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
		// Collection permet cridar metode sort per ordenar alfabeticament arraylist de
		// les ciutats
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
		ArrayCiutatsModificades = substituirA(ciutats);
		System.out.println(ArrayCiutatsModificades);

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
