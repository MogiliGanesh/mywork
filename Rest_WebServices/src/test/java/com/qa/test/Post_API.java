package com.qa.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.Base.TestBase;
import com.qa.Data.Users;
import com.qa.client.Rest_Client;

public class Post_API extends TestBase {

	public Post_API() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String URL;
	Rest_Client restClient;
	CloseableHttpResponse httpResponse;

	@BeforeMethod
	public void setUp() throws IOException {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("url");
		apiUrl = prop.getProperty("serviceURL");

		URL = serviceUrl + apiUrl;

	}

	@Test
	public void postAPiTest() throws JsonGenerationException, JsonMappingException, IOException {
		restClient = new Rest_Client();

		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("content-type", "application/json");

		// JackSon Api

		ObjectMapper mapper=new ObjectMapper();
		Users users=new Users("morphus", "leader");  // expectes users
		
		
		// object to json file conversion
		mapper.writeValue(new File("./src/main/java/com/qa/Data/users.json"), users);
		
		
		// object to Json in string
		String usersJsonString=mapper.writeValueAsString(users);
		
		System.out.println(usersJsonString);
		
		
		
		// calling Post method from client package  and stores the response
		httpResponse=restClient.post(URL, usersJsonString, headerMap);
		
		// getting status code
		int status_code=httpResponse.getStatusLine().getStatusCode();
		System.out.println(status_code+ "   httpResponse");
		
		
		
		//json string
		String responceString=EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
		
		
		// string to json
		 JSONObject jsonObject=new JSONObject(responceString);
		 System.out.println("The response is "+ responceString);
		 
		 
		 //json to java  (Unmarshelling)
		 Users usersObj=mapper.readValue(responceString, Users.class);
		 System.out.println(usersObj);
		 
		 
		 //validation
		 
		 System.out.println(users.getName().equals(usersObj.getName()));
		
		 System.out.println(users.getJob().equals(usersObj.getJob()));
		
		
	}

}
