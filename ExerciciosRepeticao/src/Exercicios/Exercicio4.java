package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
		public static void main( String[] args) {
			Scanner ler = new Scanner(System.in);
			int idade,sexo,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,x=1;
			
			while(x<=150) {
				System.out.println("Digite a sua idade: ");
				idade = ler.nextInt();
				System.out.println("Digite o sexo: \n1-Mulheres  \n2-Homens  \n3-Outros");
				sexo = ler.nextInt();
				System.out.println("Digite o valor psicol�gico: \n1-Calmo(a)  \n2-Nervoso(a)  \n3--Afressivo(a)");
				fp= ler.nextInt();
				
				if(fp==1) {
					contpc++;
				}
				if(sexo==1 && fp==2) {
					contmn++;
				}
				if(sexo==2 && fp==3) {
					contha++;
				}
				if(sexo==3 && fp==1) {
					contoc++;
				}
				if(fp==2 && idade>40) {
					contpn40++;
				}
				if(fp==1 && idade<18) {
					
				}
				x++;
			}
			System.out.printf("\nO n�mero de pessoas calmas � %d", contpc);
			System.out.printf("\nO n�mero de mulheres nervosas � %d", contmn);
			System.out.printf("\nO n�mero de homens agressivos �: %d", contha);
			System.out.printf("\nOn�mero de outros calmos �: %d", contoc);
			System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos �: %d", contpn40);
			System.out.printf("\nO n�mero de pessoas calmas com menos de 20 anos �: %d", contpc18);	
		}
}
