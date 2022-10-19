package pooAtividades.exerMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainExerMap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Map<String, Integer> ocorrencias = new LinkedHashMap<String, Integer>();
		
		System.out.print("Insira a frase: ");
		String frase = input.nextLine();

		String frases[] = frase.split(" ");
		
		for(String palavra : frases) {
			if(ocorrencias.get(palavra) == null) {
				ocorrencias.put(palavra, 1);
			}else {
				ocorrencias.put(palavra, ocorrencias.get(palavra) + 1);
			}
		}
		

		for(String palavra : ocorrencias.keySet()) {
			System.out.println(palavra + ": " + ocorrencias.get(palavra));
		}

	}

}
