import org.example.ConfProperties;
import org.junit.Test;
import po.Anime_bitMainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Anime_bitTestClass {

    public static String URL = ConfProperties.getProperty("loginpage");

    @Test
    public void test() {

        // Anime_bitMainPage animeBitMainPage = open(Anime_bitMainPage.URLAnime_bit, Anime_bitMainPage.class);
        Anime_bitMainPage animeBitMainPage = open(URL, Anime_bitMainPage.class);
        animeBitMainPage.inputLogin("Yomato");
        animeBitMainPage.inputPass("Qwerty12345!");
        animeBitMainPage.clicAutor();
        animeBitMainPage.searchSet("Мобильный воин Гандам");
        animeBitMainPage.setSearchClic();
        //Осуществился ли поиск
        assertTrue("Поиск не осуществился", animeBitMainPage.isResult());
        assertEquals("Результат не соответствует ожиданию", 1, Anime_bitMainPage.getResultTitles().size());
        sleep(9000000);
    }
}
