import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {
    //private WebDriver driver;


    @Before
    public void before() {
    }

    @After
    //Закрыть браузер
    public void closeBrowser() {
        Selenide.closeWindow();
    }
}

