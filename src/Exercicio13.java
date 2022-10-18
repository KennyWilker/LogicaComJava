import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		/*
		 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10
		 */
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor qualquer:");
		double valor = leitor.nextDouble();
		if (valor > 10) {
			System.out.println(valor+" e maior que 10.");
		}
		System.out.println("Fim");
	}
}