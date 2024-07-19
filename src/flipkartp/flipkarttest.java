package flipkartp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    String url="https://www.flipkart.com/";
		    System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\prudhvi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get(url);
		    
		    
		    driver.findElement(By.className("Pke_EE")).sendKeys("pullarao");		    
	}

}
