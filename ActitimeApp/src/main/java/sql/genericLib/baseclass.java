package sql.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import sql.elementRepository.loginpage;
;

public class baseclass 
{
	public WebDriver driver;
	public dataUtility du=new dataUtility();
	public CommonUtility cu=new CommonUtility();
    public static WebDriver ListenerDriver;
    
	@BeforeClass(alwaysRun=true)
	public void launchbrowser()
	{
		driver=new ChromeDriver(); 
		ListenerDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("url"));
		loginpage lp=new loginpage(driver);	
		lp.loginapp(du.getDataFromProperties("un"), du.getDataFromProperties("pwd"));
	}
	
@AfterMethod(alwaysRun=true)
public void logout()
{
	loginpage lp=new loginpage(driver);
  lp.logoutapp();
}

@AfterClass(alwaysRun=true)
public void closebrowser()
{
driver.close();	 
}
}