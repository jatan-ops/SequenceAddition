package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SequenceAddition {

    public static void main(String[] args) {
        Set<String> set = readSequence();
        String concateVersion = concateFunction(set);
        char[] digitArray;
        do {
            digitArray = digitsArray(concateVersion);
            concateVersion = getSum(digitArray);
        } while (digitArray.length >1);
    }

    private static Set<String> readSequence() {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet();
        System.out.print("Enter the sequence of numbers: ");
        do {
            hashSet.add(sc.next());
        } while (!sc.hasNext("exit"));
        System.out.println(hashSet);
        return hashSet;
    }

    private static String concateFunction (Set<String> set) {

        //*****Method 1*****
        Iterator digit = set.iterator();

        String concateVersion = digit.next().toString(); // initializing string var

        while (digit.hasNext()) {
            concateVersion = concateVersion + digit.next().toString();
        }

        System.out.println(concateVersion);
        return concateVersion;
    }

    private static char[] digitsArray (String concateVersion) {

        // Convert string into char array

        return concateVersion.toCharArray();
    }

    private static String getSum (char[] singleCharArray) {

        //converted each element of char array into int and did sum
        int sum = 0;

        for (int i = 0; i < singleCharArray.length; i++) {
            sum = sum + Integer.parseInt(String.valueOf(singleCharArray[i]));
        }
        System.out.println(sum);
        return Integer.toString(sum);
    }
}
