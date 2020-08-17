package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, id;
		System.out.println("Digite sua idade completa. Anos: ");
		anos = ler.nextInt();
		System.out.println("Meses: ");
		meses = ler.nextInt();
		System.out.println("Dias: ");
		dias = ler.nextInt();
		
		id = anos*365 + meses*30 + dias;
		System.out.println("Sua idade em dias é :");
		System.out.println(id);
	}

}
