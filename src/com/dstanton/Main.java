package com.dstanton;

public class Main {

    public static void main(String[] args) {
// *getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid
        testGetBucketCount(-3.4, 2.1, 1.5, 2, -1);

// *getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
        testGetBucketCount(3.4, 2.1, 1.5, 2, 3);

// *getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
        testGetBucketCount(2.75, 3.25, 2.5, 1, 3);

// *getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
        testGetBucketCount(-3.4, 2.1, 1.5, -1);

// *getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
        testGetBucketCount(3.4, 2.1, 1.5, 5);

// *getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
        testGetBucketCount(7.25, 4.3, 2.35, 14);

    }

    public static void testGetBucketCount(double width, double height, double areaPerBucket, int extraBuckets, int expected){
        int result = PaintJob.getBucketCount(width, height, areaPerBucket, extraBuckets);
        String passFail = (result == expected) ? "PASS": "FAIL";
        System.out.printf("%s getBucketCount(%f, %f, %f, %d) returned %d, expected %d %n",
                            passFail, width, height, areaPerBucket, extraBuckets, result, expected);
    }

    public static void testGetBucketCount(double width, double height, double areaPerBucket, int expected){
        int result = PaintJob.getBucketCount(width, height, areaPerBucket);
        String passFail = (result == expected) ? "PASS": "FAIL";
        System.out.printf("%s getBucketCount(%f, %f, %f) returned %d, expected %d %n",
                passFail, width, height, areaPerBucket, result, expected);
    }


}
