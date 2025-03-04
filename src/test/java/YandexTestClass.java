import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static po.YandexMainPage.*;

public class YandexTestClass {
    @Test
    public void test() {

        open(URLYandex);

        $(byXpath(loginButton)).shouldBe(visible, Duration.ofSeconds(10)).click();
        $(byXpath(autLogin)).shouldBe(visible, Duration.ofSeconds(10)).click();
        $(byXpath(lineLogin)).shouldBe(visible, Duration.ofSeconds(10)).setValue(Login);
        $(byXpath(clicLogin)).click();
        $(byXpath(linePass)).shouldBe(visible, Duration.ofSeconds(10)).setValue(Pass);
        $(byXpath(passClic)).click();
        open(URLBy);


        $(byXpath("//input[@id='header-search']")).shouldBe(visible, Duration.ofSeconds(10)).setValue("чайник заварочный стеклянный").pressEnter();
        sleep(300000000);

        // $(byXpath("//div[@data-hydration-id='15965891c7331ada3fed1106a11e6047.0']")).shouldBe(visible, Duration.ofSeconds(60)); //ждать, пока веб-элемент не станет видимым, в течение 8сек
        // List<String> collection= $$(byXpath("//div[@id='search']//h3")).stream().map(SelenideElement::getText).collect(Collectors.toList());
        // System.out.println(collection);
        // System.out.println(collection.size()); }
    }
}
