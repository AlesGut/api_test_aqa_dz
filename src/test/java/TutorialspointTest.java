import org.example.TutorialsProperties;
import org.junit.Test;
import po.TutorialspointTestPage;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertNotNull;

public class TutorialspointTest {

    public static String URL = TutorialsProperties.getProperty("loginpage");
    public static String Name = TutorialsProperties.getProperty("Name");
    public static String Mail = TutorialsProperties.getProperty("MailId");
    public static String Mobile = TutorialsProperties.getProperty("MoboleId");
    public static String Subjects = TutorialsProperties.getProperty("SubjectsInfo");
    public static String Addres = TutorialsProperties.getProperty("AddresInfo");
    public static String Data = TutorialsProperties.getProperty("DataInfo");


    @Test
    public void test() {

        TutorialspointTestPage tutorialspointTestPage = open(URL, TutorialspointTestPage.class);
        //$(byXpath("//input[contains(@id,'name')]").(visible, Duration.ofSeconds(9)).isDisplayed().setValue("Name");//Имя
        tutorialspointTestPage.inputLogin(Name);// Ввод имени
        tutorialspointTestPage.inputEmail(Mail);//Ввод почты
        tutorialspointTestPage.clicGender();//Выбор пола
        tutorialspointTestPage.inputMobile(Mobile);//ввод телефона
        tutorialspointTestPage.inputSubjects(Subjects);//Ввод информации Subjects
        tutorialspointTestPage.clicsHobbies();//Выбор хобби
        tutorialspointTestPage.inputAddres(Addres);//Ввод адреса
        tutorialspointTestPage.inputData(Data);//Выбор даты
        tutorialspointTestPage.clicLogin();//Клик логин
        assertNotNull($(byXpath("//textarea[contains(@id,'picture')]")));


        sleep(900000);
        //$(byXpath("//input[id='mobile']")).setValue("999999999").shouldBe(visible, Duration.ofSeconds(9)).isDisplayed(); телефон
    }
}