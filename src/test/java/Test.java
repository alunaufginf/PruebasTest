import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    public static void main (String arg[]){
        System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
    }
}
