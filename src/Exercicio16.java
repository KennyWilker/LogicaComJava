import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {
		/*
		 16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
			 sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
			 Recuperação (media entre 5.1 a 6.9);
		 */
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o nome do Aluno:");
		String nome = leitor.nextLine();
		System.out.println("Informe a primeira nota de "+nome);
		double nota1 = leitor.nextDouble();
		System.out.println("Informe a segunda nota de "+nome);
		double nota2 = leitor.nextDouble();
		System.out.println("Informe a tercira nota de "+nome);
		double nota3 = leitor.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		System.out.println(nome+", sua media e: "+media);
		
		if (media>=7 && media<=10) {
			System.out.println("Voce foi Aprovado");
		}
		if (media<=5 && media>=0) {
			System.out.println("Voce foi Reprovado");
		}
		if (media>5 && media<7) {
			System.out.println("Voce esta de Recuperacao");
		}
	}
}
