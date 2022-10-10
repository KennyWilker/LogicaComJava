import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		/*
		 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
			dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
			disponíveis com o usuário;
		 */
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a quantidade de dolares:");
		double quantidadeDolar = leitor.nextDouble();
		System.out.println("Informe a cotacao do Dolar:");
		double cotacaoDolar	= leitor.nextDouble();
		
		System.out.println("US$"+quantidadeDolar+" corresponde a R$"+(quantidadeDolar*cotacaoDolar));
	}
}
