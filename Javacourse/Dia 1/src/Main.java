import java.util.Arrays;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	  /*Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		double numero1 = scanner.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double numero2 = scanner.nextDouble();
		double resultado = numero1 + numero2;
		System.out.println("A soma é: " + resultado);*/
		 
		
	  /*
	   *  String[] nome = {"maria", "kaio", "joao"};
	      Arrays.sort(nome);  //organizar arrays
	      System.out.println(Arrays.toString(nome));
	      System.out.println(nome.length);  // quantidade de coisas dentro de um array
	      int[] preçoCar = {19, 40, 50};
		  preçoCar[0] = 23;
		  System.out.println(Arrays.toString(preçoCar));
		  System.out.println(preçoCar[0]);
		  
		  String[][] cars = {{"BMW", "TESLA"}, {"FOX", "FUSCA"}};
		  System.out.println(Arrays.deepToString(cars));
		  System.out.println(cars[0][0]);
		  
		  // constante
		  final double taxaJuros = 11.92;
		  System.out.println(taxaJuros);
		  //taxaJuros = 11.52;
		  System.out.println(taxaJuros);
		  
		 double a = (double)4 / (double)3;
		 System.out.println(a); 
		 
		 int a = 4;
		 a++; // incrementar um numero
		 System.out.println(a);
		 
		 //OPERADORES
		 int a = (6 + 2) * 2;
		 int b = 6 + 2 * 2 -3;
		 System.out.println(a);
		 System.out.println(b);	
		 
		 //CONVERTENTO STRING EM INTEIROS
		 String valorProduto = "10";
		 int valorTotal = Integer.parseInt(valorProduto) + 2;
		 
		 System.out.println(valorProduto);
		 System.out.println(valorTotal); 
		 
		 // class MATH
		 double value = Math.floor(10.2);
		 double number = Math.round(Math.random() * 100);
		 int dados = (int)Math.round(Math.random() * 100);
		 System.out.println(value);
		 System.out.println(number);
		 System.out.println(dados);
		 
	   */
		 
		
			        int[] my_array1 = {
			                1789, 2035, 1899, 1456, 2013,
			                1458, 2458, 1254, 1472, 2365,
			                1456, 2165, 1457, 2456};
			        // printar normal e depois em ordem crescente
			        System.out.println(Arrays.toString(my_array1));
			        Arrays.sort(my_array1);
			        System.out.println(Arrays.toString(my_array1));
			        System.out.println(my_array1.length);
			        
			        
			        String[] my_array2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
			        
			        // printar normal e depois em ordem alfabetica
			        System.out.println(Arrays.toString(my_array2));
			        Arrays.sort(my_array2);
			        System.out.println(Arrays.toString(my_array2));
			        System.out.println(my_array2.length);
	
	 }	
}
