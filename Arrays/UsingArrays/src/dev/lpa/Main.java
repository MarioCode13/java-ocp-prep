package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Fourth array: " + Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println("3rd after sorting 4th: " + Arrays.toString(thirdArray));
        System.out.println("Sorted 4th: " + Arrays.toString(fourthArray));


        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println("Smaller array: " + Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Abel", "Jane", "Mark", "Ralph", "David", "Alex"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Abel") >= 0) {
            System.out.println("Found Abel");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,5,4};

        if(Arrays.equals(s1, s2)) {
            System.out.println("Same array");
        } else {
            System.out.println("Different array");
        }
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
