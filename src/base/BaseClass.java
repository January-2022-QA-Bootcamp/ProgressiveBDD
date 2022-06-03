package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import commons.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.LandingPage;
import objects.StartPersonalDetailsPage;
import objects.VehicleDetailsPage;
import objects.ZipCodePage;
import utils.ReadConfigFile;

public class BaseClass {
	
	public static WebDriver driver;
	
	protected LandingPage landingPage;
	protected CommonActions commonActions;
	protected ZipCodePage zipCodePage;
	protected StartPersonalDetailsPage startPersonalDetailsPage;
	protected VehicleDetailsPage vehicleDetailsPage;
  	
	public WebDriver setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ReadConfigFile.getInstance().getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ReadConfigFile.getInstance().getPageLoadTime()));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ReadConfigFile.getInstance().getImplicitlyWaitTime()));
		//initClasses(driver);
		return driver;
	}
	
	public void initClasses(WebDriver driver) {
		commonActions = new CommonActions();
		landingPage = new LandingPage(driver);
		zipCodePage = new ZipCodePage(driver);
		startPersonalDetailsPage = new StartPersonalDetailsPage(driver);
		vehicleDetailsPage = new VehicleDetailsPage(driver);
	}
	
	public void closingBrowser() {
		driver.quit();
	}
}
