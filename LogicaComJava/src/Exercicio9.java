import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		/*
		 9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
			mês.Considere fixo o juro da poupança em 0,07% a. m;
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor a ser depositado:");
		double valorDepositado = sc.nextDouble();
		double jurosAoMes = valorDepositado*0.0007;
		
		System.out.println("O valor da poupanca com rendimento em um mes e R$"+(valorDepositado+jurosAoMes));
	}
}
