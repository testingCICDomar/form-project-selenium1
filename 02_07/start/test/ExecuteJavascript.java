import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        Thread.sleep(1000);

        WebElement Modal_Button = driver.findElement(By.id("modal-button"));
        Modal_Button.click();
        Thread.sleep(1000);
        WebElement Close_Button = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript( "arguments[0].click();",Close_Button);
        Thread.sleep(1000);

        driver.quit();
    }
}
