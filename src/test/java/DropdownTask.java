import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class DropdownTask {
    @Test
    public void dropdownTask() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#/");
        WebElement dropdown = driver.findElement(By.id("autocomplete"));
        dropdown.sendKeys("pol");
        //Thread.sleep(3000);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cssSelector(".ui-menu-item")));
        List<WebElement> countries = driver.findElements(cssSelector(".ui-menu-item"));
        for (int i=0;i<countries.size();i++){
            System.out.println(countries.get(i).getText());
            if(countries.get(i).getText().contains("Poland")){
                countries.get(i).click();
                break;
            }
        }
        Assert.assertEquals(dropdown.getAttribute("value"),"Poland");




    }
}
