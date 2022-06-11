public class Main {
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\b]");
    }

    public static int[] generateMirrorArray(int array[]) {
        int[] output = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            output[i] = array[i];
            output[array.length * 2 - 1 - i] = array[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] outputArray = generateMirrorArray(inputArray);
        System.out.print("Input array is: ");
        printArray(inputArray);
        System.out.print("\nOutput array is: ");
        printArray(outputArray);
    }
}