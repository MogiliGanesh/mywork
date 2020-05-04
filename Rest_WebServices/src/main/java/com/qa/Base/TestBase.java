package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream ip= new FileInputStream( System.getProperty("user.dir")+"/src/main/java/com/qa/Config/config.properties");
		prop.load(ip);
	}
}
