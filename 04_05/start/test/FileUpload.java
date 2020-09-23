import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        Thread.sleep(1000);

        WebElement Input = driver.findElement(By.id("file-upload-field"));
        Input.sendKeys("file-upload-field.png");
        Thread.sleep(1200);
        driver.quit();
    }
}
