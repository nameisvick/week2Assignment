package homeAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {


	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		// driver.close();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("vvkacc");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		
		WebElement elementList = driver.findElement(By.name("industryEnumId"));
		Select dropDownlist = new Select(elementList);
		dropDownlist.selectByValue("IND_SOFTWARE");
		
		WebElement elementList2 = driver.findElement(By.name("ownershipEnumId"));
		Select dropDownlist2 = new Select(elementList2);
		dropDownlist2.selectByVisibleText("S-Corporation");
		
		
		WebElement elementList3 = driver.findElement(By.id("marketingCampaignId"));
		Select dropDownlist3 = new Select(elementList3);
		dropDownlist3.selectByIndex(6);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		

	}

}
