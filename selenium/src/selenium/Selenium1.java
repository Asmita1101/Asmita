package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Selenium1 {

	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.tagName("input"));
	System.out.println("element identified");

}
}