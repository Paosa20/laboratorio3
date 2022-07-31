import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Adaptador {

    private WebDriver driver = null;
    private static Adaptador adaptador = null;
    public Adaptador() {

        System.setProperty("webdriver.chrome.driver", "/Users/paolasanchez/Desktop/Pry4/Laboratorio3/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    public void abrirURL(String url) {
        driver.get(url);
    }
    public void cerrarDriver() {
        driver.quit();
    }
    public WebElement findElementById(String id) {
        return driver.findElement(By.id(id));
    }
    public WebElement findElementXpath(String element) {
        return driver.findElement(By.xpath(element));
    }
    public  WebElement findCssSelector(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }
    public  WebElement findTagName(String tag) {
        return driver.findElement(By.tagName(tag));
    }
}
