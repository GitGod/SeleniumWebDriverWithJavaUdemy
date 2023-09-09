import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
    @Test
    public void filterStream() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filteredList = elementList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
        Assert.assertEquals(elementList.size(),filteredList.size());
    }
}
