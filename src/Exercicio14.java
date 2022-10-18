import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		/*
		 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
		 */
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um valor:");
		double valor1 = leitor.nextDouble();
		System.out.println("Informe outro valor:");
		double valor2 = leitor.nextDouble();
		
		if (valor1 > valor2) {
			System.out.println(valor1+" e maior que "+valor2);
		} if (valor2 > valor1){
			System.out.println(valor2+" e maior que "+valor1);
		} if (valor2 == valor1) {
			System.out.println("Os valores sao iguais.");
		}
	}
}
