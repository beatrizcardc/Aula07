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
	
	public static void exibirResultado(double resultado) {
		System.out.println("O resultado foi " + resultado + "!");
	}
	//fun��o somar, subtrair, multiplicar, dividir com seus argumentos
	public static void somar(double primeiroValor, double segundoValor) {
		double soma;
		System.out.println("\n\nRealizando a soma entre " + primeiroValor + " e " + segundoValor);
		soma = primeiroValor + segundoValor;
		exibirResultado(soma);
	}
	
	public static void subtrair(double primeiroValor, double segundoValor) {
		double subtracao;
		System.out.println("\n\nRealizando a subtra��o entre " + primeiroValor + " e " + segundoValor);
		subtracao = primeiroValor - segundoValor;
		exibirResultado(subtracao);
	}
	
	public static void dividir(double primeiroValor, double segundoValor) {
		double divisao;
		System.out.println("\n\nRealizando a divis�o entre " + primeiroValor + " e " + segundoValor);
		divisao = primeiroValor / segundoValor;
		exibirResultado(divisao);
	}
	
	public static void multiplicar(double primeiroValor, double segundoValor) {
		double multiplicacao;
		System.out.println("\n\nRealizando a multiplica��o entre " + primeiroValor + " e " + segundoValor);
		multiplicacao = primeiroValor * segundoValor;
		exibirResultado(multiplicacao);
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		double soma=0, subtracao=0, divisao=0, multiplicacao=0;
		
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
				somar(valor1, valor2);
				break;
				
			case 3:
				subtrair(valor1,valor2);
				break;
				
			case 4:
				dividir(valor1, valor2);
				break;
			case 5:
				multiplicar(valor1, valor2);
				break;
				
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
