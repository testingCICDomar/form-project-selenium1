import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        FormePage formepage = new FormePage();
        formepage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitforAlertBanner(driver);



        assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

        driver.quit();
    }


    public  static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();


    }



}
