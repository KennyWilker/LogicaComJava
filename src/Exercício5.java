import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		/*
		 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
			No final informar o nome do aluno e a sua média (aritmética);
		 */
		
		String nome;
		double nota1, nota2, nota3, media = 3;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno:");
		nome = leitor.nextLine();
		System.out.println("Informe a primeira nota do aluno:");
		nota1 = leitor.nextDouble();
		System.out.println("Informe a segunda nota do aluno:");
		nota2 = leitor.nextDouble();
		System.out.println("Informe a terceira nota do aluno:");
		nota3 = leitor.nextDouble();
		media = (nota1+nota2+nota3)/media;
		
		System.out.println("A media da soma das tres notas de "+nome+" e "+media);
	}

}
