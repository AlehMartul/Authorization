import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTest{

    @Test
    public void testAuthorization() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isMainPageLoaded());
    }
}
