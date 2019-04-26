package CaseStudy2;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import skeleton.AdminProduct;

public class OrderPayment 
{
	WebDriver driver;
	@Before
	public void initial2()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\indumathi.krishnan\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		File pathBinary = new File("C:\\Users\\Training_b6b.00.03\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		driver = new FirefoxDriver(options);
		
		PageFactory.initElements(driver, OrderDetails.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("Type URL and login with valid username")
	public void type_URL_and_login_with_valid_username() 
	{
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("Larry added a headphone to the cart")
	public void larry_added_a_headphone_to_the_cart() 
	{
	    OrderDetails.username.sendKeys("Lalitha");
	    OrderDetails.password.sendKeys("Password123");
	    OrderDetails.login.click();  
	    OrderDetails.search.sendKeys("Summer wear");
	    OrderDetails.findDetails.click();
	    OrderDetails.addCart.click();    
	}

	@When("checkout for the payment")
	public void checkout_for_the_payment() 
	{
		OrderDetails.cart.click();
		OrderDetails.checkOut.click();
		OrderDetails.proceedPay.click();
		OrderDetails.selectBank.click();
		OrderDetails.continueButton.click();	    
	}

	@When("fills transaction details")
	public void fills_transaction_details() 
	{
	   OrderDetails.userID.sendKeys("123456");
	   OrderDetails.passID.sendKeys("Pass@456");
	   OrderDetails.loginPay.click();
	}

	@Then("the product is succesfully ordered")
	public void the_product_is_succesfully_ordered() 
	{
		 OrderDetails.transID.sendKeys("Trans@456");
		 OrderDetails.payNow.click();
	}


}
