import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		/*
		 Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se é homem ou
		 mulher. No final informe total de homens e de mulheres;
		 */
		
		Scanner leitor = new Scanner(System.in);
		int totalHomens = 0, totalMulheres = 0;
		
		for (int i = 0; i < 56; i++) {
			System.out.println("Infrome o nome da pessoa:");
			String nome = leitor.nextLine();
			System.out.println("Informe o Genero da pessoa:");
			String sexo = leitor.nextLine();
			
			if (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm') {
				System.out.println("NOME: "+nome);
				System.out.println("SEXO: Maculino");
				totalHomens ++;
			} else if(sexo.charAt(0) == 'F' || sexo.charAt(0) == 'f'){
				System.out.println("NOME: "+nome);
				System.out.println("SEXO: Feminino");
				totalMulheres ++;
			}
		}
		
		System.out.println("O total de Homens e: "+totalHomens);
		System.out.println("O total de Mulheres e: "+totalMulheres);
	}
}