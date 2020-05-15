import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    private ILabel lblAuthorizationSucceed = AqualityServices.getElementFactory()
            .getLabel(By.xpath("//pre[contains(@style, 'word')]"), "authorizationSucceed");
    private static final String AUTHORIZED = "true";


    public MainPage() {
        super(By.xpath("//pre[contains(@style, 'word')]"), "MainPage");
    }

    private String getMainPageText() {
        String mainPageText = lblAuthorizationSucceed.getText();
        return mainPageText;
    }

    @Override
    public boolean isPageLoaded() {
        return getMainPageText().contains(AUTHORIZED);
    }
}
