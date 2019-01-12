package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class DogPicture{
	

	private String url;

	public DogPicture(String url) {
		super();
		this.url = url;
	}
	
	 public DogPicture() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "DogPicture [url=" + url + "]";
	}

	 
}
