package IntermediarioExercicio02;

public class PalindromoRecursivo {
	public static boolean isPalindromo(String palavra, int i, int j) {
	    if (i >= j) {
	        return true;
	    } else {
	        boolean iguais = palavra.charAt(i) == palavra.charAt(j);
	        return iguais && (j - i == 1 ? true : isPalindromo(palavra, i + 1, j - 1));
	    }
	}

	public static void main(String[] args) {
	    String palindromo = "socorram me subi no onibus em marrocos";
	    String naoPalindromo = "nadar";
	    System.out.println(palindromo + " eh palindromo? " + isPalindromo(palindromo, 0, palindromo.length() - 1));
	    System.out.println(naoPalindromo + " eh palindromo? " + isPalindromo(naoPalindromo, 0, naoPalindromo.length() -1));
	}
}