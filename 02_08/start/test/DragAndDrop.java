import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement Image = driver.findElement(By.id("image"));
        WebElement Box = driver.findElement(By.id("box"));

        Actions action = new Actions(driver);
        action.dragAndDrop(Image, Box).build().perform();
        Thread.sleep(2000);


        driver.quit();
    }
}

