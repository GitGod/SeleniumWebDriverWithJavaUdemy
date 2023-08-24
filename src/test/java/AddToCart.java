import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddToCart {
    @Test
    public void addToCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        List<String> x =new ArrayList<>();
        String[] itemsNeeded = {"Cucumber","Brocolli"};
        List itemsNeededList = Arrays.asList(itemsNeeded);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
       // List<WebElement> products = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
        //for(int i=0;i<products.size();i++){

          //  products.add(name);
       // }


        int j =0;
        for(int i=0;i<products.size();i++){
            String name = products.get(i).getText().split("-")[0].trim();
           // String name = products.get(i).getText();
            if (itemsNeededList.contains(name)){
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                //WebDriverWait dd = new WebDriverWait(driver,Duration.ofSeconds(10));
                //dd.until(driver.findElements(By.cssSelector("h4.product-name")).size()==30);
                j++;
                if(j==itemsNeededList.size()){
                    break;
                }
            }
        }
    }
}
