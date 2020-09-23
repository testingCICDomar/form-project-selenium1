import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        Thread.sleep(1000);
        WebElement AlertButton = driver.findElement(By.id("alert-button"));
        AlertButton.click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
