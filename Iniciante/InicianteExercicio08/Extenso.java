package InicianteExercicio08;

import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.LinkedList;


public class Extenso extends Expression {
		
		private Map<String, String> map = new HashMap<String,String>();

		{
			map.put("1","");
			map.put("2","mil ");
			map.put("2s","mil ");
			map.put("3","milhão ");
			map.put("3s", "milhões ");
			map.put("4","bilhão ");
			map.put("4s","bilhões ");
			map.put("5","trilhão ");
			map.put("5s","trilhões ");
		}
		
		public String interpret(String number){
			String extensoParteInteira="";
			String extensoParteDecimal="";
			String parteInteira="";
			String parteDecimal="";		

			//1º separa a parte decimal da parte inteira do número
			int floatPosition = number.indexOf(".");
			
			// Numero com parte inteira e decimal: 1.21
			if (floatPosition > 0) {
				parteInteira = number.substring(0, floatPosition);
				
				//2º retorna o valor por extenso da parte inteira
				extensoParteInteira = interpretaNumero(parteInteira);

				//3º retorna o valor decimal por extenso
				parteDecimal = number.substring(floatPosition+1);
				parteDecimal = this.left(parteDecimal,2);
				if (parteDecimal.length() == 1) parteDecimal+="0";
				extensoParteDecimal = interpretaNumero(parteDecimal);
			}

			// Numero apenas com parte decimal: .21
			if (floatPosition == 0){
				//3º retorna o valor decimal por extenso
				parteDecimal = number.substring(floatPosition+1);
				parteDecimal = this.left(parteDecimal,2);
				if (parteDecimal.length() == 1) parteDecimal+="0";
				extensoParteDecimal = interpretaNumero(parteDecimal);
			}

			// Numero sem parte decimal: 121
			if (floatPosition < 0) {
				parteInteira = number;
				
				//2º retorna o valor por extenso da parte inteira
				extensoParteInteira = interpretaNumero(parteInteira);
			}

			extensoParteInteira = extensoParteInteira.trim();
			extensoParteDecimal = extensoParteDecimal.trim();
				
			String Reais = (extensoParteInteira.equals(""))?"":" Reais";
			String Centavos = (extensoParteDecimal.equals(""))?"":" Centavos";		

			//4º concatena e retorna resultado
			return extensoParteInteira + Reais + ((extensoParteInteira.equals(""))?"":" ") + extensoParteDecimal + Centavos;
		}	
		

		private String interpretaNumero(String number){
			String extenso ="";

			//number = "1456654123111";

			Deque<String> numbers = new LinkedList<String>();
			
			// separa o grande número em [###]
			for(int i = number.length(); i > 0; i-=3){
				int n = i-3 < 0? 0:i-3;
				numbers.push(number.substring(n,i));
			}
			
			
			String subNumber = null;
			while(numbers.size() > 0){
				Integer i = numbers.size();
				subNumber = numbers.pop();
				//System.out.println(subNumber);

				//Expression ex = DigitoFactory.get(subNumber.length());
				Expression ex = new Centena();
				extenso += ex.interpret(subNumber) + " " + this.getFromMap(map,i.toString(), subNumber);
			}
			return extenso;
		}

		private String getFromMap(Map<String,String> map, String toGet, String value){
			String retorno = "";

			int val = Integer.parseInt(value);

			if (val == 0) return "";
			if(Integer.parseInt(value) > 1) toGet +="s";
			if ((retorno = map.get(toGet))==null) return "";
			
			return retorno;
		}
	}