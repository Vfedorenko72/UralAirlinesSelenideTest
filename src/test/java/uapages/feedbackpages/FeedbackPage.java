package uapages.feedbackpages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница ца "Обратная связь"
 */
public class FeedbackPage {

    private final SelenideElement applicationForSubsidizedTransportation = $x("//div[contains(text(), 'Подать заявку на субсидированную перевозку')]");
    private final SelenideElement flightCertificate = $x("//div[contains(text(), 'Получить справку о перелете')]");
    private final SelenideElement additionalServices = $x("//div[contains(text(), 'Уточнить информацию по дополнительным услугам')]");
    private final SelenideElement ticketError = $x("//div[contains(text(), 'Исправить ошибку в билете')]");
    private final SelenideElement issueCertificate = $x("//div[contains(text(), 'Оформить сертификат')]");
    private final SelenideElement itineraryReceipt = $x("//a[@href='/feedback_detail/payment/']//div[contains(text(), 'Запросить')]");



    /**
     *Переход на страницу "Заявка на субсидированную перевозку"
     */
    public ApplicationForSubsidizedTransportationPage switchToApplicationForSubsidizedTransportation() {
        applicationForSubsidizedTransportation.click();
        return new ApplicationForSubsidizedTransportationPage();
    }

    /**
     * Переход на страницу "Получить справку о перелёте"
     */
    public GetFlightCertificate getFlightCertificate() {
        flightCertificate.click();
        return new GetFlightCertificate();
    }

    /**
     * Переход на страницу "Дополнительные услуги"
     */
    public AdditionalServices additionalServices() {
        additionalServices.click();
        return new AdditionalServices();
    }

    /**
     * Переход на страницу "Исправить ошибку в билете"
     */
    public TicketError ticketError() {
        ticketError.click();
        return new TicketError();
    }

    /**
     * Переход на страницу "Оформить сертификат"
     */
    public IssueCertificate issueCertificate() {
        issueCertificate.click();
        return new IssueCertificate();
    }

    /**
     * Переход на страницу "запросить маршрут-квитанцию"
     */
    public ItineraryReceipt itineraryReceipt() {
        itineraryReceipt.click();
        return new ItineraryReceipt();
    }


}
