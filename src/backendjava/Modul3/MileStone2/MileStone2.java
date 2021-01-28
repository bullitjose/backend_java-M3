package backendjava.Modul3.MileStone2;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MileStone2 {
	/**
	 * Metode per introduir nota en format correcte, nota en double
	 * 
	 * @param sc
	 * @param prompt text del prompt
	 * @return d, el valor double valid entrat
	 */
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			// hasNextDouble, torna true si scanner contiene double
			if (sc.hasNextDouble()) {
				// nextDouble,
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Nota no valida");
			}
			sc.nextLine();// Descartar aquesta linea introduida
		}
		return d;
	}

	/**
	 * Metode per introduir nota en rang correcte, entre 0 i 10
	 * 
	 * @param sc
	 * @param prompt
	 * @param min    , valor double minim del rang de notes
	 * @param max,   valor double maxim del rang de notes
	 * @return d, valor double valid per rang i format
	 */
	public static double getDoubleAmbRang(Scanner sc, String prompt, double min, double max) {
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);// Cridar metode getDouble, validar format
			if (d <= min) {
				System.out.println("Nota no valida, ha de ser igual o més gran que 0");
			} else if (d >= max) {
				System.out.println("Nota no valida, ha de ser menor o igual que 10");

			} else {
				isValid = true;
			}

		}
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear array dimensional 5x3 (lineasxcolumnas)

		// Asignar valores al array, arrayName[rowIndex][columnIndex]

		Double[][] arrayNotas = new Double[5][3];

		Scanner sc = new Scanner(System.in);

		// Introducir nota valida

		for (int row = 0; row < arrayNotas.length; row++) {
			for (int column = 0; column < arrayNotas[0].length; column++) {

				double nota = getDoubleAmbRang(sc,
						"Introduir nota " + (column + 1) + " de l'alumne " + (row + 1) + " ?", 0, 10);

				arrayNotas[row][column] = nota;

			}

		}

		System.out.println("Calculem nota mitjana de cada alumne ");

		for (int row = 0; row < arrayNotas.length; row++) {
			double mitjana = 0, total = 0;
			System.out.print("Notes alumne " + (row + 1) + " -->  ");
			int column;
			for (column = 0; column < arrayNotas[0].length; column++) {

				System.out.print(arrayNotas[row][column] + "   ");
				total = total + arrayNotas[row][column];
			}
			mitjana = total / column;
			// Formatejar nota mitjana double amb un decimal
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			String mitjanaFormateada = number.format(mitjana);
			if (mitjana <= 5) {
				System.out.print("--Mitjana alumne " + (row + 1) + " = " + mitjanaFormateada + " Alumne suspès!!");
			} else {
				System.out.print("--Mitjana alumne " + (row + 1) + " = " + mitjanaFormateada + " Alumne aprovat");
			}

			System.out.print("\n");
		}

		
	}
}
