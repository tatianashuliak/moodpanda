package service;

import page.PostPage;

public class PostPageService {


    public PostSuccessPageService updatePost() {
        PostPage postPage = new PostPage();
        postPage.clickRatingButton()
                .clickReasonButton()
                .clickUpdateLink();
        return new PostSuccessPageService();
    }
}
