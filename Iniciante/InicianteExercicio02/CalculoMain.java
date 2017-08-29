/*************************************
 * Main Calculo
 * @author Felipe
 * 
 * 29/08/2017
 ************************************/
package InicianteExercicio02;

import java.util.Scanner;

public class CalculoMain {
	public static void main(String[] args) {
		String nome;
		double percentualVendas;
		double totalVendas;
		double salarioFixo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do vendedor: ");
		nome = sc.nextLine();

		System.out.println("Informe o salário mensal bruto: ");
		salarioFixo = sc.nextDouble();

		System.out.println("Informe o total de vendas no mês: ");
		totalVendas = sc.nextDouble();

		CalculoA1 principal2 = new CalculoA1();

		principal2.setTotalVendas(totalVendas);

		System.out.println("O percentual de vendas é de  " + principal2.calcPorcentagem() + "%");

	}
}
