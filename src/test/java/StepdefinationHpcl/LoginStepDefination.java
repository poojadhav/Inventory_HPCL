package StepdefinationHpcl;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.pageobjectmodel.AddProductObject;
import com.pageobjectmodel.AddSubrackObject;
import com.pageobjectmodel.AddSupplierObject;
import com.pageobjectmodel.AddUserObject;
import com.pageobjectmodel.AddWarehouseObject;
import com.pageobjectmodel.LoginObject;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStepDefination extends TestBase
{
	static
	{
		try 
		{
			initilization();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public LoginObject lo;
	public AddWarehouseObject awo;
	public AddSubrackObject asro;
	public AddProductObject apo;
	public AddSupplierObject aso;
	//public AddUserObject auo;

    Alert alert;


	@Given("Open browser and hit url {string}")
	public void open_browser_and_hit_url(String url) 
	{
		lo= new LoginObject(driver);
		awo=new AddWarehouseObject(driver);
		asro=new AddSubrackObject(driver);
		apo=new AddProductObject(driver);
		aso=new AddSupplierObject(driver);
		//auo=new AddUserObject(driver);

		driver.get(url);
	}

	@When("Admin enter username {string} and password {string}")
	public void admin_enter_username_and_password(String username, String password) 
	{
		lo.username.sendKeys(username);
		lo.password.sendKeys(password);
	}

	@When("Click on login button")
	public void click_on_login_button() 
	{
		lo.login.click();
	}

	@Then("Admin must login and dashobord should display")
	public void admin_must_login_and_dashobord_should_display() 
	{
		String rolename=lo.admin.getText();
		String actrolename="admin";
		Assert.assertEquals(rolename, actrolename);
		System.out.println("User Login successfully");
		//driver.close();
	}

	@Then("Admin must get error message")
	public void admin_must_get_error_message()
	{
		//		String errormsg=lo.errormsg.getText();
		//		String acterrormsg="Invalid Username Password Combination";
		//		Assert.assertEquals(errormsg, acterrormsg);
		//		System.out.println("User Not Login successfully");
		//driver.close();
	}

	@Then("Admin must get blank error message")
	public void admin_must_get_blank_error_message()
	{
		String msg= lo.username.getAttribute("validationMessage");
		String acterrormsg="Please fill out this field.";
		Assert.assertEquals(msg, acterrormsg);
		System.out.println("Please fill out this field.");
		driver.close();
	}


	//           Add Warehouse             //


	@And("Admin enter warehouse number {string} and click on Add button")
	public void admin_enter_warehouse_number_and_click_on_add_button(String noofwarehouse) 
	{
		awo.inventory.click();
		awo.addwarehouse.click();
		awo.noofwarehouse.sendKeys(noofwarehouse);
		awo.addwarebutton.click();
	}

	@And("Admin enter warehousname {string} and rack number {string} and click on next button")
	public void admin_enter_warehousname_and_rack_number_and_click_on_next_button(String warehousename, String rackno) 
	{
		awo.warehousename.sendKeys(warehousename);
		awo.no_ofrack.sendKeys(rackno);
		awo.nextbutton.click();
	}

	@And("Admin enter rack name1 {string} and rack name2 {string} and click on finish button")
	public void admin_enter_rack_name1_and_rack_name2_and_click_on_finish_button(String rackname1, String rackname2) 
	{
		awo.rackname1.sendKeys(rackname1);
		awo.rackname2.sendKeys(rackname2);
		awo.finishbutton.click();
	}

	@And("Warehouse Added Successfully")
	public void warehouse_added_successfully() 
	{
		System.out.println("Warehouse Added Successfully.........");
		driver.close();
	}


	//blank warehouse number


	@And("Admin does not enter warehouse number and click on Add button")
	public void Admin_does_not_enter_warehouse_number_and_click_on_Add_button() 
	{
		awo.inventory.click();
		awo.addwarehouse.click();
		awo.addwarebutton.click();
		
		alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		//String acttext="Enter Number of Warehouse";
		alert.accept();
	}

	@And("Warehouse Not Added")
	public void Then_Warehouse_Not_Added()
	{
		System.out.println("Warehouse Not Added..........");
		driver.close();
	}


	//       Blank rack number


	@And ("Admin enter warehousname {string} and does not enter rack number and click on next button")
	public void Admin_enter_warehouse_and_does_not_enter_rack_number_and_click_on_next_button(String warehousename)
	{
		awo.warehousename.sendKeys(warehousename);
		awo.nextbutton.click();
		alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
	}






	///                add subrack         //////



	@Then("Admin enter click on sub rack option")
	public void admin_enter_click_on_sub_rack_option() 
	{
		asro.addsubrackside.click();
		asro.addsubrackside2.click();
	}

	@Then("Admin select warehouse name and and rack name")
	public void admin_select_warehouse_name_and_and_rack_name() 
	{
		Select select = new Select(asro.selectwaregouse);
		select.selectByVisibleText("Pooja");
		Select select2 = new Select(asro.selectrack);
		select2.selectByVisibleText("m1");
	}

	@Then("Admin enter {string} in sub rack")
	public void admin_enter_number_of_sub_rack(String subrackno) 
	{
		asro.subrackno.sendKeys(subrackno);
	}

	@Then("Admin enter subrack name1 {string} and rack name2 {string} and click on Add Subrack button")
	public void admin_enter_subrack_name1_and_rack_name2_and_click_on_add_subrack_button(String name1, String name2) 
	{
		asro.Subrack1.sendKeys(name1);
		asro.subrack2.sendKeys(name2);
	}

	@Then("subrack added sucessfully")
	public void subrack_added_sucessfully() 
	{
		asro.addsubrackbutton.click();
	}




	////////                     Add Product                   ////////////




	@And("Admin enter click on addproduct option")
	public void admin_enter_click_on_addproduct_option() 
	{
		apo.product.click();
		apo.addproduct.click();
	}

	@Given("Admin enter product id {string} name {string}")
	public void admin_enter_product_id_name(String id, String name) 
	{
		apo.productid.sendKeys(id);
		apo.productname.sendKeys(name);
	}

	@Given("Admin select wearehouse rack subrack")
	public void admin_select_wearehouse_rack_subrack() 
	{
		Select select = new Select(apo.Selectwarehouse);
		select.selectByVisibleText("Pooja");

		Select select1 = new Select(apo.selectrack);
		select1.selectByVisibleText("m1");

		Select select2 = new Select(apo.selectsubrack);
		select2.selectByVisibleText("m1_001");
	}

	@Given("Admin enter price {string} and opening stock {string}")
	public void admin_enter_price_and_opening_stock(String price, String opeing) 
	{
		apo.price.sendKeys(price);
		apo.opeingstock.sendKeys(opeing);
	}

	@Given("Admin select VDE and Machine name")
	public void admin_select_vde_and_machine_name() 
	{
		Select select = new Select(apo.selectVDE);
		select.selectByVisibleText("D");

		Select select1 = new Select(apo.selectmachinename);
		select1.selectByVisibleText("Other");
	}

	@Given("Admin select supllier name and quality")
	public void admin_select_supllier_name_and_quality() 
	{
		//	apo.supplier.click();
		//		Select select1 = new Select(apo.supplier);
		//		select1.selectByVisibleText("Neha Enterprises");


		apo.supplier.click();
		driver.findElement(By.xpath("//*[@id=\"choices--supplier_name-item-choice-1\"]")).click();


		apo.selectquality.click();
		apo.qualityoption.click();
	}

	@Given("Admin click on add product button")
	public void admin_click_on_add_product_button() 
	{
		apo.addproductbutton.click();
	}

	@Given("Produt added sucessfully")
	public void produt_added_sucessfully() 
	{
		System.out.println("Product addedd....");
	}








	///////////         Add Supplier          //////////////

	@And("Admin Enter on suppilers adn add supplier")
	public void  clickon_suppilers_supplier()
	{
		aso.suppliers.click();
		aso.addsupplier.click();
	}

	@When("Admin enter the Supplier ID as {string}")
	public void enterSupplierID(String supplierId) 
	{
		aso.supplierid.sendKeys(supplierId);
	}

	@And("Admin enter the Supplier Name as {string}")
	public void enterSupplierName(String supplierName) 
	{
		aso.suppliername.sendKeys(supplierName);
	}

	@And("Admin enter the ERP code as {string}")
	public void enterERPCode(String erpCode) 
	{
		aso.ERPCode.sendKeys(erpCode);
	}

	@And("Admin enter the Supplier Address as {string}")
	public void enterSupplierAddress(String supplierAddress) 
	{
		aso.SupplierAddress.sendKeys(supplierAddress);
	}

	@And("Admin enter the Email Address as {string}")
	public void enterEmailAddress(String emailAddress) 
	{
		aso.Emailaddress.sendKeys(emailAddress);
	}

	@And("Admin enter the Contact No as {string}")
	public void enterContactNo(String contactNo)
	{
		aso.ContactNo.sendKeys(contactNo);
	}

	@And("Admin select the Supplier Type")
	public void selectSupplierType() 
	{
		Select select=new Select(aso.suppliertype);
		select.selectByIndex(2);
	}

	@And("Admin enter the GST No as {string}")
	public void enterGSTNo(String gstNo) 
	{
		aso.GstNo.sendKeys(gstNo);
	}

	@And("Admin upload a file")
	public void uploadFile() 
	{
		String filePath = "C:\\Users\\dell\\Desktop\\Collage project report\\M-Ticket_report.docx";
		aso.FileUpload.sendKeys(filePath);
	}

	@And("Admin submit the form")
	public void submitForm() 
	{
		aso.addbutton.click();
		alert = driver.switchTo().alert();
		alert.accept();
	}


	@Then("Supplier details should be saved successfully")
	public void verifySupplierDetailsSaved() 
	{
		System.out.println("Supplier Added Successfully");
	}

}
