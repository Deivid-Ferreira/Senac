package Interrogatorio;

public class Respostas {

	public boolean resp1;
	public boolean resp2;
	public boolean resp3;
	public boolean resp4;
	public boolean resp5;

	public Respostas(boolean resp1, boolean resp2, boolean resp3, boolean resp4, boolean resp5) {
		this.resp1 = resp1;
		this.resp2 = resp2;
		this.resp3 = resp3;
		this.resp4 = resp4;
		this.resp5 = resp5;
	}

	public int contadorDeRespostas() {
		int contador = 0;
		if (resp1 == true) {
			contador++;
		}
		if (resp2 == true) {
			contador++;
		}
		if (resp3 == true) {
			contador++;
		}

		if (resp4 == true) {
			contador++;
		}
		if (resp5 == true) {
			contador++;
		}
		return contador;

	}

	public String veredito(int contador) {
		String resposta = "";
		if (contador == 2) {
			resposta = "Suspeito";
		}
		else if (contador == 3 || contador == 4) {
			resposta = "Cúmplice";
		}
		else if (contador == 5) {
			resposta = "Culpado";
		}
		else{
			resposta = "Inocente";
		}

		return resposta;

	}

}
