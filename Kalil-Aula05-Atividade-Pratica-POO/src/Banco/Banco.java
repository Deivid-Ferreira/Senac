package Banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe o valor do emprestimo: ");
		double emprestimo = in.nextDouble();
		System.out.println("Quantas parcelas ?");
		double parcelas = in.nextInt();

		Emprestimo emprestimoOBJ = new Emprestimo(emprestimo, parcelas);

		System.out.println(emprestimoOBJ.jurosComposto());
		in.close();

	}

}
