package sql.testScript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import sql.genericLib.CommonUtility;
import sql.genericLib.baseclass;
import sql.genericLib.dataUtility;
@Listeners(sql.genericLib.ListenerImplemetation.class)
public class creatcustomerTest extends baseclass
{
	@Test
	public void cutomercreation() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		int num=cu.getrandom(10000);
		String actualcustomer=du.getDataFromExcelSheet("sheet1",0,0);
		actualcustomer=actualcustomer+num;
		driver.findElement(By.cssSelector("#container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.cssSelector(".item.createNewCustomer")).click();
		driver.findElement(By.cssSelector(".inputFieldWithPlaceholder.newNameField.inputNameField"))
		.sendKeys(actualcustomer);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		}
}