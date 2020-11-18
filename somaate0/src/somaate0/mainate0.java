package somaate0;

import java.util.Scanner;

public class mainate0 {

	public static void main(String[] args) {
		int num, x = 0;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("digite um numero e 0 para sair \n");
			num = leia.nextInt();
			x += num;

		} while (num != 0);
		System.out.println("valor da soma \n" + x);
	}

}
