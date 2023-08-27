package flyaway;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[@href='login']")
	public static WebElement Loginbutton;
	
	@FindBy(xpath="//select[@name='source']")
	public static WebElement Source;
	
	@FindBy(xpath="//select[@name='destination']")
	public static WebElement Destinationbutton;
	
	@FindBy(xpath="//button['Submit']")
	public static WebElement submit;
	
	@FindBy(xpath="//a[@href=\"bookflight?id=3\"]")
	public static WebElement bookflight;
}
