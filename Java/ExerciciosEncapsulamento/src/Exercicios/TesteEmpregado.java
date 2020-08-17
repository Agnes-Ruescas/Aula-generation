package Exercicios;

public class TesteEmpregado {
	public static void main(String[] args) {
	Empregado n1 = new Empregado("Marcela Silveira", "Av. Amador Bueno da Veiga, 122", "(11)93344-5566", 19, "Feminino",356, 5650,15);
	
	System.out.println("Nome: "+n1.getNome()+"\tIdade: "+n1.getIdade()+"\tSexo: "+n1.getSexo());
	System.out.println("Endereço: "+n1.getEndereco()+"\tTelefone: "+n1.getTelefone());
	System.out.println("Código do setor: "+n1.getCodigoSetor()+"\nSalário com redução de impostos: "+n1.calcularSalario(n1.getSalarioBase(), n1.getImposto()));
	}
}
