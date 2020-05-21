package pages;

import org.openqa.selenium.By;

public class CreateAccountPage {


	public static By linkSignIn       = By.linkText("Sign in");
	public static By txtEmail         = By.id("email_create");
	public static By btnCreateAccount = By.id("SubmitCreate");
	public static By rdbSexoFeminino  = By.id("id_gender2");
	public static By txtFirstName     = By.id("customer_firstname");
	public static By txtLastName      = By.id("customer_lastname");
    public static By txtPassword      = By.id("passwd");
    public static By cbDays           = By.id("days");
    public static By cbMonths		  = By.id("months"); 
    public static By cbYears		  = By.id("years") ;
    public static By ckNewsletter     = By.id("newsletter");  
	public static By ckPartners		  = By.id("optin"); 	
	public static By txtCompany       = By.id("company");
	public static By txtAddress1      = By.id("address1");
	public static By txtAddress2      = By.id("address2");
	public static By txtCity          = By.id("city");
	public static By cbState          = By.id("id_state");
	public static By txtZip           = By.id("postcode");
	public static By cbCountry        = By.id("id_country");
	public static By txtOther         = By.id("other");
	public static By txtHPhone 		  = By.id("phone");
	public static By txtMPhone 		  = By.id("phone_mobile");
	public static By txtAssign 		  = By.id("alias");
	public static By btnRegister      = By.id("submitAccount");	
	public static By lblUser          = By.xpath("//a[@class='account']/span");
	public static By linkSignout      = By.linkText("Sign out");
}
