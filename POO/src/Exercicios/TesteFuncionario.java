package Exercicios;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Yasmim Ruescas");
		funcionario1.setHorarioDeEntrada("8:00");
		funcionario1.setHorarioDeSaida("18:00");
		
		System.out.println("O/A funcion�rio(a) "+funcionario1.getNome()+" trabalha das "+funcionario1.getHorarioDeEntrada()+" �s "+funcionario1.getHorarioDeSaida());
	}
}
