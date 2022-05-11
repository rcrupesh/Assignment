package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail {

	public static void main(String[] args) {
		
		
			
			
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			WebDriver driver = new ChromeDriver(options);
			 driver.manage().window().maximize();     
			
			 System.out.println("Browser Launched");
			      
		
			     driver.get("https://mail.google.com/");
			      
			      WebElement emailId = driver.findElement(By.xpath("//input[@type='email']"));
			      emailId.sendKeys("iamrupesh00@gmail.com");
			     // emailId.sendKeys("nikhilagrawalhere@gmail.com");
			      System.out.println("Entering emailId");
			      
			      WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
			      nextBtn.click();
			    
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			      WebElement pass = driver.findElement(By.name("password"));
			      pass.sendKeys("Rupesh44@");
			     // pass.sendKeys("@Openit4me1");
			      System.out.println("Entering Password");
			      
			      //stale element exception
			      WebElement nextBtn1 = driver.findElement(By.xpath("//span[text()='Next']"));
			      JavascriptExecutor js =( JavascriptExecutor)driver;
			      
			      js.executeScript("arguments[0].click();", nextBtn1);
			      
//			     WebElement gmailIcon = driver.findElement(By.xpath("//span[@style='background-position: 0 -2001px;']"));
//			    
//			     Actions act = new Actions(driver);
//		    	 act.moveToElement(gmailIcon).click().build().perform();
			     
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//			      WebElement compose = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));

//			      compose.click();
//			      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//			      WebElement to = driver.findElement(By.xpath("//div[@class='fX aiL']"));
//			     to.click();
			      System.out.println("Entering Reciver mailId");
//			      to.sendKeys("nikhilagrawalhere@gmail.com");
			     
			      
			      WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
//			      driver.findElement(By.xpath("//*[text()= 'COMPOSE']")).click();
//			      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[contains(@aria-label, 'To')]")));
//			      driver.findElement(By.xpath("//textarea[contains(@aria-label, 'To')]")).click();
//			      driver.findElement(By.xpath("//textarea[contains(@aria-label, 'To')]")).sendKeys("nikhilagrawalhere@gmail.com");
//			      driver.findElement(By.name("subjectbox")).click();
			      System.out.println("Entering Subject");
//			      driver.findElement(By.name("subjectbox")).sendKeys("Test Mail");
//			      driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).click();
			      System.out.println("Entering Mail Body");
//			      driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Test Email Body");
//			  	  WebElement threeDot = driver.findElement(By.xpath("(//div[@class='J-J5-Ji J-JN-M-I-JG'])[5]"));

//			      threeDot.click();
			      System.out.println("Marking Lable As Social");
//			      js.executeScript("arguments[0].click();", threeDot);
//			        
//			      driver.findElement(By.xpath("//span[@class='J-Ph-hFsbo']")).click();
//			      driver.findElement(By.xpath("//div[@title='Social']")).click();	
			      System.out.println("Sending mail");
//			      driver.findElement(By.xpath("//table[@id=':7r']//div[@id=':8b']")).click();
			      
			      System.out.println("Checking mail in inbox");
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			      driver.findElement(By.xpath("//a[@aria-label='Inbox']")).click();
			      driver.findElement(By.xpath("//div[text()='Social']")).click();
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			      System.out.println("Marking Mail As Stared");
			      driver.findElement(By.xpath("//span[contains(@id,':5')and @role='button']")).click();
			      
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			      System.out.println("Opening Mail");
			      driver.findElement(By.xpath("//div[@class='xS' and @role='link']//span[@data-legacy-last-message-id='1806e8a9a6e9edae']")).click();
			      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			  	
			      
			      //test Case 1
			      System.out.println("Fetching Mail Body");
				    String mailBody =driver.findElement(By.xpath("(//div[@class='ii gt'])[1]")).getText();
				    System.out.println("Mail BOdy is :-" + mailBody);
				    
				    System.out.println("Validating Mail Body");
				  
				    if(mailBody.equals("Test Email Body")) {
				    	System.out.println("mail body content matched Test Case Pass");
				    }
				    else {System.out.println("mail body content didn't matched Test Case Fail");
				    }
			      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			      driver.findElement(By.xpath("//img[@class='ajz']")).click();
			      
			      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
				  
			      
			      //Test case 2    
			      System.out.println("Fetching Mail Subject");
			      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			     String subject = driver.findElement(By.xpath("(//tr[@class='ajv']//td[@class='gL']//span[@class='gI'])[3]")).getText();
		         System.out.println("Subject is :- " +subject);
		         System.out.println("Validating Mail Subject");
		         if(subject.equals("Test Mail")) {
				    	System.out.println("mail subject content matched Test Case Passed");
				    }
				    else {System.out.println("mail subject content didn't matched Test Case Fail");
				    }
		         driver.findElement(By.xpath("//img[@class='ajz']")).click();
			      
		         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
				
		         
		         // Test Case 3 
		         System.out.println("Fetching Mail Label");
		         WebElement label = driver.findElement(By.xpath("(//div[@class='asb T-I-J3 J-J5-Ji'])[2]"));
		  
		         Actions act =new Actions(driver);
		         act.moveToElement(label).click().build().perform();
		        WebElement social = driver.findElement(By.xpath("//div[@title='Social']"));
		        WebElement updates = driver.findElement(By.xpath("//div[@title='Updates']"));
		        
		        System.out.println("Validating Mail Label");
		        String status = social.getAttribute("aria-checked");
		        if(status.equals("true")) {
			    	System.out.println("Mail Labeled As Social");
			    }
			    else 
			    {
			    	System.out.println("Mail Not Labeled As Social");
			    } 
		        
		        
		        System.out.println("Feteching Mail Label");
		        String updatestatus = updates.getAttribute("aria-checked");
		     
		        if(updatestatus.equals("true")) {
			    	System.out.println("Mail Labeled As Update");
			    }
			    else 
			    {
			    	System.out.println("Mail Not Labeled As Update");
			    }
		        
		        System.out.println("All three Cases Executed");
		
		}

	}


