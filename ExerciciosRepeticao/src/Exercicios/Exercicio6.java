package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, cont=0;
		double soma = 0, media;
		System.out.println("Digite um número: ");
		num= ler.nextInt();
		
		do {
			if(num%3==0) {
				soma = soma+num;
				cont++;
			}
			System.out.println("Digite um número: ");
			num= ler.nextInt();
		}while(num != 0);
		media = soma/cont;
		System.out.printf("A média dos valores é %.2f",media);
	}
}
