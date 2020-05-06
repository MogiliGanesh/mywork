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
		/*
		 * // Getting status code int statusCode =
		 * httpResponse.getStatusLine().getStatusCode();
		 * System.out.println("Status Code  >>>>" + statusCode);
		 * Assert.assertEquals(statusCode,
		 * Expected_Status_Code_200,"status code not matched");
		 * 
		 * // string the response as string object String responseString =
		 * EntityUtils.toString(httpresponce.getEntity(), "UTF-8");
		 * 
		 * // converting string to json JSONObject responsejson = new
		 * JSONObject(responseString); System.out.println("resopnse jon >>>" +
		 * responsejson);
		 * 
		 * //single value assertion: //per_page: String perPageValue =
		 * TestUtils.getValueByJPath(responsejson, "/per_page");
		 * System.out.println("value of per page is-->"+ perPageValue);
		 * Assert.assertEquals(Integer.parseInt(perPageValue), 3);
		 * 
		 * //total: String totalValue = TestUtils.getValueByJPath(responsejson,
		 * "/total"); System.out.println("value of total is-->"+ totalValue);
		 * Assert.assertEquals(Integer.parseInt(totalValue), 12);
		 * 
		 * //get the value from JSON ARRAY: String lastName =
		 * TestUtils.getValueByJPath(responsejson, "/data[0]/last_name"); String id =
		 * TestUtils.getValueByJPath(responsejson, "/data[0]/id"); String avatar =
		 * TestUtils.getValueByJPath(responsejson, "/data[0]/avatar"); String firstName
		 * = TestUtils.getValueByJPath(responsejson, "/data[0]/first_name");
		 * 
		 * System.out.println(lastName); System.out.println(id);
		 * System.out.println(avatar); System.out.println(firstName); // getting Headers
		 * from respnose string Header[] headerArray = httpresponce.getAllHeaders();
		 * 
		 * // converting array to Hashmap HashMap<String, String> allHeaders = new
		 * HashMap<String, String>();
		 * 
		 * for (Header header : headerArray) { allHeaders.put(header.getName(),
		 * header.getValue()); } System.out.println("headerArray>>  " + allHeaders);
		 * 
		 * 
		 */
	}

}
