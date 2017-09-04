package IntermediarioExercicio04;

/* Transformar inteiro em hexadecimal */
// https://stackoverflow.com/questions/9321553/java-convert-integer-to-hex-integer
public class Exer4InterHexa {
	public static int convert(int n) {
		  return Integer.valueOf(String.valueOf(n), 16);
		}

		public static void main(String[] args) {
		  System.out.println(convert(20));  // 32
		  System.out.println(convert(54));  // 84
		}
}
