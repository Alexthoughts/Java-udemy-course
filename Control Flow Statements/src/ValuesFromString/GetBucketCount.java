package ValuesFromString;

import java.util.Scanner;

public class GetBucketCount {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,1.5));;
    }
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if (width <=0 || height <=0 || areaPerBucket <=0 || extraBuckets <0){
            return -1;
        }
        double bucketCount = 0;
        int bucketsCount = 0;
            double area = width * height;
            if (extraBuckets != 0){
                double extraBucketsArea = areaPerBucket * extraBuckets;
                area = area - extraBucketsArea;
                if (area <=0){
                    return 0;
                }
            }
            bucketCount = Math.ceil( area / areaPerBucket);
            bucketsCount = (int) bucketCount; //convert double to int
        return bucketsCount;
    }
    public static int getBucketCount (double width, double height, double areaPerBucket){
        if (width <=0 || height <=0 || areaPerBucket <=0){
            return -1;
        }
        double bucketCount = 0;
        int bucketsCount = 0;
        double area = width * height;
        bucketCount = Math.ceil( area / areaPerBucket);
        bucketsCount = (int) bucketCount; //convert double to int
        return bucketsCount;
    }
    public static int getBucketCount (double area, double areaPerBucket){
        if (area <=0 || areaPerBucket <=0){
            return -1;
        }
        double bucketCount = 0;
        int bucketsCount = 0;
        bucketCount = Math.ceil( area / areaPerBucket);
        bucketsCount = (int) bucketCount; //convert double to int
        return bucketsCount;
    }
}
