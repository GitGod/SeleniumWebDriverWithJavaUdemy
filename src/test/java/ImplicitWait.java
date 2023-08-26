import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    @Test
    public void implicitWait() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//label[2]//span[2]")).click();
        w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("okayBtn"))));
        driver.findElement(By.id("okayBtn")).click();
        Select role = new Select(driver.findElement(By.xpath("//select[@class='form-control'][@data-style='btn-info']")));
        role.selectByVisibleText("Consultant");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
        List<WebElement> productsAddButtons = driver.findElements(By.xpath("//button[text()='Add ']"));
        for(WebElement productsAddButton:productsAddButtons){
            productsAddButton.click();
        }
        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();


        //System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
        //WebDriver driver=new ChromeDriver();
        //driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        //driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
        //driver.findElement(By.id("password")).sendKeys("learning");
        //driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        ////Thread.sleep(3000);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        //driver.findElement(By.id("okayBtn")).click();
        //WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
        //Select dropdown = new Select(options);
        //dropdown.selectByValue("consult");
        //driver.findElement(By.id("signInBtn")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
        //List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
        //for(int i =0;i<products.size();i++)
        //{
        //products.get(i).click();
        //}
        //driver.findElement(By.partialLinkText("Checkout")).click();}
        //}

    }
}
