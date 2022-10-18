import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma; 
		 */
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor:");
		int valor1 = leitor.nextInt();
		System.out.println("Informe um valor:");
		int valor2 = leitor.nextInt();
		System.out.println("A soma dos dois valores e: "+ (valor1 + valor2));
	}

}
