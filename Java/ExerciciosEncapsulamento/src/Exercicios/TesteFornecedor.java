package Exercicios;

public class TesteFornecedor {
	public static void main(String[] args) {
		Fornecedor n1 = new Fornecedor("Matheus Garcia", "Rua encanto, 100", "(11)95588-3322", 22,"Masculino", 15000.80, 8000.30 );
		
		System.out.println("Nome: "+n1.getNome()+"\tIdade: "+n1.getIdade()+"\tSexo: "+n1.getSexo());
		System.out.println("Endereço: "+n1.getEndereco()+"\tTelefone: "+n1.getTelefone());
		System.out.printf("Saldo: %.2f",n1.obterSaldo(n1.getValorCredito(), n1.getValorDivida()));
		
	}
}
