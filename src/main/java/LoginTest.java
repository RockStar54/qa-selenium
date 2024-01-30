import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "P:\\Студенты\\Тестирование QA31\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/login");


        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("tomsmith");


        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("SuperSecretPassword!");


        WebElement loginButton = driver.findElement(By.cssSelector(".fa-sign-in"));
        loginButton.click();

        WebElement logoutButton = driver.findElement(By.cssSelector(".button.secondary.radius"));
        logoutButton.click();


       String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://the-internet.herokuapp.com/login")) {
           System.out.println("Успешно");
       } else {
            System.out.println("Провал");
       }

        assert  driver.findElement(By.cssSelector(".fa-sign-in")).isDisplayed();



        driver.quit();
    }
}

