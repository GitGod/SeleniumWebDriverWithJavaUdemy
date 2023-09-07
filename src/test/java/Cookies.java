import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cookies {
    public void cert() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        // FirefoxOptions options1 = new FirefoxOptions();
        //   options1.setAcceptInsecureCerts(true);
        // EdgeOptions options2 = new EdgeOptions();
        // options2.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("xx");
        driver.get("http://google.com/");
    }

}
