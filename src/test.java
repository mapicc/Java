
import java.util.Scanner;

public class test {

	public static int Fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int n0 = 0, n1 = 1;
		for (int i = 1; i < n; i++){
			int tmp = n1;
			n1 = n1 + n0;
			n0 = tmp;
		}
		return n1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int line = 0;
		while (line++ < 1 && scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int i = 0;
			while (Fibonacci(i) < a) {
				i++;
			}
			int big = Fibonacci(i) - a;
			int small = a - Fibonacci(i - 1);
			System.out.println(big < small ? big : small);
		}
	}

}
