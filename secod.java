package basics;
//MERGE ZMIAN Z fisrt i second branch
//drugi sposób działajcej wersji 
//wykonane zmiany w drugim sposobie
//pierwszy sposób działajcej wersji 
//zmiany w pierwszym sposobie
//ponowne zmiany w pierwszym branchu
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitsExplict {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        WebDriver driverWithWaits = new ChromeDriver();

        String baseUrl = "http://www.facebook.com";
        driverWithWaits.get(baseUrl);
//cos nowego do PR
                String baseUrl = "http://www.facebook.com";
        driverWithWaits.get(baseUrl);
// ponownie zmaany w fisrt i second
String baseUrl = "http://www.facebook.com";
String baseUrl = "http://www.facebook.com";
        
        //Explicit wait - used to set the waiting time for a particular instance only
        WebDriverWait myWaitVar = new WebDriverWait(driverWithWaits,5);

        //Explicit wait - used to set the waiting time for a particular instance only
        WebDriverWait myWaitVar = new WebDriverWait(driverWithWaits,5);

        WebElement cookieActButton = driverWithWaits.findElement(By.cssSelector("[data-cookiebanner=\"accept_button\"]"));
        cookieActButton.click();

        WebElement cookieActButton = driverWithWaits.findElement(By.cssSelector("[data-cookiebanner=\"accept_button\"]"));
        cookieActButton.click();
        
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driverWithWaits.findElement(By.id("email")).sendKeys("tutorial");

        driverWithWaits.close();
        System.exit(0);
    }
}