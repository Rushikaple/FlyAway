package flyaway;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage {
	@FindBy(xpath="//a[@href='completepurchase']")
	public static WebElement bookaflight;
}
