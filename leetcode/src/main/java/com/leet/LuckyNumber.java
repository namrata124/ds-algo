package com.leet;

import java.util.ArrayList;

public class LuckyNumber {


    public static int findLucky(int[] arr) {

        int countreplicate = 0;
        int doubleCount = 0;
        int returnvariable = 0;
        ArrayList<Integer> luckynum = new ArrayList<Integer>(10);

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(luckynum[0]);
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    countreplicate++;

                }


            }

            if (i != 0) {
                for (int p = 0; p <= i - 1; p++) {
                    if (arr[i] == arr[p]) {
                        doubleCount++;

                    }
                }
            }

            if (countreplicate + 1 == arr[i] && doubleCount == 0) {
                luckynum.add(arr[i]);
            }
            countreplicate = 0;
            doubleCount = 0;
        }

        System.out.println(luckynum.size());

        if (luckynum.isEmpty()== true) {
            returnvariable = -1;
        } else if (luckynum.size() == 1) {

            returnvariable = luckynum.get(0);

        } else if (luckynum.size() > 1) {

            int hight = luckynum.get(0);
            for (int k = 1; k < luckynum.size(); k++) {
                if (luckynum.get(k)> hight) {

                    hight = luckynum.get(k);

                }
            }
            returnvariable = hight;

        }


        return returnvariable;
    }


    public static void main(String[] args) {
        int[] nums = {2, 2, 3,3,2};
        int output = findLucky(nums);
        System.out.println(output);
    }
}
