package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	//1.Get method
	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient=	HttpClients.createDefault();  //to create connection
		HttpGet httpGet=new HttpGet(url);  //to get url
		CloseableHttpResponse httpresponce=  httpClient.execute(httpGet);   //executes ..hit the get url
		
		//Getting ststus code
		int statusCode=httpresponce.getStatusLine().getStatusCode();
		System.out.println("Status Code  >>>>"+statusCode );
		
		//string the response as string object
		String responseString=EntityUtils.toString(httpresponce.getEntity(), "UTF-8");
		
		//converting string to json 
		JSONObject responsejson= new JSONObject(responseString);
		System.out.println("resopnse jon >>>"+ responsejson);
		
		//getting Headers from respnose string
		Header[] headerArray=httpresponce.getAllHeaders();
		
		//converting array to Hashmap
		HashMap<String, String> allHeaders=new HashMap<String, String>();
		
		for(Header header:headerArray) {
			allHeaders.put(header.getName(), header.getValue());
				}
		System.out.println("headerArray>>  "+allHeaders);
		
	}
	
	
	
	
	
	
}
