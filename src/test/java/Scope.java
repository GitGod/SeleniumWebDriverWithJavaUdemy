import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    @Test
    public void scope(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practise.php");

        //Count link
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        //Count footer section
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        //Click each link
        for (int i=1; i<columnDriver.findElements(By.tagName("a")).size();i++){
            String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Set<String> a = driver.getWindowHandles();
            Iterator<String> it = a.iterator();
            while ((it.hasNext())){
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }

        }

    }
}
