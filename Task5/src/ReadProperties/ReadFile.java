package ReadProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFile {

	public static void main(String[] args) {

 Properties prop = new Properties();
try (InputStream input = new FileInputStream("config.properties")) {
		 
		           
		      prop.load(input);
		 
 System.out.println("Database - " + prop.getProperty("database"));
 System.out.println("Username - " + prop.getProperty("Username"));
System.out.println("Password - " + prop.getProperty("password"));
		 
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }

}
}
