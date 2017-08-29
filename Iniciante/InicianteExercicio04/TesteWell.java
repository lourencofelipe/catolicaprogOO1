package InicianteExercicio04;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteWell {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		// Seta Tipo de formato de data
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		// Pega Data Inicial
		System.out.println("Data inicial: ");
		String strDate1 = scanner.nextLine();
		Date ini = dateFormat.parse(strDate1);

		// Pega Data Final
		System.out.println("Data final: ");
		String strDate2 = scanner.nextLine();
		Date fim = dateFormat.parse(strDate2);

		Date teste = ini;
		long milliseconds = teste.getTime();
		double diferencaEmDias = (double) (fim.getTime() - milliseconds) / (1000 * 60 * 60 * 24);
		System.out.println(diferencaEmDias);

		scanner.close();
	}
}