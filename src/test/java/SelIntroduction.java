import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Firefox Launch
        //geckodricer
        //WebDriver driver = new FirefoxDriver();

        //Edge Launch
        //edgedriver
        //WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //driver.resetInputState();
    }
}
