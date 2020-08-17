package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int x,pares = 0,impares = 0;
			
			for(int i=0; i<10; i++) {
				System.out.println("Digite um valor: ");
				x = ler.nextInt();
				if (x%2==0) {
				pares++;
				}
				else{
				impares++;
				}	
			}
			System.out.println("\nQuantidade de números pares: "+pares);
			System.out.println("\nQuantidade de números impares: "+impares);
		}
}
