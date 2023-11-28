import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtilities {

	public String readDataFromPropertyFile (String Key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(IpathConstants.FilePath);
		Properties p = new Properties();
		p.load(fis);
		 String Value = p.getProperty(Key);
		return Value;
		
		
	}
}
