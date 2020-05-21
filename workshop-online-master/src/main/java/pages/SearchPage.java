package pages;

import org.openqa.selenium.By;

public class SearchPage {
	public static By txtSearch = By.id("search_query_top");
	public static By itensLista = By.xpath("//div[@class='product-container']//a[@class='product-name']");
    //public static By btQuantity = By.xpath("//p[@id=\'quantity_wanted_p\']/a[2]"); 
	public static By btQuantity = By.xpath("//p[@id='quantity_wanted_p']/a[2]");
	public static By cbSize = By.name("group_1");
	public static By btAddcart = By.id("add_to_cart");
	
	public static By btProceed = By.linkText("Proceed to checkout");
	public static By btSummaryProceed = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span/i");
	public static By btAdressProceed = By.xpath("//*[@id=\"center_column\"]/form/p/button/span/i");
	
	public static By cbAgree = By.id("cgv");
	public static By btShippingProceed = By.name("processCarrier");
	
	public static By btPayByBank = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span");
	
	public static By btConfirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button/span/i");
	
	
}