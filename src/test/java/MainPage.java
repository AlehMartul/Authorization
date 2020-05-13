import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    private ILabel authorizationSucceed = AqualityServices.getElementFactory()
            .getLabel(By.xpath("//pre[contains(@style, 'word')]"), "authorizationSucceed");
    private String authorized = "true";

    private String getMainPageText() {
        String mainPageText = authorizationSucceed.getText();
        return mainPageText;
    }

    public boolean isMainPageLoaded() {
        return getMainPageText().contains(authorized);
    }
}
