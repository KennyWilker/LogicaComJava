import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		/*
		 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
			dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
			do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
			45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
			mesmo;
		 */
		
		Scanner leitor = new Scanner(System.in);
		double custoVeiculo, percentualDistribuidor = 0.28, percentualImposto = 0.45;
		System.out.println("Informe o custo de fabrica do veiculo:");
		custoVeiculo = leitor.nextDouble();
		
		custoVeiculo = custoVeiculo+(custoVeiculo*percentualImposto);
		custoVeiculo = custoVeiculo+(custoVeiculo*percentualDistribuidor);
		System.out.println("O custo final do veiculo e:"+custoVeiculo);
	}
}
