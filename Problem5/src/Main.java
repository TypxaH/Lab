public class Main {
    public static double getSumOfElementsAboveMainDiagonal(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                    sum += array[i][j];
                }
            }
        return sum;
        }


    public static void printElementsAboveMainDiagonal(double[][] array) {
        System.out.print("\nElements of the matrix above the main diagonal are: ");
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }


    public static void main(String[] args) {
        double[][] inputArray1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        double[][] inputArray2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printElementsAboveMainDiagonal(inputArray1);
        System.out.println("\nThe sum of elements is: "+getSumOfElementsAboveMainDiagonal(inputArray1));
        printElementsAboveMainDiagonal(inputArray2);
        System.out.println("\nThe sum of elements is: "+getSumOfElementsAboveMainDiagonal(inputArray2));
    }
}