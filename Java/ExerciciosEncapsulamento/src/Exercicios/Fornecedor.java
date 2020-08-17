package Exercicios;

public class Fornecedor extends Pessoa {
		private double valorCredito;
		private double valorDivida;
		double saldo;
		
		public Fornecedor(String nome, String endereco, String telefone, int idade, String sexo,  double valorCredito, double valorDivida) {
			super(nome, endereco, telefone, idade, sexo);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}

		public double getValorCredito() {
			return valorCredito;
		}

		public void setValorCredito(double valorCredito) {
			this.valorCredito = valorCredito;
		}

		public double getValorDivida() {
			return valorDivida;
		}

		public void setValorDivida(double valorDivida) {
			this.valorDivida = valorDivida;
		}
		public double obterSaldo(double valorCredito, double valorDivida) {
			saldo = valorCredito - valorDivida;
			return saldo;
		}
}
