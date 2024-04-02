package Ex02_Recebe_Numero;

import java.util.Scanner;

public class Ex02_Recebe_Numero {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe um numero : ");
		int numero = in.nextInt();

		System.out.println("Numero digitado : " + numero);

		in.close();
	}

}
