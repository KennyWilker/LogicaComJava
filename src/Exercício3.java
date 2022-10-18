import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		/*
		 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
		    total percorrida pelo automóvel e o total de combustível gasto;
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a distancia percorrida pelo automovel:");
		double distancia = leitor.nextDouble();
		System.out.println("Informe o total de conbustivel gasto:");
		double consumo = leitor.nextDouble();
		
		System.out.println("O consumo medio de combustivel e de: "+ (distancia/consumo) + "L por quilometro rodado.");
	}

}
