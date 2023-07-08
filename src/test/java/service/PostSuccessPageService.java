package service;

import page.PostSuccessPage;

public class PostSuccessPageService {

    PostSuccessPage postSuccessPage = new PostSuccessPage();
    public boolean isPostSuccessfulUpdated() {
        return postSuccessPage.isElementOfPostSuccessPageDisplayed();
    }
}
