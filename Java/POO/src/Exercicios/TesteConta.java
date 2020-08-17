package Exercicios;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitularDaConta("Charlene Morais");
		conta.setNumeroDaConta(177579);
		conta.setSaldoDaConta(150000);
		System.out.println("Titular: "+conta.getTitularDaConta());
		System.out.println("Número da conta: "+conta.getNumeroDaConta());
		System.out.println("Saldo: "+conta.getSaldoDaConta());
	}
}
