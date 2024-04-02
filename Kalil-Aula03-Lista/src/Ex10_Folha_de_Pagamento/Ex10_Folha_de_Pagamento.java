package Ex10_Folha_de_Pagamento;

import java.util.Scanner;

public class Ex10_Folha_de_Pagamento {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe quanto recebe por hora :  ");
		Double numero = in.nextDouble();

		System.out.println("Informe as horas trabalhadas :  ");
		Double numero2 = in.nextDouble();
		double calculo = salarioBruto(numero, numero2);

		System.out.println("Salario bruto : " + calculo);
		double salario = calculo;
		double salarioLiquido = calculo;
		salario = pagamentoINSS(salario);
		System.out.println("Pago ao INSS : " + salario);
		salarioLiquido -= salario;
		salario = calculo;
		salario = pagamentoSindicato(salario);
		System.out.println("Pago ao Sindicato : " + salario);
		salarioLiquido -= salario;
		salario = calculo;
		salario = pagamentoimpostoDeRenda(salario);
		System.out.println("Pago ao Imposto de renda : " + salario); // esse não foi pedido para printar no ex mas
																		// coloquei.

		salarioLiquido -= salario;
		System.out.println("Salario líquido " + salarioLiquido); // Ta de brincadeira esse LEAO ai em.

		in.close();

	}

	private static double pagamentoimpostoDeRenda(double salario) {

		return salario * 0.11;
	}

	private static double pagamentoSindicato(double salario) {

		return (salario * 0.05);
	}

	private static double pagamentoINSS(double salario) {

		return (salario * 0.08);
	}

	private static double salarioBruto(Double n1, Double n2) {

		return n1 * n2;
	}

}
