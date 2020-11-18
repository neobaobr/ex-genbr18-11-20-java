package mainate0;

import java.util.Scanner;

public class mult3soma {
	public static void main(String[] args) {
		int num, x = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("digite um numero e 0 para sair \n");
			num = leia.nextInt();
			if (num % 3 == 0) {
				x += num;
			}

		} while (num != 0);
		System.out.println("valor da soma dos mult de 3 \n" + x);
	}
}
