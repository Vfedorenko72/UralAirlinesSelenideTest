package uatest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uapages.MainPage;

public class UralAirlinesTest extends BaseTest {

    private final static String BASE_URL = "https://www.uralairlines.ru/";
    private final static String HEADING_SUBSIDIZED_TRANSPORTATION = "Заявка на субсидированную перевозку";
    private final static String TITLE_FLIGHT_INFORMATION = "Получить справку о перелёте";
    private final static String TITLE_ADDITIONAL_SERVICES = "Дополнительные услуги";
    private final static String TITLE_TICKET_ERROR = "Допущена ошибка в билете";
    private final static String TITLE_ISSUE_A_CERTIFICATE = "Оформить сертификат";
    private final static String TITLE_ITINERARY_RECEIPT = "Отсутствует маршрут-квитанция";


    /**
     * Проверка входа на страницу 'Подать заявку на субсидированную перевозку'
     */
    @Test
    public void checkApplicationForSubsidizedTransportationPage() {
        Assertions.assertTrue(
                new MainPage(BASE_URL)
                .sandwichFeedback()
                .switchToApplicationForSubsidizedTransportation()
                .getTitle()
                .contains(HEADING_SUBSIDIZED_TRANSPORTATION)
        );

    }

    /**
     * Проверка входа на страницу 'Подать заявку на субсидированную перевозку'
     */
    @Test
    public void checkGetFlightCertificate() {
        Assertions.assertTrue(
                new MainPage(BASE_URL)
                .sandwichFeedback()
                .getFlightCertificate()
                .getTitle()
                .contains(TITLE_FLIGHT_INFORMATION)

        );
    }

    /**
     * Проверка входа на страницу 'Уточнить информацию по дополнительным услугам'
     */
    @Test
    public void checkAdditionalServices() {
        Assertions.assertTrue(new MainPage(BASE_URL)
                .sandwichFeedback()
                .additionalServices()
                .getTitle()
                .contains(TITLE_ADDITIONAL_SERVICES)
        );
    }

    /**
     * Проверка входа на страницу 'Исправить ошибку в билете'
     */
    @Test
    public void checkTicketError() {
        Assertions.assertTrue(new MainPage(BASE_URL)
                .sandwichFeedback()
                .ticketError()
                .getTitle()
                .contains(TITLE_TICKET_ERROR)
        );
    }

    /**
     * Проверка входа на страницу 'Оформить сертификат'
     */
    @Test
    public void checkIssueCertificate() {
        Assertions.assertTrue(new MainPage(BASE_URL)
                .sandwichFeedback()
                .issueCertificate()
                .getTitle()
                .contains(TITLE_ISSUE_A_CERTIFICATE)
        );
    }

    /**
     * Проверка входа на страницу 'Запросить маршрутную квитанцию'
     */
    @Test
    public void checkItineraryReceipt() {
        Assertions.assertTrue(new MainPage(BASE_URL)
                .sandwichFeedback()
                .itineraryReceipt()
                .getTitle()
                .contains(TITLE_ITINERARY_RECEIPT)
        );
    }

    @Test
    public void crashTest() {
        Assertions.assertTrue(false);
    }
}
