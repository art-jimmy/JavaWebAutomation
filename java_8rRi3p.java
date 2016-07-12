package automationFramework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.WebDriver;  
 public class GoogleHelloWorld  
 {  
  public static WebDriver driver;  

  public static void main( String[] args )  
  {  

   System.out.println("starting selenium web driver");  
   driver = new FirefoxDriver();     
   driver.get("https://www.google.com/");  

   try{  
    Thread.sleep(2000);  
   }catch(Exception e){} 
            
   driver.close();  
   driver.quit();  
  }
    
	@Test
	public void testPass() {		
		
		   driver = new FirefoxDriver();  		   
	       driver.get("https://www.google.com/");  

		   try{  
		    Thread.sleep(2000);  
		   }catch(Exception e){} 
		   
		   String url = driver.getCurrentUrl();		   
		   String expectedUrl = "https://www.google.com/";

		   driver.close();  
		   driver.quit();  
		   		   
		   assertEquals(expectedUrl, url);				
	}
	
	
	@Test
	public void testFail() {		
		
		   driver = new FirefoxDriver();  		   
	       driver.get("https://www.bing.com/");  

		   try{  
		    Thread.sleep(2000);  
		   }catch(Exception e){} 
		   
		   String url = driver.getCurrentUrl();		   
		   String expectedUrl = "https://www.google.com/";

		   driver.close();  
		   driver.quit();  
		   		   
		   assertEquals(expectedUrl, url);				
	}  	
 }  
 