package com.bourg.model;

import java.io.File;
import java.net.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receipt_details")
public class Receipt {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int receiptId;
	
	@Column(name="bucket_name")
	private String bucketName;
	
	@Column(name="image_name" )
	private String imageName;
	
	@Column(name="s3_url" )
	private URL s3URL;
	
	@Column(name="image_text" )
	private String imageText;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public URL getS3URL() {
		return s3URL;
	}

	public void setS3URL(URL s3url) {
		s3URL = s3url;
	}

	public String getImageText() {
		return imageText;
	}

	public void setImageText(String imageText) {
		this.imageText = imageText;
	}
	
	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}



	public Receipt() {		
	}

	public Receipt(String imageName, URL s3url, String imageText) {	
		this.imageName = imageName;
		this.s3URL = s3url;
		this.imageText = imageText;
	}

	@Override
	public String toString() {
		return "ReceiptDetails [receiptId=" + receiptId + ", imageName=" + imageName + ", s3URL=" + s3URL
				+ ", imageText=" + imageText + "]";
	}
	
}

