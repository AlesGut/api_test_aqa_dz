import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Test_google {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriwer.crome.driwer",
                "C:/Program Files/Java/jdk-23/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testOpenPage() {
        //открыть страницу
        driver.get("https://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);

        WebElement searchField = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        WebElement searchButton = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
        searchField.sendKeys("Selenium WebDriver");
        searchButton.click();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
