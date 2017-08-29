/*************************************
 * MainCircunferencia
 * @author Sorriso
 * 
 * 29/08/2017
 ************************************/
package InicianteExercicio03;

import java.util.Scanner;

public class CircunferenciaMain {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o raio: ");
		double raio = sc.nextDouble();

		Circunferencia circ = new Circunferencia();

		circ.setRaio(raio);

		System.out.println(" A área da circunferência é " + circ.getArea());

	}

}
