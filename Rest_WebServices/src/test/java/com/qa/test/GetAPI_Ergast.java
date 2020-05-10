package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.client.Rest_Client;

public class GetAPI_Ergast extends TestBase {

	public GetAPI_Ergast() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	CloseableHttpResponse httpResponse;

	@Test
	public void GetResponce() throws ClientProtocolException, IOException {

		Rest_Client restClient = new Rest_Client();
		restClient.get(prop.getProperty("URL2"));
		
		String responseString=EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
		System.out.println("responseString  "+responseString);

	}
}
