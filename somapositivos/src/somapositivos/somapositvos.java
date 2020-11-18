package somapositivos;

import java.util.Scanner;

public class somapositvos {

	public static void main(String[] args) {
		int i = 0, num, soma = 0, num1;
		Scanner leia = new Scanner(System.in);
		System.out.println("digite um numero para somar (positvo)\n");
		num = leia.nextInt();
		num1 = num;
		while (num > 0) {
			System.out.println("digite um numero para somar (positvo)\n");
			num = leia.nextInt();
			if (num > 0) {
				soma += num;
				i++;
			}

		}
		double media = (soma + num1) / (i + 1);
		System.out.println("somatorio eh \n" + (soma + num1));
		System.out.println("media eh \n" + media);
		System.out.println("total de numero lidos \n" + (i + 1));
	}

}
