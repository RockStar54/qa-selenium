import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urok {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "P:\\Студенты\\Тестирование QA31\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/login");





        driver.quit();
    }
}
