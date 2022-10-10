import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
			por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
			efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
		 */
		
		String nomeVendedor;
		double salarioFixo, totalDeVendas, comissao = 0.15;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o nome do vendedor:");
		nomeVendedor = leitor.nextLine();
		System.out.println("Informe o salario fixo de "+ nomeVendedor);
		salarioFixo = leitor.nextDouble();
		System.out.println("Informe o valor das vendas de "+nomeVendedor+" neste mes:");
		totalDeVendas = leitor.nextDouble();
		comissao = totalDeVendas * comissao;
		
		System.out.println(nomeVendedor);
		System.out.println("Salario fixo: "+ salarioFixo);
		System.out.println("Salario final: "+ (salarioFixo+comissao));
	}

}
