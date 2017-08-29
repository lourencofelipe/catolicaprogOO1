package ExercicioURI1050;

import java.util.Scanner;

public class MainDDD {
	public static void main(String[] args) {
		int DDD;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um DDD: ");
		
		DDD = sc.nextInt();
		
		CalculoDDD novoDDD = new CalculoDDD();
		
		novoDDD.setDDD(DDD);
		
		System.out.println(novoDDD.getCidade());
	}
}
