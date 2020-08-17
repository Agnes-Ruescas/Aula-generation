package Exercicios;


public class TesteCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Matheus da Silva");
		cliente1.setCpf("188.288.388-48");
		
		System.out.println("Cliente: "+cliente1.getNome()+", portador do CPF: "+cliente1.getCpf());
				
	}
}
