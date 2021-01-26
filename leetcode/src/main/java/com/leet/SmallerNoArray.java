package com.leet;

// class name should be in camel case
public class SmallerNoArray {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

// write array declaration in java style (not in c style) -> int[] returnNums
        // look for intellij shortcut to auto format code
        int[] returnNums = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (j != i && nums[j] < nums[i]) {

                    count++;
                }


            }

            returnNums[i] = count;
            count = 0;

        }


        return returnNums;

    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 8};
        int[] output = smallerNumbersThanCurrent(nums);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);

        }
        System.out.println("hello");


    }


}
