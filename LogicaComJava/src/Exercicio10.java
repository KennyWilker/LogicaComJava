import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		/*
		 10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um
			 algoritmo que receba um valor de uma compra e mostre o valor das prestações;
		 */
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor total da compra:");
		double valorTotalDaCompra = leitor.nextDouble();
		
		System.out.println("O valor das prestacoes ficara em 5X de R$"+(valorTotalDaCompra/5));
	}
}
