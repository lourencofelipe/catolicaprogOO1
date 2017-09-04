package AvancadoExercicio00;

/* Transformar inteiro em binario */
//https://stackoverflow.com/questions/2406432/converting-an-int-to-a-binary-string-representation-in-java
public class Exer0AvancBinary {
	public static String convert(int n) {
		  return Integer.toBinaryString(n);
		}

		public static void main(String[] args) {
		  System.out.println(convert(20)); 
		  System.out.println(convert(54)); 
		}
}
