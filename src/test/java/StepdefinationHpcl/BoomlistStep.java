package StepdefinationHpcl;

import com.pageobjectmodel.BoomListObject;

import io.cucumber.java.en.*;

public class BoomlistStep extends TestBase
{
	BoomListObject blo= new BoomListObject(driver);
	@When("Admin click on sparelist and Boom")
	public void admin_click_on_sparelist_and_boom() 
	{
		blo.SpareList.click();
		blo.BoomList.click();
		blo.adddata.click();
	}

	@And("Admin enter all data in list form and click on add button")
	public void admin_enter_all_data_in_list_form_and_click_on_add_button() 
	{
		blo.SubCategory.sendKeys("ASD");
		blo.EquipmentName.sendKeys("Poohja");
		blo.PartName.sendKeys("AAA");
		blo.PartNo.sendKeys("1");
		blo.Quantity.sendKeys("100");
		blo.Condition.sendKeys("ok");
		blo.PerUnitValue.sendKeys("10");
		blo.LocationInWarehouse.sendKeys("BBB");
		blo.PISMatrix.sendKeys("1213");
		blo.PPMatrix.sendKeys("10");
		blo.addbutton.click();
	}

	@Then("Boom List data added Successfully")
	public void boom_list_data_added_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
