import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement DateField = driver.findElement(By.id("datepicker"));
        DateField.sendKeys("03/07/1994");
        Thread.sleep(1000);
        DateField.sendKeys(Keys.RETURN);




        driver.quit();
    }
}