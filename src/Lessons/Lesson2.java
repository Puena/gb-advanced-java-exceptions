package Lessons;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lesson2 {
    public void task1() {
        System.out.println(promptForFloat());
    }
    public void task2() {
        var intArray = generateRandomIntArray(10);

        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }

    public void task4() {
        readString();
    }

    private void readString() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter some text: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Blank lines cannot be entered.");
            }

            System.out.println("You entered: " + input);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
    }


    public int[] generateRandomIntArray(int count) {
        var r = new Random();
        return IntStream.iterate(0, i -> r.nextInt(count)).limit(count).toArray();
    }

    public static float promptForFloat() {
        Scanner scanner = new Scanner(System.in);
        float value = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter a float number: ");
            String input = scanner.nextLine();

            try {
                value = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid float value.");
            }
        }

        return value;
    }
}
