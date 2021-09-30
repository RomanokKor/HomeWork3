package com.roma;

public class Main {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        test[0] = 5;
        test[1] = 2;
        test[2] = 3;
        test[3] = 4;
        test[4] = 1;
        int total = 0;
        total = test[test.length - 3] + test[test.length - 5];
        System.out.println(total);

        /*еще получился такой вариант
        int total = 0;
        for (int i = 0; i < test[test.length - 3]; i++) {
            total = test[i] + test[0];
        }
        System.out.println(total);
         */
    }
}


