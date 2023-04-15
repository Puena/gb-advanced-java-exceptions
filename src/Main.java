import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {5, 10, 15};

        try {
            int[] diff = getDifference(arr1, arr2);
            System.out.println(Arrays.toString(diff));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            int[] quotient = getQuotient(arr1, arr2);
            System.out.println(Arrays.toString(quotient));
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // try with arrays of different length
        int[] arr3 = {10, 20};

        try {
            int[] diff = getDifference(arr1, arr3);
            System.out.println(Arrays.toString(diff));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            int[] quotient = getQuotient(arr1, arr3);
            System.out.println(Arrays.toString(quotient));
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // try with zero values
        int[] arr4 = {10, 20, 0};

        try {
            int[] diff = getDifference(arr1, arr4);
            System.out.println(Arrays.toString(diff));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            int[] quotient = getQuotient(arr1, arr4);
            System.out.println(Arrays.toString(quotient));
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int[] getDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have equal length");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static int[] getQuotient(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays must have equal length");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }



}