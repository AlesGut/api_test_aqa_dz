import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SelenideTestClass {

    @Test
    public void test() {
        open("https://www.google.com");
        $(byXpath("//textarea[@id='APjFqb']")).setValue("Selenium WebDriver").pressEnter();
        $(byXpath("//div[@id='searSelenideTestClass']")).shouldBe(visible, Duration.ofSeconds(120)); //ждать, пока веб-элемент не станет видимым, в течение 8с
    }
}