package InicianteExercicio08;

import java.lang.Math;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		String numero = sc.nextLine();
		Extenso e = new Extenso();
		String str = e.interpret(numero);
		System.out.println(str);

	}
}
