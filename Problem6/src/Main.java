import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void generateMatrix(int[][] mtr) {
        int count = 0;
        for (int col = mtr[0].length - 1; col >= 0; col--) {
            for (int raw = mtr.length - 1; raw >= 0; raw--) {
                mtr[raw][col] = count += 3;
            }
        }
    }

    public static void printMatrix(int[][] mtr) {
        for (int raw = 0; raw < mtr.length; raw++) {
            for (int column = 0; column < mtr[0].length; column++) {
                System.out.print(mtr[raw][column] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of matrix rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of matrix columns: ");
        int m = scanner.nextInt();

        int[][] matrixInverseByColumns = new int[n][m];

        generateMatrix(matrixInverseByColumns);
        System.out.println("Output matrix is:");
        printMatrix(matrixInverseByColumns);
        //System.out.println(Arrays.toString(matrixInverseByColumns));
    }
}