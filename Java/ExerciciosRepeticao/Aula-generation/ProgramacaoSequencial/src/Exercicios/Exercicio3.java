package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int duracao, hora, minuto, segundo;
		System.out.println("Digite a dura��o em segundos: ");
		duracao = ler.nextInt();
		
		hora = duracao/3600;
		minuto= (duracao%3600)/60;
		segundo = (duracao%3600)%60;
		System.out.println("A dura��o �: " + hora + ":" + minuto + ":" +segundo);
	}
}
