package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class PostSuccessPage {
    private static final String ELEMENT_OF_POST_SUCCESS_PAGE = "//p[text()='Mood updated']";

   public boolean isElementOfPostSuccessPageDisplayed() {
       return $(By.xpath(ELEMENT_OF_POST_SUCCESS_PAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
   }
}
