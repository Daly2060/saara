package target.com;

import net.bytebuddy.asm.Advice.This;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{ 
	WebDriver dr;
	
	@FindBy(xpath="")WebElement MenPageCatagory;
	@FindBy(xpath= "")WebElement KidsPageCatagory;
     public HomePage(WebDriver dr)
     {
    	   this.dr=dr;
    	   PageFactory.initElements(dr, this);
    	 
     }
     public void verifyTitle()
     {
    	   dr.getTitle().contains(""); 
     } 
     public Menpage clickMenPage()
     {
    	  MenPageCatagory.click();
    	  return new Menpage();
     }
     
     public KidsPage clickKidsPage()
     {
    	 KidsPageCatagory.click();
    	 return new KidsPage();
     }
     
     
     


}