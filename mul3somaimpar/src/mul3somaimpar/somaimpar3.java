package mul3somaimpar;

public class somaimpar3 {

	public static void main(String[] args) {
		int i, num = 0;

		for (i = 1; i < 501; i++) {
			if (i % 3 == 0 && i % 2 != 0) {
				num += i;

			}
			System.out.println("a soma eh \n" + num);
		}
	}

}
