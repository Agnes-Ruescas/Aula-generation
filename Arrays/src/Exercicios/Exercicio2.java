package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int vetor[] = new int[6],somaPar=0,quantImpar=0;
		Scanner ler = new Scanner(System.in);
		
		for(int x =0;x<6;x++) {
			System.out.println("Digite um valor: ");
			vetor[x]= ler.nextInt();
			
			if(vetor[x]%2==0) {
				System.out.println("Valor par: "+vetor[x]);
				somaPar= somaPar+vetor[x];
			}
			else {
				System.out.println("Valor impar: "+vetor[x]);
				quantImpar++;
			}
		}
		System.out.println("O somatório de número pares é: "+somaPar);
		System.out.println("A quantidade de valores ímpares é: "+quantImpar);
	}
}
