package Ex03_Imprime_A_Soma;

import java.util.Scanner;

public class Ex03_Imprime_A_Soma {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Numero 1 : ");
		int n1 = in.nextInt();
		System.out.println("Numero 2 : ");
		int n2 = in.nextInt();
		int res = n1+n2;
		System.out.println("Soma dos dois numeros : " + res);

		in.close();

	}

}
