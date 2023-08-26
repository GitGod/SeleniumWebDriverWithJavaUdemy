import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Calendar {
    @Test
    public void calendar() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_view_date1")).sendKeys("04/04");
    }
    @Test
    public void calendar2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
        driver.manage().window().maximize();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("form-field-travel_comp_date"))));
        driver.findElement(By.id("form-field-travel_comp_date")).click();
        driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }
        List<WebElement> dates = driver.findElements(By.className("day"));
        //int x = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
        System.out.println(dates.size());
        for (int i=0;i<dates.size();i++){
            String text = driver.findElements(By.className("day")).get(i).getText();
            if(text.equalsIgnoreCase("27")){
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }
    }

}
