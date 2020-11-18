package somate;

import java.util.Scanner;

public class somate {

	public static void main(String[] args) {
		int num, i = 0, soma = 0;

		Scanner read = new Scanner(System.in);
		System.out.println("digite um valor \n");
		num = read.nextInt();

		do {
			soma += i;
			System.out.println("soma + \n" + i);
			i++;
		} while (i <= num);
		System.out.println("total = \n" + soma);

	}

}
