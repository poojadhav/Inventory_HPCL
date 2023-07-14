package StepdefinationHpcl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddsupplierStep 
{
    WebDriver driver;
	Alert alert;
	
	@Given("Open browser and hit the url {string}")
	public void open_browser_and_hit_url(String url) 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("Admin enters username {string} and password {string}")
	public void admin_enter_username_and_password(String username, String password) 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username...']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='*******']")).sendKeys(password);
	}

	@When("Admin click on login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
	 @Then("Admin enter all data and click on add button")
	 public void enterdata() throws InterruptedException
	 {
		 String filePath = "C:\\Office data\\Manasvi\\HPCL Inventory\\Automation.xlsx";
			try (Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath))) 
			{
				Sheet sheet = workbook.getSheetAt(1); 
				for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) 
				{
					driver.findElement(By.xpath("//a[text()=\" Suppliers\"]")).click();
					driver.findElement(By.xpath("//a[normalize-space()='Add Supplier']")).click();
					Row row = sheet.getRow(rowIndex);
					if (row != null) {
						String supplierid = getCellValueAsString(row.getCell(0));
						String suppliername =getCellValueAsString(row.getCell(1));
						String erpcode = getCellValueAsString(row.getCell(2));
						String supplieraddress = getCellValueAsString(row.getCell(3));
						String emailaddress = getCellValueAsString(row.getCell(4));
						String contactno=getCellValueAsString(row.getCell(5));
						String selecttype=getCellValueAsString(row.getCell(6));
						String gstno=getCellValueAsString(row.getCell(7));
						String fileupload=getCellValueAsString(row.getCell(8));

						driver.findElement(By.xpath("//input[@id='vinputid']")).sendKeys(supplierid);
						driver.findElement(By.xpath("//input[@id='vinputname']")).sendKeys(suppliername);
						driver.findElement(By.xpath("//input[@id='erpcode']")).sendKeys(erpcode);
						driver.findElement(By.xpath("//textarea[@id='vinputaddr']")).sendKeys(supplieraddress);
						driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailaddress);
						driver.findElement(By.xpath("//input[@id='cno']")).sendKeys(contactno);
						
						WebElement serviceDropdown = driver.findElement(By.xpath("//select[@id='VT1']"));
						Select serviceSelect = new Select(serviceDropdown);
						serviceSelect.selectByVisibleText(selecttype);
						
						driver.findElement(By.xpath("//input[@id='gstid']")).sendKeys(gstno);
						driver.findElement(By.xpath("//input[@name='file']")).sendKeys(fileupload);
						
						driver.findElement(By.xpath("//button[@name='submit']")).click();
						
						alert = driver.switchTo().alert();
						alert.accept();


					}
				}
			} catch (IOException e)
			{
				
				driver.close();
			}
		}

		private static String getCellValueAsString(Cell cell) 
		{
			if (cell == null) 
			{
				return "";
			}
			cell.setCellType(CellType.STRING); // Set the cell type to string to get the value as string
			return cell.getStringCellValue();
		}   
}
