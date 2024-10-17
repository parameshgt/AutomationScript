package gitproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GitJava {

			public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://ambulance.genamplifysol.com/");
			
			driver.findElement(By.className("inputs-login")).sendKeys("admin@test.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin@123");
			driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[3]/button[1]")).click();
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/ul/li[4]/div[2]/span")).click();
			String s = "Private Service Management";
			
	     try {
	    	// boolean pvt = driver.findElement(By.xpath("//div[2]/div/div/div/div/div[1]/h4")).isDisplayed();

	    	 String k = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[1]/h4")).getText();
	    	 System.out.println(k.equals(s));
	    	 System.out.println(k);
	     }catch(Exception e) {
	    	 System.out.println("not found"); 
	     }
	     Select drop = new Select(driver.findElement(By.id("sort-by")));
			List<WebElement> lsst = drop.getOptions();
			for(WebElement lss :lsst ) {
			System.out.println(lss.getText());
			}
			Actions act = new Actions(driver); 
			act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/p[2]")));
		    act.build().perform();
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div/div")));
		    act.build().perform();
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/div/div"))); 
		    act.build().perform();
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[4]/div/div/p[2]"))); 
		    act.build().perform();
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[5]/div/div/div"))); 
		    act.build().perform();
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[6]/div/div/p[2]"))); 
		    act.build().perform();
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[7]/div/div/p[2]"))); 
		    act.build().perform();
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[8]/div/div/p[3]"))); 
		    act.build().perform();
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[9]/div/div/div"))); 
		    act.build().perform();	    
		    act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[10]/div/div/p[2]"))); 
		    act.build().perform();
		   // act.moveToElement(driver.findElement(By.xpath("//div[2]/div/div[9]/div/div/div"))); 
		    //act.build().perform();
		    
		    driver.findElement(By.className("private-service-search-bar")).sendKeys("Tsrtc");
		    Thread.sleep(2000);
		    driver.navigate().refresh();
		    
		    driver.findElement(By.className("private-service-search-bar")).sendKeys("Rapido");
		    Thread.sleep(2000);
		    driver.navigate().refresh();
		   
		   
		    driver.findElement(By.className("private-service-search-bar")).sendKeys("bheem service");
		    Thread.sleep(2000);
		    driver.navigate().refresh();
		   
		    
		    driver.findElement(By.className("private-service-search-bar")).sendKeys("Life");
		    Thread.sleep(2000);
		    driver.navigate().refresh();
		    
		   // driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div/div[3]/button[2]/svg")).click();
		    	    
		    driver.findElement(By.xpath("//div[2]/button")).click();
		    Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[3]/div/div[2]/button[2]")).click();
		   Thread.sleep(2000);
		   driver.close();
		
		

	}

}
