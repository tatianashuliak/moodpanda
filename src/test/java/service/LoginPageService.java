package service;

import model.User;
import page.FeedGlobalPage;
import page.LoginPage;

public class LoginPageService {

    LoginPage loginPage = new LoginPage();

    public FeedGlobalPageService login(User user) {
        loginPage.openLoginPage()
                .enterEmail(user.getUserEmail())
                .enterPassword(user.getUserPassword())
                .clickLoginButton();
        return new FeedGlobalPageService();
    }

}
