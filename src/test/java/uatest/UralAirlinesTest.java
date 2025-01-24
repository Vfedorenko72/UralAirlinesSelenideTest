package uatest;

import org.junit.jupiter.api.Test;
import uapages.MainPage;

public class UralAirlinesTest extends BaseTest {

    private final static String BASE_URL = "https://www.uralairlines.ru/";

    @Test
    public void checkHref() {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.firstEntry();
        mainPage.sandwichFeedback();

    }
}
