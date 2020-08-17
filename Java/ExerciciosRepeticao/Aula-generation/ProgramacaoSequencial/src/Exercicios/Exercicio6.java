package Exercicios;
import java.math.BigInteger;
import java.util.Scanner;
	
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x1,x2,y1,y2,d,xt, yt, delta;
		
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextInt();
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextInt();
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextInt();
		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextInt();
		
		xt = x2-x1;
		yt = y1-y2;
		delta = (int) (Math.pow(xt, 2) + Math.pow(yt, 2));
		d = (int) Math.sqrt(delta);
		
		System.out.println("A dintância entre os dois pontos é: "+d);
	}

}
