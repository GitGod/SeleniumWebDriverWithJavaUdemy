import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScopeTask {
    @Test
    public void scopeTask() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        String value = driver.findElement(By.xpath("//label[@for='benz']")).getText().trim();
        //System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
        Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByVisibleText(value);
        driver.findElement(By.id("name")).sendKeys(value);
        driver.findElement(By.id("alertbtn")).click();
        String textInAlert = driver.switchTo().alert().getText();
        Assert.assertTrue(textInAlert.contains(value));
    }

}
