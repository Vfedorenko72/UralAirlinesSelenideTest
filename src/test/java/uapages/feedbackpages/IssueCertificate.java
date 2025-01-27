package uapages.feedbackpages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class IssueCertificate {
    private final SelenideElement title = $x("//h1");

    public String getTitle() {
        return title.getText();
    }
}

