package uatest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uapages.ApplicationForSubsidizedTransportationPage;
import uapages.FeedbackPage;
import uapages.MainPage;

public class UralAirlinesTest extends BaseTest {

    private final static String BASE_URL = "https://www.uralairlines.ru/";
    private final static String VERIFICATION_OF_THE_SUBSIDY_APPLICATION = "Заявка на субсидированную перевозку";

    /*@Test
    public void checkHref() {
        mainPage.sandwichFeedback();
        FeedbackPage feedbackPage = new FeedbackPage();
        feedbackPage.switchToApplicationForSubsidizedTransportation();
        ApplicationForSubsidizedTransportationPage applicationForSubsidizedTransportationPage = new ApplicationForSubsidizedTransportationPage();
        String title = applicationForSubsidizedTransportationPage.getTitle();
        Assertions.assertTrue(title.contains("Заявка на субсидированную перевозку"));

    }*/

    @Test
    public void checkHref() {
        Assertions.assertTrue(new MainPage(BASE_URL)
                .sandwichFeedback()
                .switchToApplicationForSubsidizedTransportation()
                .getTitle()
                .contains(VERIFICATION_OF_THE_SUBSIDY_APPLICATION));

    }
}
