
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

   public class Main {
	 public static void main(String[] args) {
	  try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Digite o primeiro numero: ");
		double numero1 = scanner.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double numero2 = scanner.nextDouble();
		double resultado = numero1 + numero2;
		System.out.println("A soma é: " + resultado);
	  }
	}
}	 