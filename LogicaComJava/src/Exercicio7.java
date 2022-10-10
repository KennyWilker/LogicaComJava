import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		/*
		 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
			conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
		*/
		
		Scanner leitor = new Scanner(System.in);
		double grauCelsiu;
		
		System.out.println("Informe uma temperatura em Graus Célsius: ");
		grauCelsiu = leitor.nextDouble();
		
		System.out.println("A temperatura em Graus Fahrenheit e: "+((9*grauCelsiu+160)/5)+"°");
	}
}
