package po;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class YandexMainPage {
    // Адреса страниц
    public static final String URLYandex = "https:/yandex.ru/";
    public static final String URLBy = "https://market.yandex.ru/";
    public static final String loginButton = "//div[contains(@class,'loginButtonContainer-tv')]"; //локатор логин
    public static final String  autLogin = "//a[@class='dzen-layout--base-login-button__loginButton-EB dzen-layout--login-content__yaButton-35 dzen-layout--base-button__rootElement-75  dzen-layout--base-button__isFluid-1Q  dzen-layout--base-button__xl-28  dzen-layout--base-button__regular-1v']";
    public static final String lineLogin = "//input[@dir='ltr']";//строка логин
    public static final String clicLogin = "//button[@id='passp:sign-in']";
    public static final String linePass = "//input[@id='passp-field-passwd']";
    public static final String passClic = "//button[@id='passp:sign-in']";


    public static final String Login = "zubrovitch.zubr";
    public static final String Pass = "qWERTy42!";



    }



    // Локатор поля ввода поиска



