/*************************************
 * MainSomaImpares
 * @author Sorriso
 * 
 * 29/08/2017
 ************************************/
package InicianteExercicio06;

import java.util.Scanner;

public class SomaImparesMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		SomaImpares soma = new SomaImpares();

		System.out.println("Informe o n�mero inicial: ");
		int num1 = sc.nextInt();

		System.out.println("Informe o n�mero final: ");
		int num2 = sc.nextInt();

		soma.setNumeroInicial(num1);
		soma.setNumeroFinal(num2);

		System.out.println("A soma dos n�meros �mpares entre os n�meros � "
				+ soma.getSoma());

	}

}
