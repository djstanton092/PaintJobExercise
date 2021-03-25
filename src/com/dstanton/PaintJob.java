package com.dstanton;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0 ){

            return (int) Math.ceil((width * height / areaPerBucket) - extraBuckets);
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }
}
