package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder hello = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int small = i * j;
               if (small < 10) {
                    hello.append("  ");
                    hello.append(small);
                            hello.append(" ");
                            hello.append("|");
                }
               else {
                   hello.append(" ");
                   hello.append(small);
                   hello.append(" ");
                   hello.append("|");
               }

            }
            hello.append("\n");

        }return hello.toString();
    } //end getSmall

    public static String getLargeMultiplicationTable() {
        StringBuilder hello = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int small = i * j;
                if (small < 10) {
                    hello.append("  ");
                    hello.append(small);
                    hello.append(" ");
                    hello.append("|");
                } else if (10 <= small && small < 100) {
                    hello.append(" ");
                    hello.append(small);
                    hello.append(" ");
                    hello.append("|");
                } else {
                    hello.append(small);
                    hello.append(" ");
                    hello.append("|");

                }

            } hello.append("\n");

        }return hello.toString();
    }// end getlarge

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder hello = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                int small = i * j;
                if (small < 10) {
                    hello.append("  ");
                    hello.append(small);
                    hello.append(" ");
                    hello.append("|");
                } else if (10 <= small && small < 100) {
                    hello.append(" ");
                    hello.append(small);
                    hello.append(" ");
                    hello.append("|");
                } else {
                    hello.append(small);
                    hello.append(" ");
                    hello.append("|");

                }

            } hello.append("\n");

        }return hello.toString();
    }
}
