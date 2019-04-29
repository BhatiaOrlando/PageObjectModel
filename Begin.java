package dataframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class cucumberReport { 
	   WebDriver driver = null; 
		
	   @Given("^I have open the browser$") 
	   public void openBrowser() { 
	      driver = new FirefoxDriver();
	   } 
		
	   @When("^I open Facebook website$") 
	   public void goToFacebook() { 
	      driver.navigate().to("https://www.facebook.com/"); 
	   } 
		
	   @Then("^Login button should exits$") 
	   public void loginButton() { 
	      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail");
	      }
	   } 
		
	   @Then("^Forgot password link should exist$") 
	   public void forgotPWD() { 
	      if(driver.findElement(By.id("")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else {
	         System.out.println("Test 1 Fail");
	      } 
	   } 
	}

//import org.openqa.selenium.WebDriver;

//public class Begin {
	
//	 public static void main(String[] args) throws InterruptedException {
	        // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
//			System.setProperty("webdriver.chrome.driver","C://driver/chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
	    	
//	        String baseUrl = "http://orlandofcypaa.org/";
//	        String expectedTitle = "Welcome: Mercury Tours";
//	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
//	        driver.get(baseUrl);

	        // get the actual value of the title
//        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
//	        if (actualTitle.contentEquals(expectedTitle)){
//	           System.out.println("Test Passed!");
//	        } else {
//	            System.out.println("Test Failed");
	        }
	        //Thread.sleep(5000);
//	       driver.findElement(By.xpath("//button[contains(text(),'Registration')]")).click();
	        //System.out.println(strname);
	        //close Fire fox
	        //driver.close();
	        

//	 }
//}
