package service;

import page.FeedGlobalPage;
import page.PostSuccessPage;

public class FeedGlobalPageService {
    FeedGlobalPage feedGlobalPage = new FeedGlobalPage();

    public DashboardPageService clickEditPostsLink() {
        feedGlobalPage.clickEditPostsLink();
        return new DashboardPageService();
    }

    public PostPageService clickUpdatePostLink() {
        feedGlobalPage.clickUpdatePostLink();
        return new PostPageService();
    }
}
