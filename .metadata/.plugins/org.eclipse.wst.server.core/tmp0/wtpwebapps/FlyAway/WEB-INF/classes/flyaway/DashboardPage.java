package flyaway;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	@FindBy(xpath="//a[@href='home']")
	public static WebElement Home;
}
