import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        Thread.sleep(1000);

        WebElement RadioButton1 = driver.findElement(By.id("radio-button-1"));
        RadioButton1.click();
        Thread.sleep(1000);
        WebElement RadioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        RadioButton2.click();
        Thread.sleep(1000);
        WebElement RadioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        RadioButton3.click();
        Thread.sleep(1100);
        driver.quit();
    }
}
