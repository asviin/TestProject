package commonUtils;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;



public class FileUtility {
	
	public String getPropertyData(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(IpathConst.propertyFileLoc);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		fis.close();
		return value;
		
	}

}
