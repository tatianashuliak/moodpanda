package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.LoginPageService;

public class MoodPandaTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
     loginPageService = new LoginPageService();
    }

    @Test
     public void moodTest() {
        User user = new User("xdpaqvo@mailto.plus", "23041997");
        final int RATING_POSITION = 1;
        final String RATING = "1";
        boolean isPostUpdated = loginPageService
                .login(user)
                .clickEditPostsLink()
                .isPostRatingUpdated(RATING_POSITION, RATING);
        Assert.assertTrue(isPostUpdated);
     }

     @Test
    public void postUpdateTest() {
         User user = new User("xdpaqvo@mailto.plus", "23041997");
         boolean isPostUpdated = loginPageService
                 .login(user)
                 .clickUpdatePostLink()
                 .updatePost()
                 .isPostSuccessfulUpdated();
         Assert.assertTrue(isPostUpdated);
     }

     @Test
    public void postDeleteTest() {
         User user = new User("xdpaqvo@mailto.plus", "23041997");
         boolean isPostDeleted = loginPageService
                 .login(user)
                 .clickEditPostsLink()
                 .isPostDeleted(1);
         Assert.assertTrue(isPostDeleted);
     }
}
