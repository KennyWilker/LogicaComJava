import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		/*
		 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
			 preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário
		 */
		
		Scanner leitor = new Scanner(System.in);
		double precoCusto, percentualAcrescimo, valorDeVenda;
		
		System.out.println("Informe o preco de custo do produto:");
		precoCusto = leitor.nextDouble();
		System.out.println("Informe o percentual de acrescimo:");
		percentualAcrescimo = leitor.nextDouble();
		
		valorDeVenda = precoCusto + (precoCusto*(percentualAcrescimo/100));
		System.out.println("O valor de venda do produto e:"+valorDeVenda);
	}
}
