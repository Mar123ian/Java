import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Въведете данни за ред: " + row + " колона: " + col + ":");
				matrix[row][col] = sc.nextInt();
			}
		}
		int[][] matrix1 = new int[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {

				matrix1[row][col] = matrix[col][row];

			}
		}

		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				System.out.print(" " + matrix1[row][col]);

			}
			System.out.println();
		}
	}
}
