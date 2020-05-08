package com.qa.test;

import java.io.IOException;

import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.TestNGUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Utils.TestUtils;

import com.qa.client.Rest_Client;

public class Get_Api_Test extends TestBase {

	public Get_Api_Test() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String URL;
	

	@BeforeMethod
	public void setUp() throws IOException {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("url");
		apiUrl = prop.getProperty("serviceURL");

		URL = serviceUrl + apiUrl;

	}

	@Test
	public void getAPITest() throws ClientProtocolException, IOException {

		Rest_Client restClient = new Rest_Client();
		restClient.get(URL);
		
	}

}
