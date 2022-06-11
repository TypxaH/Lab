public class Main {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]");
    }

    public static int[] arrayByCondition(int[] array) {
        int[] resultArray = new int[array.length];
        resultArray[0] = array[0];
        resultArray[array.length - 1] = array[array.length - 1];
        for (int i = 1; i < array.length - 1; i++) {
            resultArray[i] = array[i - 1] + array[i + 1];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Input array is: ");
        printArray(inputArray);
        System.out.print("\nOutput array is: ");
        int[] outputArray = arrayByCondition(inputArray);
        printArray(outputArray);
    }
}