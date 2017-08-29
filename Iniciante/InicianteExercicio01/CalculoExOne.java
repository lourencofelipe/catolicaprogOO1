package InicianteExercicio01;

public class CalculoExOne {
	private int termo01, termo02;

	public CalculoExOne(int termo01, int termo02) {
		this.termo01 = termo01;
		this.termo02 = termo02;

		int resultado = this.termo01 + this.termo02;
		System.out.println("Resultado: " + resultado);
	}
}