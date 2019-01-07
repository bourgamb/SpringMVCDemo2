package com.bourg.aws.clients;

import java.io.File;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;

@Component 
public class S3Client {
	
	public URL loadReceiptToS3File(String bucket, String receiptName, File file) {
		
		AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();		
		
		PutObjectResult result = s3.putObject(new PutObjectRequest(bucket, receiptName, file).withCannedAcl(CannedAccessControlList.PublicRead));
		URL objUrl = s3.getUrl(bucket, receiptName);
		
		return objUrl;
	}
	
}
