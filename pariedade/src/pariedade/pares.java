package pariedade;

import java.util.Scanner;

public class pares {

	public static void main(String[] args) {
		int i = 0, num, p = 0, im = 0;

		Scanner read = new Scanner(System.in);

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um numero \n");
			num = read.nextInt();
			if (num % 2 == 0) {
				p++;
			} else {
				im++;
			}

		}
		System.out.println("pares \n" + p);
		System.out.println("impares \n" + im);
	}

}
