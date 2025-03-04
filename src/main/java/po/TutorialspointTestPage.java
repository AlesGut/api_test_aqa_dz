package po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class TutorialspointTestPage {

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'name')]")
    private SelenideElement loginField; //Строка логин

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'email')]")
    private SelenideElement emailField; //Строка почта

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'gender')]")
    private SelenideElement gender; //Кнопка гендер

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'mobile')]")
    private SelenideElement mobileFild; //Строка телефон

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'subjects')]")
    private SelenideElement subjectsFild; //Строка объект

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'hobbies')]")
    private SelenideElement buttonHobbies; //Строка хобби

    @FindBy(how = How.XPATH, using = "//textarea[contains(@id,'picture')]")
    private SelenideElement addresFild; //Строка андрес

    @FindBy(how = How.XPATH, using = "//input[contains(@value,'Login')]")
    private SelenideElement buttonLogin; //Кнопка логин

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'dob')]")
    private SelenideElement dataFild; //поле дата

    public void inputLogin(String loginName) {
        loginField.shouldBe(visible, Duration.ofSeconds(180)).setValue(loginName);
    }

    public void inputEmail(String emailEmail) {
        emailField.shouldBe(visible, Duration.ofSeconds(180)).setValue(emailEmail);
    }

    public void clicGender() {
        gender.shouldBe(visible, Duration.ofSeconds(7)).click();
    }

    public void inputMobile(String mobileMobile) {
        mobileFild.shouldBe(visible, Duration.ofSeconds(180)).setValue(mobileMobile);
    }

    public void inputSubjects(String subjectsSubjects) {
        subjectsFild.shouldBe(visible, Duration.ofSeconds(180)).setValue(subjectsSubjects);
    }

    public void clicsHobbies() {
        buttonHobbies.shouldBe(visible, Duration.ofSeconds(7)).click();
    }

    public void inputAddres(String addresAddres) {
        addresFild.shouldBe(visible, Duration.ofSeconds(180)).setValue(addresAddres);
    }

    public void clicLogin() {
        buttonLogin.shouldBe(visible, Duration.ofSeconds(7)).click();
    }
    public void inputData(String dataData) {
        dataFild.shouldBe(visible, Duration.ofSeconds(180)).setValue(dataData);
    }
}
