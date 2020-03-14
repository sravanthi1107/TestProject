package selpackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\SRAVANTHI-PERSONAL\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get( "http://demo.guru99.com/test/newtours/");

	}

}
