import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

abstract public class BaseTest {

    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }

    public void init() {
        setUp();
    }

    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
