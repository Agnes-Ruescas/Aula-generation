package Exercicios;

public class TesteAviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		aviao1.setModelo("Airbus A380");
		aviao1.setNumeroDeVoo("G37685");
		
		System.out.println("O a vi�o modelo "+aviao1.getModelo()+" est� realizando o voo"+aviao1.getNumeroDeVoo());
		
	}
}
