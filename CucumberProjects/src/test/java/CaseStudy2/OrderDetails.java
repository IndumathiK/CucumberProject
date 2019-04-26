package CaseStudy2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderDetails 
{

	  @FindBy(how=How.ID,using="userName")
	  public static WebElement username;
	  
	  @FindBy(how=How.ID,using="password")
	  public static WebElement password;
	  
	  @FindBy(how=How.CSS,using="input[value='Login']")
	  public static WebElement login;
	  
	  @FindBy(how=How.ID,using="myInput")
	  public static WebElement search;
	  
	  @FindBy(how=How.CSS,using="input[value='FIND DETAILS']")
	  public static WebElement findDetails;
	  
	  @FindBy(how=How.CSS,using="a[class='btn btn-success btn-product']")
	  public static WebElement addCart;
	  
	  @FindBy(how=How.XPATH,using="//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")
	  public static WebElement cart;
	  
	  @FindBy(how=How.CLASS_NAME,using="btn btn-success btn-block")
	  public static WebElement checkOut;
	  
	  @FindBy(how=How.CSS,using="input[value='Proceed to Pay']")
	  public static WebElement proceedPay;
	  
	  @FindBy(how=How.XPATH,using="//*[@id=\\\"swit\\\"]/div[1]/div/label/i")
	  public static WebElement selectBank;
	  
	  @FindBy(how=How.CSS,using="a[onclick='radioValue()']")
	  public static WebElement continueButton;
	  
	  @FindBy(how=How.NAME,using="username")
	  public static WebElement userID;
	  
	  @FindBy(how=How.NAME,using="password")
	  public static WebElement passID;
	  
	  @FindBy(how=How.CSS,using="input[value='LOGIN']")
	  public static WebElement loginPay;
	  
	  @FindBy(how=How.NAME,using="transpwd")
	  public static WebElement transID;
	  
	  @FindBy(how=How.CSS,using="input[value='PayNow']")
	  public static WebElement payNow;
	  
	  
	 
	  
	  
	  
	  
}
