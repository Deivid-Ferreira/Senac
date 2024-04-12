package Interrogatorio;

public class Respostas {

	public int resp1;
	public int resp2;
	public int resp3;
	public int resp4;
	public int resp5;

	public Respostas(int resp1, int resp2, int resp3, int resp4, int resp5) {
		this.resp1 = resp1;
		this.resp2 = resp2;
		this.resp3 = resp3;
		this.resp4 = resp4;
		this.resp5 = resp5;
	}

	public int contadorDeRespostas() {
		int contador = 0;
		if (resp1 == 0) {
			contador++;
		}
		if (resp2 == 0) {
			contador++;
		}
		if (resp3 == 0) {
			contador++;
		}

		if (resp4 == 0) {
			contador++;
		}
		if (resp5 == 0) {
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
