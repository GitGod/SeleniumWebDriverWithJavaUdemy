import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    public void screenshots() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        // FirefoxOptions options1 = new FirefoxOptions();
        //   options1.setAcceptInsecureCerts(true);
        // EdgeOptions options2 = new EdgeOptions();
        // options2.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuumi\\Downloads\\Nowy folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://google.com/");
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Yuumi\\Documents"));
    }
}
