package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int duracao, hora, minuto, segundo;
		System.out.println("Digite a duração em segundos: ");
		duracao = ler.nextInt();
		
		hora = duracao/3600;
		minuto= (duracao%3600)/60;
		segundo = (duracao%3600)%60;
		System.out.println("A duração é: " + hora + ":" + minuto + ":" +segundo);
	}
}
