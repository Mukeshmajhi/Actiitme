package sql.testScript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sql.genericLib.baseclass;

public class dropdownhandleTest extends baseclass 
{
@Test
public void handledropdown()
{
	driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings')]")).click();
	driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
    WebElement wb=driver.findElement(By.cssSelector("#firstHierarchyLevelCodeSelect"));
    cu.dropdown(wb,4);
    System.out.println(driver.findElement(By.id("FormModifiedTextCell")).getText());
}
}
