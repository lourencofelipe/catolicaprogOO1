package InicianteExercicio07;

import java.util.Scanner;

public class Ex07 {

	private static int i;
	private static int digitado;

	public static double getCalculo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		digitado = sc.nextInt();
		System.out.println(digitado);
		int aux = digitado;
		int auxT = 0;		
		int[] array1 = new int[1000];
		for (int i = 0; i < array1.length;i++) {
			if (auxT == aux + 1){
				auxT = 0;
			}
				System.out.println("[" + (i + 1) + "]" + " = " + auxT );
				auxT++;
		}
		return digitado;
	}

}
