import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollTask {
    @Test
    public void scrollTask(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        List<WebElement> courses = driver.findElements(By.cssSelector(".table-display td:nth-child(2)"));
        List<WebElement> column = driver.findElements(By.cssSelector(".table-display th"));
        WebElement row= driver.findElement(By.cssSelector(".table-display tr:nth-child(3)"));
        for (WebElement course:courses){
            System.out.println(course.getText());
        }
        System.out.println(column.size());
        System.out.println(row.getText());



    }
}
