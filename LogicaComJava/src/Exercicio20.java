import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		/*
		 A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
		um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
		desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
		sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
		Informar total de carros com ano até 2000 e total geral;
		 */
		Scanner leitor = new Scanner(System.in);
		int totalCarrosComDesconto = 0, totalCarros = 0;
		char controleRepeticao = 's';
		
		while(controleRepeticao == 's' || controleRepeticao == 'S') {
			System.out.println("Informe o ano do veiculo:");
			int ano = leitor.nextInt();
			System.out.println("Informe o valor do veiculo:");
			double valorVeiculo = leitor.nextDouble();
			
			if (ano <= 2000) {
				System.out.println("O valor do desconto foi de: "+valorVeiculo * 0.12);
				System.out.println("O valor a ser pago vai ser de: "+(valorVeiculo + (valorVeiculo * 0.12)));
				totalCarrosComDesconto ++;
			} else {
				System.out.println("O valor do desconto foi de: "+valorVeiculo * 0.07);
				System.out.println("O valor a ser pago vai ser de: "+(valorVeiculo + (valorVeiculo * 0.07)));
			}
			totalCarros ++;
			
			System.out.println("Deseja continuar? S - para sim | N - para nao");
			controleRepeticao = leitor.next().charAt(0);
		}
		System.out.println("Total de carros com ano ate 2000: "+totalCarrosComDesconto);
		System.out.println("Total geral de carros: "+totalCarros);
	}
}