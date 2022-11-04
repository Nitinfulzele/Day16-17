import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {

		int n = 10, i, j, x;
		int[] array = new int[n];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Elements In Number :");
		for (i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (i = 0; i < (n - 1); i++) {
			for (j = 0; j < (n - i - 1); j++) {
				if (array[j] > array[j + 1]) {
					x = array[j];
					array[j] = array[j + 1];
					array[j + 1] = x;
				}
			}
		}

		System.out.println("\n Bubble Sorted :");
		for (i = 0; i < n; i++)
			System.out.print(array[i] + " ");

	}

}
