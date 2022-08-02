import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sign_in_ {
	@Test
    public void launch() throws InterruptedException
    {
    System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://mobileworld.azurewebsites.net/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
    }    
}
	
