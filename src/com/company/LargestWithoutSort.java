package com.company;

public class LargestWithoutSort {

    public static void main(String[] args) {
        int[] intArray = {1,25,3,4,10,9,6,15,4,6};
        largestNumber(intArray);
    }

    private static int largestNumber (int[] intArray) {

        int largestNumber = 0;
        int j = 0;
        for (int i = 0; i<intArray.length; i++) {
            intArray[i] = intArray[j];

            for (j=0; j < intArray.length; j++) {
                if (intArray[j] > intArray[i])
                    largestNumber = intArray[j];
            }
        }
        System.out.println("Jatan and Jinal 2");
        System.out.println(largestNumber);
        System.out.println(largestNumber);
        return largestNumber;

    }

}
