package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Rest_Client {
	
	// Get method

	public int get(String URL) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(URL);
		CloseableHttpResponse httpResponse = httpclient.execute(httpGet);
		int Status_Code = httpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code  >> " + Status_Code);
		return Status_Code;
	}

	// Post method

	public CloseableHttpResponse post(String URL, String entityString, HashMap<String, String> headerMap)
			throws ClientProtocolException, IOException {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(URL); // Post request
		httpPost.setEntity(new StringEntity(entityString)); // For Payload

		// FOr Headers
		for (Map.Entry<String, String> entry : headerMap.entrySet()) {
			httpPost.addHeader(entry.getKey(), entry.getValue());
		}

		// execute http client

		CloseableHttpResponse httpResponse = httpclient.execute(httpPost);
		return httpResponse;
	}

}
