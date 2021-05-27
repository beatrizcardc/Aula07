import java.util.Scanner;

	public class Calculadora {
	public static double resultado;//vari�vel global criada dentro da classe que poder� ser acessada por todas as fun��es, inclusive a main.
	public static void exibirMenu() { //fun��o exibirMenu, criada fora da main
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua op��o!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtra��o");
		System.out.println("4 - Realizar divis�o");
		System.out.println("5 - Realizar multiplica��o");
		System.out.println("6 - Sair");
	}
	
	public static void exibirResultado() {
		System.out.println("O resultado foi " + resultado + "!");
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		double soma, subtracao, divisao, multiplicacao;
		int opcao = 0;
		
		while (opcao!=6) {
			exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1� valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2� valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			case 2:
				System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
				resultado = valor1 + valor2;
				exibirResultado();
				
				break;
			case 3:
				System.out.println("\n\nRealizando a subtra��o entre " + valor1 + " e " + valor2);
				resultado = valor1 - valor2;
				exibirResultado();;
				break;
			case 4:
				System.out.println("\n\nRealizando a divis�o entre " + valor1 + " e " + valor2);
				resultado = valor1 / valor2;
				exibirResultado();
				break;
			case 5:
				System.out.println("\n\nRealizando a multiplica��o entre " + valor1 + " e " + valor2);
				resultado = valor1 * valor2;
				exibirResultado();
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
