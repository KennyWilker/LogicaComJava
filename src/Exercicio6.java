import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		/*
		 6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
			possuir ovalor da variável B e a variável B passe a possuir o valor da variável A. Apresentar osvalores
			trocados;
		 */
		
		Scanner leitor = new Scanner(System.in);
		int aux;
		
		System.out.println("Informe o valor de A:");
		int a = leitor.nextInt();
		System.out.println("Informe o valor de B:");
		int b = leitor.nextInt();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("O valor de A passa a ser "+a+" e o valor de B passa a ser "+b);
	}
}
