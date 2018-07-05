package HeadlessSelenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public  class FirstHeadlessTest {


    public  static  void firstHeadlessTest() {


        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        WebDriver driver = new FirefoxDriver(options);
        System.out.println("Headless Testing Invoked ");
        driver.get("http://www.facebook.com");
        System.out.println("Page Title: " +driver.getTitle());

        driver.quit();


    }

    public static void chromeBrowser() throws InterruptedException {

        WebDriver chromedriver = new ChromeDriver();

        chromedriver.get("www.espn.com");
        try {
            chromedriver.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
