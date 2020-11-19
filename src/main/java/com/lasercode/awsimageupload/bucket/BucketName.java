package com.lasercode.awsimageupload.bucket;/*
 * Created By Arjun Gautam .
 * Date : 11/12/20
 * Time : 7:57 PM
 */

public enum BucketName {

    PROFILE_IMAGE("//s3bucketname");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
