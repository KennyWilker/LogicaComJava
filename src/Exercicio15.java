import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		/*
		 15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
		 */
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero:");
		double numero = leitor.nextDouble();
		
		if (numero>=100 && numero<=200) {
			System.out.println(numero+" esta no intervalo entre 100 e 200.");
		} else {
			System.out.println(numero+" nao esta no intervalo entre 100 e 200.");
		}
	}
}
