import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
	/*
	2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
	   dos dois números lidos;
	*/
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um valor:");
		double valor1 = leitor.nextDouble();
		System.out.println("Informe outro valor:");
		double valor2 = leitor.nextDouble();
		
		System.out.println("A soma dos dois valores e: "+ (valor1+valor2));
		System.out.println("A subtracao dos dois valores e: "+ (valor1-valor2));
		System.out.println("A multiplicacao dois valores e: "+ (valor1*valor2));
		System.out.println("A divisão dos dois valores e: "+ (valor1/valor2));
	}

}
