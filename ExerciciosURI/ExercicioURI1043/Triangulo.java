package ExercicioURI1043;

public class Triangulo {
	private int base1;
	private int base2;
	private int altura;
	private int area;
	private int perimetro;

	public Triangulo(int base1, int base2, int altura) {
		this.base1 = base1;
		this.base2 = base2;
		this.altura = altura;
		this.area = area;
		this.perimetro = perimetro;

		int resultado = this.base1 + this.base2 * this.altura / 2;
		System.out.println("Area é : " + resultado);

		if (resultado < 0) {

			int result = this.base1 + this.base2 + this.altura;
			System.out.println("Perimetro é : " + result);

		} else {
			int result = this.base1 + this.base2 * this.altura;
			System.out.println("Trapezio é : " + result);
		}
	}

}