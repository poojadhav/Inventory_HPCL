package StepdefinationHpcl;

import java.io.IOException;
import org.openqa.selenium.support.ui.Select;
import com.pageobjectmodel.AddUserObject;
import io.cucumber.java.en.*;

public class AddUserStep extends TestBase
{
	AddUserObject auo= new AddUserObject(driver);
	
	@When("Admin click on setting and adduser")
	public void admin_click_on_setting_and_adduser() 
	{
		auo.settings.click();
		auo.adduserlink.click();
	}

	@And("Admin enter on add user button")
	public void admin_enter_on_add_user_button() 
	{
	    auo.add.click();
	}

	@And("Admin enter all data and click on add user button")
	public void admin_enter_all_data_and_click_on_add_user_button() 
	{
	    auo.username.sendKeys("Sonal");
	    auo.email.sendKeys("Sonal123@gmail.com");
	    Select select=new Select(auo.selectrole);
	    select.selectByIndex(1);
	    auo.password.sendKeys("Sonal123");
	    auo.adduserbutton.click();
	}

	@Then("User Add Successfully")
	public void user_add_successfully() 
	{
	   
	}

	
}
