package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String fetchDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/file.properties");
		Properties property= new Properties();
		property.load(fis);
		
		// TODO Auto-generated method stub
		return property.getProperty(key);
	}

	public String fetchStringDataFromExcelSheet(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

	

	
	

	

	
	

	
	}

	
	


