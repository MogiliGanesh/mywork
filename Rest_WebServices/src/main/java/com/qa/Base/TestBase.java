package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	public static int Expected_Status_Code_200=200;
	public static int Expected_Status_Code_201=201;
	public static int Expected_Status_Code_400=400;
	public static int Expected_Status_Code_401=401;
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream ip= new FileInputStream( System.getProperty("user.dir")+"/src/main/java/com/qa/Config/config.properties");
		prop.load(ip);
	}
}
