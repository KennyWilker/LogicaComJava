import java.util.Iterator;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		/*
		 Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
		 (inclusive);
		 */
		Scanner leitor = new Scanner(System.in);
		int qtdNumero = 0;
		
		for (int i = 0; i < 80; i++) {
			System.out.println("Informe um valor:");
			int numero = leitor.nextInt();
			if (numero >= 10 && numero <= 150) {
				qtdNumero ++;
			}
		}
		System.out.println("Quantidade de numeros entre 10 e 150 = "+qtdNumero);
	}
}
