package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int num, soma = 0;
			System.out.println("Digite um número: ");
			num= ler.nextInt();
			
			do {
				soma = soma+num;
				System.out.println("Digite um número: ");
				num= ler.nextInt();
			}while(num != 0);
			System.out.printf("A soma dos valores digitados é %d", soma);
		}
}
