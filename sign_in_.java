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
    river.findElement(By.xpath("//a[@href='signup.html']")).click();
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("keerthana");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("gowda");
    driver.findElement(By.xpath("//a[@href='signup.html']")).click();
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("keerthana");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("gowda");
    driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("keerthana@gmail.com");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("keeru@123");
    }    
}
	
