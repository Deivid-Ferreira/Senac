package br.senac.aula02;

public class ManipulaString {
	public static void main(String[] args) {
		int horaDisponivel = 8;
		int resto;
		String tarefa = "";
		tarefa = tarefa + cadastrarTarefa("001", "Estudar Java", 10, 11);
		tarefa = tarefa + "\n" + cadastrarTarefa("002", "Fazer compras", 11, 12);
		tarefa = tarefa + "\n" + cadastrarTarefa("003", "Limpr casa", 12, 13);
		resto = SubHoras(10, 11);
		horaDisponivel -= resto;
		resto = SubHoras(11, 12);
		horaDisponivel -= resto;
		resto = SubHoras(12, 13);
		horaDisponivel -= resto;
		System.out.println("Codigo - Tarefa - Inicio - Fim");
		System.out.println(tarefa + "\nHora restante :" + horaDisponivel);

	}

	private static Integer SubHoras(int entrada, int saida) {
		int sub = saida - entrada;

		return sub;

	}

	private static String cadastrarTarefa(String codigo, String descricao, int inicio, int fim) {

		return String.format("%s - %s - %d - %d", codigo, descricao, inicio, fim);

	}
	
}