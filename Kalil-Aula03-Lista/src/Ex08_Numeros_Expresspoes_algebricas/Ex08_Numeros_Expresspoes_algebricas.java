package Ex08_Numeros_Expresspoes_algebricas;

import java.util.Scanner;

public class Ex08_Numeros_Expresspoes_algebricas {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe um numero : ");
		int numero = in.nextInt();
		System.out.println("Informe um segundo numero : ");
		int numero2 = in.nextInt();
		System.out.println("Informe um terceiro numero : ");
		double numero3 = in.nextDouble();

		double produto = produto(numero, numero2, numero3); // O produto do dobro do primeiro com metade do segundo .
		double soma = soma(numero, numero2, numero3); // A soma do triplo do primeiro com o terceiro.
		double cubo = cubo(numero, numero2, numero3); // O terceiro elevado ao cubo.

		System.out.println("O produto do dobro do primeiro com metade do segundo : " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro : " + soma);
		System.out.println("O terceiro elevado ao cubo : " + cubo);

		in.close();

	}

	private static double produto(int numero, int numero2, double numero3) {

		return (2 * numero) * numero2 / 2;
	}

	private static double soma(int numero, int numero2, double numero3) {

		return (3 * numero) + numero3;
	}

	private static double cubo(int numero, int numero2, double numero3) {

		return Math.pow(numero3, 3);
	}

}
