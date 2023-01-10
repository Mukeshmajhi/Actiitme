package sql.testScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sql.genericLib.baseclass;



public class alerthandlingTest extends baseclass 
{
	@Test
	public void handlealert() throws EncryptedDocumentException, IOException
	{
		String actualcustomer=du.getDataFromExcelSheet("sheet1",1,0);
        driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
		driver.findElement(By.xpath("//ul[@id='popup_menu_items_content']/li[7]/a")).click();
		WebElement cretetypesofwork=driver.findElement(By.xpath("//span[text()='Create Type of Work']"));
		cretetypesofwork.click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(actualcustomer);
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		System.out.println(cu.alertpopupmsg(driver));
		cu.alertpopup(driver);	
	}}