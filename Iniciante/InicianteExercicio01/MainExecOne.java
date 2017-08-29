package InicianteExercicio01;

import java.util.*;

public class MainExecOne {
	public static void main(String[] args) {

		int termo01, termo02;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 1 Numero");
		termo01 = sc.nextInt();
		System.out.println("Digite outro numero");
		termo02 = sc.nextInt();

		CalculoExOne resultado = new CalculoExOne(termo01, termo02);
	}
}