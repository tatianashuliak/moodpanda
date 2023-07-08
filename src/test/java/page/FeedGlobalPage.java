package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FeedGlobalPage {
    private static final String EDIT_POSTS_LINK = "//aside[contains(@class,'column')]//a[contains(@href,'mydata')]";
    private static final String UPDATE_POST_LINK = "//div[@class='buttons']/a[text()='Post update']";


    public void clickEditPostsLink() {
        $(By.xpath(EDIT_POSTS_LINK)).click();
    }

    public void clickUpdatePostLink() {
        $(By.xpath(UPDATE_POST_LINK)).click();
    }


}
