package uapages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница ца "Обратная связь"
 */
public class FeedbackPage {

    private final SelenideElement applicationForSubsidizedTransportation = $x("//div[contains(text(), 'Подать заявку на субсидированную перевозку')]");

    /**
     *Переход на страницу "Заявка на субсидированную перевозку"
     */
    public ApplicationForSubsidizedTransportationPage switchToApplicationForSubsidizedTransportation() {
        applicationForSubsidizedTransportation.click();
        return new ApplicationForSubsidizedTransportationPage();
    }


}
