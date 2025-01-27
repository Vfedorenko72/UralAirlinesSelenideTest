package uapages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import uapages.feedbackpages.FeedbackPage;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта uralairlines.ru
 */
public class MainPage {

    private final SelenideElement modalWindowButton = $x("//div[@class='uk-modal-dialog uan-modal__dialog uk-margin-auto-vertical']/button");
    private final SelenideElement buttonSearch = $x("//a[@class='uk-button uk-button-primary ts-v2__button ticket-search__btn margin-top--11px height--50px padding-top--7px']");
    private final SelenideElement sandwichMenuYourLuggage = $x("//li[@class='uk-active']//a[text() = 'Ваш багаж']");
    private final SelenideElement sandwichMenuFeedback = $x("//li[@class='uk-active']//a[text() = 'Обратная связь/Помощь пассажиру']");
    private final SelenideElement buttonSandwich = $x("//button[@class='sandwich']");

    public MainPage(String url) {
        Selenide.open(url);
        modalWindowButton.click();
    }

    /**
     * Открытие сендвича на главной странице
     */
    public void openSandwich() {
        buttonSandwich.click();
    }

    /**
     * Переход на страницу "Обратная связь" через сендвич
     */
    public FeedbackPage sandwichFeedback() {
        openSandwich();
        sandwichMenuFeedback.click();
        return new FeedbackPage();
    }

}
