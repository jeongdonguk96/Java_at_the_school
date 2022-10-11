package sec05_properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProperiesEx1 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.setProperty("TimeOut", "30");
		prop.setProperty("Languege", "한글");
		prop.setProperty("Size", "10");
		prop.setProperty("Capacity", "10");
		
		try {
			prop.store(new FileOutputStream("Output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("Output.xml"), "Properties Example");
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
