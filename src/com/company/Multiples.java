package com.company;

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//        Find the sum of all the multiples of 3 or 5 below 1000.


public class Multiples {

    public int isMultOf3(int i) {
        if (i % 3 == 0) {
            return i;
        }
        return 0;
    }


    public int isMultOf5(int i) {
        if (i % 5 == 0) {
            return i;
        }
        return 0;
    }


    public int sumMulitples() {
        int valueThree;
        int valueFive;
        int sum = 0;

        for (int i = 1; i < 1001; i++) {
            valueFive = isMultOf5(i);
            valueThree = isMultOf3(i);

            if (valueThree != 0) {
                sum = sum + valueThree;
            }
            if (valueFive != 0) {
                sum = sum + valueFive;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
