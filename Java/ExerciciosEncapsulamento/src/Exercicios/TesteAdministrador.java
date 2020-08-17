package Exercicios;

public class TesteAdministrador {
	public static void main(String[] args) {
		Administrador n1 = new Administrador("Rafael Oliveira", "Rua Omacha, 176", "(11)98877-6655", 21, "Masculino", 2500.0, 580.0);
		System.out.println("Nome: "+n1.getNome()+"\tIdade: "+n1.getIdade()+"\tSexo: "+n1.getSexo());
		System.out.println("Endereço: "+n1.getEndereco()+"\tTelefone: "+n1.getTelefone());
		System.out.printf("O salário é %.2f",n1.getSalario());
		System.out.printf("\nCom a ajuda de custo o salário fica %.2f", n1.salarioAjustado(n1.getSalario(), n1.getAjudaDeCusto()));
	}
}
