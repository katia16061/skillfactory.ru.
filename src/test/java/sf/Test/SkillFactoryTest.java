package sf.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SkillFactoryTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webDriver.chrome.driver", "/Users/Екатерина/OneDrive/Рабочий стол/драйвер/chromedriver_win32");
        driver = new ChromeDriver();
        driver.get("https://skillfactory.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
    }
    @Test
    public void testTitle() {
        driver.get("https://skillfactory.ru/");
        driver.findElement(By.className("directions__list-link")).click();
    }
    @After
    public void closeBrowser() {
        driver.close();
    }

}

