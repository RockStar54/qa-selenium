import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "P:\\Студенты\\Тестирование QA31\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.google.com/");
//        String siteTitle = driver.getTitle();
//
//        WebElement googleInput = driver.findElement(By.cssSelector(".gLFyf"));
//
//        googleInput.sendKeys("Фильмы");
//        googleInput.sendKeys(Keys.ENTER);
//
//        WebElement firstResult = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
//        String firstResultText = firstResult.getText();
//
//        String expectedResult = "Ldf";
//        assert firstResultText.contains(expectedResult);
//
//        if (firstResultText.contains(expectedResult)) {
//
//            System.out.println("Тест прошел!");
//        } else {
//            throw new Error("Названия не равны");
//        }
//        driver.quit();
//    }
}
