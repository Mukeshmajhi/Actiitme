package sql.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplemetation implements ITestListener
{
	 
	public void onTestFailure(ITestResult result) 
	 {	
		String tcname=result.getName();
		TakesScreenshot ts=(TakesScreenshot)baseclass.ListenerDriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./TCfailed/"+tcname+".png");
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			
		
		}
	}
}