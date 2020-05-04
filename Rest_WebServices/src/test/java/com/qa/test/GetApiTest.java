package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.client.RestClient;

public class GetApiTest extends TestBase{

	
	public GetApiTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String URL;
	RestClient restClient;
	@BeforeMethod
	public void setUp() throws IOException {
		testBase= new TestBase();
		serviceUrl=prop.getProperty("url");
		apiUrl=prop.getProperty("serviceURL");
		
		URL=serviceUrl+apiUrl;
	}
	
	@Test
	public void voidgetAPITest() throws ClientProtocolException, IOException {
		
		//calling get method 
		restClient=new RestClient();
		restClient.get(URL);
		
		
	}
	
}

