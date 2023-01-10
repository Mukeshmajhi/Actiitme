package sql.genericLib;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility 
{
	public int getrandom(int value)
	{
	Random r=new Random();
	int num=r.nextInt(value);
	return num;
	}
	
	public String alertpopupmsg(WebDriver driver) 
		{
			Alert alt=driver.switchTo().alert();
			String msg=alt.getText();
			return msg;
		}
	
		public void alertpopup(WebDriver driver) 
		{
			
			Alert alt=driver.switchTo().alert();
			alt.accept();
         }
		public void dropdown(WebElement wb,int num)
		{
			        Select s=new Select(wb);
					s.selectByIndex(num);
		}
		}