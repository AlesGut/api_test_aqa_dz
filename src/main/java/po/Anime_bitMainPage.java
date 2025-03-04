package po;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;

public class Anime_bitMainPage {

    //public static final String URLAnime_bit = "https://anime-bit.online/";//Сайт\

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'box_form_login')]")
    private SelenideElement loginField; //строка логин("//input[id='name']")
    @FindBy(how = How.XPATH, using = "//input[contains(@id,'box_form_password')]")
    private SelenideElement passField; //строка пароль
    @FindBy(how = How.XPATH, using = "//input[contains(@class,'box_form_submit')]")
    private SelenideElement authorization; //кнопка
    @FindBy(how = How.XPATH, using = "//input[contains(@class,'box_form_text')]")
    private SelenideElement LineSearch; //кнопка
    @FindBy(how = How.XPATH, using = "//input[contains(@class,'search_box_form_button')]")
    private SelenideElement searchClic; //кнопка
    @FindBy(how = How.XPATH, using = "//div[@id='content_box']")
    private static ElementsCollection results; //Результаты поиска


    //Метод проверки поиска
    public boolean isResult() {
        return results.first().shouldBe(visible, Duration.ofSeconds(9)).isDisplayed();
        //is(Condition.visible, Duration.ofSeconds(60))
    }

    public void inputLogin(String loginName) {
        loginField.shouldBe(visible, Duration.ofSeconds(180)).setValue(loginName);
    }

    public void inputPass(String pass) {
        passField.shouldBe(visible, Duration.ofSeconds(90)).setValue(pass);
    }

    public void clicAutor() {
        authorization.shouldBe(visible, Duration.ofSeconds(7)).click();
    }

    public void searchSet(String search1) {
        LineSearch.shouldBe(visible, Duration.ofSeconds(7)).setValue(search1);
    }

    public void setSearchClic() {
        searchClic.shouldBe(visible, Duration.ofSeconds(7)).click();
    }
    // Метод для получения заголовков из коллекции
    public static List<String> getResultTitles() {
        List<String> titles = new ArrayList<>();
        for (SelenideElement title : results) {
            titles.add(title.getText());
        }
        return titles;
    }
}

// Локатор поля ввода поиска


