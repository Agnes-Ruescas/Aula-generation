package Exercicios;

public class TesteAviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		aviao1.setModelo("Airbus A380");
		aviao1.setNumeroDeVoo("G37685");
		
		System.out.println("O a vião modelo "+aviao1.getModelo()+" está realizando o voo"+aviao1.getNumeroDeVoo());
		
	}
}
