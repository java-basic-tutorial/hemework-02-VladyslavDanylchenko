package com.softserveinc;

import java.util.Scanner;

/*
    Write a program that determines the minimum of a sequence positive numbers (the length of the sequence is not limited).

    The user should input the numbers until enter a zero or negative number.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    Enter the number after symbol >>>. To exit enter a zero.
    >>> 12
    >>> 75
    >>> 10
    >>> 9
    >>> 23
    >>> 0
    Minimum number is 9
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here

        int n;
        int min = Integer.MAX_VALUE;
        do {
            System.out.print(">>> ");
            n = scanner.nextInt();
            if (n <= 0)
                break;
            min = Math.min(min, n);

        } while (true);

        if (min != Integer.MAX_VALUE) {
            System.out.printf("Minimum number is %d\n", min);
        } else {
            System.out.println("None of valid numbers entered");
        }
    }
}

// My initial variant of implementation

/*      Scanner scanner = new Scanner(System.in);

        int n;
        int[] arr = new int[0];
        do {
            System.out.print(">>> ");
            n = scanner.nextInt();
            if (n <= 0)
                break;
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = n;
        } while (true);

        if (arr.length != 0) {
            int min = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            System.out.printf("Minimum number is %d\n", arr[min]);
        } else {
            System.out.println("None of valid numbers entered");
        }
    }
*/
