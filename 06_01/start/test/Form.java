import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;


import java.awt.event.KeyEvent;

public class Form {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        /*WebElement First_Name = driver.findElement(By.id("first-name"));
        First_Name.sendKeys("Omar"); */
        driver.findElement(By.id("first-name")).sendKeys("Omar");

        /*WebElement Last_Name = driver.findElement(By.id("last-name"));
        Last_Name.sendKeys("Ben Romdhane"); */
        driver.findElement(By.id("last-name")).sendKeys("Ben Romdhane");

        /*WebElement Job_Title = driver.findElement(By.id("job-title"));
        Job_Title.sendKeys("Engineer");*/
        driver.findElement(By.id("job-title")).sendKeys("Engineer");

        /*WebElement Education_Levl = driver.findElement(By.cssSelector("input[value='radio-button-3']"));
        Education_Levl.click();*/
        driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();

        /*WebElement Sex = driver.findElement(By.id("checkbox-1"));
        Sex.click();*/
        driver.findElement(By.id("checkbox-1")).click();

        /*WebElement Experience = driver.findElement(By.id("select-menu"));
        Experience.click();

        WebElement Experience_Choice = driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]"));
        Experience_Choice.click();*/

        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]")).click();

        /*WebElement Date_Birth = driver.findElement(By.id("datepicker"));
        Date_Birth.sendKeys("03/07/1994");*/
        driver.findElement(By.id("datepicker")).sendKeys("03/07/1994");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        driver.findElement(By.linkText("Submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement Alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        String Text = Alert.getText();
        assertEquals("The form was successfully submitted!", Text);


        driver.quit();
    }
}
