import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int numero = scanner.nextInt();
		
		int soma = 0;
		int contagem = 0;
		
		while (true) {
			if (numero == 0) {
				break;
			}
			int resto = numero % 2;
			if (resto == 1) {
				numero += 1; 
			} 
			soma += numero;
			numero += 2;
			contagem += 1;
			if (contagem == 5) {
				System.out.println("SOMA = " + soma);
				soma = 0;
				contagem = 0;
				System.out.print("Digite um numero inteiro: ");
				numero = scanner.nextInt();
			} 
		}
		scanner.close();
	}
	
}
