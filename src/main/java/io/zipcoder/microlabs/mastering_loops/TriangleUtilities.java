package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder stars = new StringBuilder();
        for (int i = 1; i < numberOfRows ; i++) {
            for (int j = 1; j <= i; j++) {
                stars.append("*");
            }
            stars.append("\n");
        }
        return stars.toString();
    }

    public static String getRow(int numberOfStars) {
        // we want numberOfStars amount of ***
        StringBuilder stars = new StringBuilder();
        for (int i = 1; i <= numberOfStars; i++) {
            stars.append("*");
        }

        return stars.toString();
    }

    public static String getSmallTriangle() {
    StringBuilder stars = new StringBuilder();
    for (int i = 1; i <= 4 ; i++) {
        for (int j = 1; j <= i; j++) {


            stars.append("*");

        }
        stars.append("\n");
    }
        return stars.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder stars = new StringBuilder();
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i; j++) {


                stars.append("*");

            }
            stars.append("\n");
        }
        return stars.toString();
    }
}
