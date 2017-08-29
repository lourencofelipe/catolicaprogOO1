package InicianteExercicio08;
import java.util.Map;

public abstract class Expression{

	public abstract String interpret(String number);
	
	protected String right(String word, int count){
		// right 1 = [12345(6)]
		return word.substring(word.length()-count);
	}

	protected String left(String word, int count){
		// left 1 = [(1)23456]
		if (count > word.length()) count = word.length();
		return word.substring(0,count);
	}


	protected String getFromMap(Map<String,String> map, String toGet){
		String retorno = null;
		if ((retorno = map.get(toGet))==null) return "";
		return retorno;
	}

	public static void main(String[] args){
		String word = args[0];
		Expression ex = new Expression(){
			public String interpret(String number){return null;}
		};
		System.out.println(ex.right(word,1));
		System.out.println(ex.left(word,2));
	}
}