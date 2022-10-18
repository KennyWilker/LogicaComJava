import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		/*
		 Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
		“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
		 */
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < 75; i++) {
			System.out.println("Infome uma idade:");
			int idade = leitor.nextInt();
			if (idade >= 18) {
				System.out.println("Maior de idade!");
			} else if (idade < 18 && idade >= 0) {
				System.out.println("Menor de idade!");
			}else {
				System.out.println("Idade Invalida.");
			}
		}
	}
}
