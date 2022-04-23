package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public String getPropertiesData(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis= new FileInputStream(AutoConstant.propertiesFilePath);
		p.load(fis);
		String property=p.getProperty(key);
		return property;
	}
}
