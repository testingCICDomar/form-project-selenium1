import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        Thread.sleep(1000);

        WebElement DropMenu = driver.findElement(By.id("dropdownMenuButton"));
        DropMenu.click();
        Thread.sleep(1200);
        WebElement Select = driver.findElement(By.linkText("Enabled and disabled elements"));
        Select.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
