import java.util.Scanner;

public class Main {

    public static void printArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b");
    }

    public static long[] getFibonacciArray(int n) {
        long[] fibonacciArray = new long[n];
        if (n == 1) {
            return fibonacciArray;
        }
        fibonacciArray[1] = 1;
        for (int i = 2; i <n; i++) {
            fibonacciArray[i] = fibonacciArray[i-2]+fibonacciArray[i-1];
        }
        return fibonacciArray;
    }

    public static void main(String[] args) {
        System.out.print("Enter a whole number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Òhe first %d fibonacci numbers are: ",n);
        printArray(getFibonacciArray(n));
    }
}