package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String ans1 ="";
        for (int i = start; i < stop; i++) {
            if (i%2 == 0) {
                 ans1 += String.valueOf(i);
            }
        }

        return ans1;
    }


    public static String getOddNumbers(int start, int stop) {
        String ans2 ="";
        for (int j = start; j < stop; j++) {
            if (j%2 != 0) {
                ans2 += String.valueOf(j);
            }
        }

        return ans2;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String ans3 ="";
        for (int i = start; i < stop; i = i + step) {
            int h = i*i;
            ans3 += String.valueOf(h);
        }
        return ans3;
    }

    public static String getRange(int stop) {
    String ans4 = "";

    for (int i = 0; i < stop; i++) {
            ans4 += String.valueOf(i);
    }
        return ans4;
    }

    public static String getRange(int start, int stop) {
        String ans5 ="";
        for (int i = start; i < stop ; i++) {
            ans5 += String.valueOf(i);
        }
        return ans5;
    }


    public static String getRange(int start, int stop, int step) {
        String ans6 ="";
        for (int i = start; i < stop ; i = step + i) {
            ans6 += String.valueOf(i);
        }
        return ans6;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String ans7 ="";
        for (int i = start; i < stop; i = step + i) {
            int a = (int) Math.pow(i,exponent);
            ans7 += String.valueOf(a);
        }
        return ans7;
    }
}
