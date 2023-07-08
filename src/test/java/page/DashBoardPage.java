package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashBoardPage {
    private static final String RATING_SELECT = "//td//select";
    private static final String UPDATE_BUTTON = "//button[contains(@class, 'is-outdlined')]";
    private static final String SUCCESS_MESSAGE = "//*[contains(text(),'Post updated')]";
    private static final String DELETE_BUTTON = "//div[@class='buttons']/button[contains(@class, 'is-outlined')]";
    private static final String POST_DELETED_MESSAGE = "//*[contains(text(), 'Post deleted')]";

    public  DashBoardPage setUpRating (int ratingPosition, String rating) {
    $$(By.xpath(RATING_SELECT)).get(ratingPosition).selectOptionByValue(rating);
    return this;
}
    public  DashBoardPage clickUpdateButton (int ratingPosition) {
        $$(By.xpath(UPDATE_BUTTON)).get(ratingPosition).click();
        return this;
    }

    public boolean isSuccessMessageDisplayed() {
    return $(By.xpath(SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }

    public DashBoardPage clickDeleteButton (int ratingPosition) {
        $$(By.xpath(DELETE_BUTTON)).get(ratingPosition).click();
        return this;
    }

    public boolean isPostDeletedMessageDisplayed() {
        return $(By.xpath(POST_DELETED_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }
}
