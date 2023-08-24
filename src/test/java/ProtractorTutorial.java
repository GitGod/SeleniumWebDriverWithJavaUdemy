import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProtractorTutorial {
    @Test
    public void protractorTutorial() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Kamil");
        driver.findElement(By.name("email")).sendKeys("Kamil@o2.pl");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("kamil123");
        Select gender = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        driver.findElement(By.id("exampleCheck1")).click();
        Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
        gender.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();
        Assert.assertTrue(driver.findElement(By.id("inlineRadio1")).isSelected());
        driver.findElement(By.xpath("//input[@class='form-control'][@type='date']")).sendKeys("05.01.1995");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().contains("The Form has been submitted successfully!."));
}
}
