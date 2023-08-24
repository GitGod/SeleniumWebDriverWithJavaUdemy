import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
    @Test
    public void alert() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractise/");
        driver.findElement(By.id("name")).sendKeys("Kamil");
        driver.findElement(By.cssSelector("[id='name]")).click();
        driver.switchTo().alert().dismiss();
    }
}
