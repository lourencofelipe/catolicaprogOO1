package ExercicioURI1043;

import java.util.Scanner;

public class MainTriangulo {

	public static void main(String[] args) {
		int perimetro, area, base1, base2, altura;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digiti a primeira base do triangulo");
		base1 = sc.nextInt();

		System.out.println("Digiti a segunda base do triangulo");
		base2 = sc.nextInt();

		System.out.println("Digiti a altura do triangulo");
		altura = sc.nextInt();

		Triangulo resultado = new Triangulo(base1, base2, altura);

	}

}