package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PostPage {
    private static final String RATING_BUTTON = "//div[@class='buttons hdas-addons is-hidden-touch']/button[text()=' 5 ']";
    private static final String REASON_BUTTON = "//button[text()=' no reason ']";
    private static final String UPDATE_LINK = "//a[text()=' Update to 5']";

    public PostPage clickRatingButton() {
        $(By.xpath(RATING_BUTTON)).click();
        return this;
    }

    public PostPage clickReasonButton() {
        $(By.xpath(REASON_BUTTON)).click();
        return this;
    }

    public void clickUpdateLink() {
        $(By.xpath(UPDATE_LINK)).click();
    }
}
