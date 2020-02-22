package star;

public class Number1then12then123 {

	public static void main(String[] args) {
		int num = 1;
		for (num = 1; num <= 10; num++) {
			int count = 1;
			for (count = 1; count <= num; count++) {
				System.out.print(count);
			}
			System.out.println();
		}

	}
}
