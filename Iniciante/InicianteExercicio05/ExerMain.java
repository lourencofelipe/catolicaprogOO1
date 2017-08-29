package InicianteExercicio05;

import java.util.Scanner;

public class ExerMain {

	public static void main(String[] args) {
		int digitado;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		digitado = sc.nextInt();

		ExerCalculo calc2 = new ExerCalculo();
		calc2.setDigitado(digitado);
		System.out.println(calc2.imprimirArray());

	}

}