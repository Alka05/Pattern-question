package star;

public class Number1to9 {

	public static void main(String[] args) {
		int num = 1;
		for (num = 1; num <= 9; num++) {
			int number = 1;
			for (number = 1; number <= num; number++) {
				System.out.print(num);
			}
			System.out.println();
		}

	}

}
