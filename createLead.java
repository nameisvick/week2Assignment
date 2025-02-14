package homeAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createLead {

	private static WebElement element;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Temen");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("vvk");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("vvv");
		WebElement elementList = driver.findElement(By.id("createLeadForm_currencyUomId"));
	 Select dropDown = new Select (elementList);
		 dropDown.selectByValue("INR");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 
		 String titleCreated =driver.getTitle();
		 String sucessTittle = "View Lead | opentaps CRM";
		 boolean result;
result=titleCreated.equals(sucessTittle);
if (result)
{
System.out.println(titleCreated + " " +  "title captured");
}	 
		 driver.close();
		 
		 
		

	}

}
