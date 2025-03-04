import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;






import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;


public class GoogleTestCaseClass {

    @Test
    public void test() {
        open("https://www.google.com");
        $(byXpath("//textarea[@id='APjFqb']")).setValue("Слушать музыку").pressEnter();
        $(byXpath("//div[@id='rso']")).shouldBe(visible, Duration.ofSeconds(60)); //ждать, пока веб-элемент не станет видимым, в течение 8сек
        List<String> collection= $$(byXpath("//div[@id='search']//h3")).stream().map(SelenideElement::getText).collect(Collectors.toList());
        System.out.println(collection);
        System.out.println(collection.size()); }
}