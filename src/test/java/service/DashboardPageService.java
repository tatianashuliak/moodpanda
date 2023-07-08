package service;

import page.DashBoardPage;

public class DashboardPageService {
    DashBoardPage dashBoardPage = new DashBoardPage();

    public boolean isPostRatingUpdated(int ratingPosition, String rating) {
        return dashBoardPage.setUpRating(ratingPosition, rating)
                .clickUpdateButton(ratingPosition)
                .isSuccessMessageDisplayed();
    }

    public boolean isPostDeleted(int ratingPosition) {
        return dashBoardPage.clickDeleteButton(ratingPosition)
                .isPostDeletedMessageDisplayed();
    }
}
