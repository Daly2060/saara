package terget.com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import target.com.Base;
import target.com.HomePage;
import target.com.KidsPage;
import target.com.Menpage;

public class BaseTest extends Base
{
	HomePage homePage;
	Menpage menPage;
	KidsPage kidsPage;
	
	@Test
	public void buyMensShirt(WebDriver dr)
	{
		homePage= new HomePage(dr);
		homePage.verifyTitle();
		menPage = homePage.clickMenPage();
	}
	
	@Test
	public void buyKidsDress(WebDriver dr)
	{
		 homePage = new HomePage(dr);
		 homePage.verifyTitle();
			kidsPage = homePage.clickKidsPage();
		}
	
	
}
