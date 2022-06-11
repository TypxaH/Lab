public class Main {
    public static boolean isMirrorArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b]");
    }

    public static void main(String[] args) {
        int[] inputArray = {1,2,0,3,2,1};
        System.out.print("The array ");
        printArray(inputArray);
        if (isMirrorArray(inputArray)) {
            System.out.println(" is a mirror array.");
        } else {
            System.out.println(" is NOT a mirror array.");
        }
    }
}