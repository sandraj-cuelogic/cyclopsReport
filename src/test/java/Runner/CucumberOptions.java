package test.java.Runner;

import java.lang.annotation.Annotation;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.WebDriver;

import automationframework.AutomationLog;
import automationframework.ScreenshotAndTestNgReporterListener;
import pageobjects.Page;

public class CucumberOptions implements ExtendedCucumberOptions{

/*	public CucumberOptions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String jsonReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int retryCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean detailedReport() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean detailedAggregatedReport() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean overviewReport() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean toPDF() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String outputFolder() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
