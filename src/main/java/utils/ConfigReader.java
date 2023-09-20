package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public  Properties initializaeProperties() {
		
		Properties prop=new Properties();
		File proFile=new File(System.getProperty("user.dir")+"/src/test/resource/config/config.properties");
		
		
		System.out.println(System.getProperty("user.dir"));
		
		try {
			FileInputStream fis=new FileInputStream(proFile);
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return prop;
		
	}
	

}

///Users/vikramadityaanand/Desktop/Automation/Java-testing/PagefactoryCucumber/src/test/resource/config/config.properties