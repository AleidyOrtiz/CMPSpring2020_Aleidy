package Week2;
	import java.util.Scanner;

	public class Practice2 {
		public static void main(String[] argv) {
			Scanner keyboard  = new Scanner(System.in);
			System.out.print("N1: ");
			int num1 = keyboard.nextInt();
			System.out.print("N2: ");
			int num2 = keyboard.nextInt();
			System.out.print("N3: ");
			int num3 = keyboard.nextInt();
			System.out.print(String.format(
					"The product of  %d, %d, and %d is %d.",
					num1, num2, num3, num1 * num2 * num3
			));
		}
	}

	
