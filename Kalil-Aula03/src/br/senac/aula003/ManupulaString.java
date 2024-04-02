package br.senac.aula003;

public class ManupulaString {

	public static void main(String[] args) {
		
		
		
		
		Tarefa t01 = new Tarefa("002","Estudar Java", 10,11);
		Tarefa t02 = new Tarefa("002","Fazer Compras", 11,12);
		Tarefa t03 = new Tarefa("003","Limpar Casa", 13,14);
		
		System.out.println(t01.getCod());
		System.out.println(t02.getCod());
		System.out.println(t03.getCod());
	}

}
