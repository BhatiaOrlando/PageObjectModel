package automationFramework;




public class TestNG2 {
  @Test
  public void f() {
	  // declaration and instantiation of objects/variables
  	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C://driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
  	
      String baseUrl = "http://orlandofcypaa.org/";
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = "";
      

      // launch Fire fox and direct it to the Base URL
      driver.get(baseUrl);

      // get the actual value of the title
      actualTitle = driver.getTitle();

      /*
       * compare the actual title of the page with the expected one and print
       * the result as "Passed" or "Failed"
       */
      if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test Passed!");
      } else {
          System.out.println("Test Failed");
      }
      //Thread.sleep(5000);
     driver.findElement(By.xpath("//button[contains(text(),'Registration')]")).click();
      //System.out.println(strname);
      //close Fire fox
      //driver.close();
     //driver.findElement(By.LinkText("Running Windows Network Diagnostics"));
     Assert.assertEquals(actualTitle, expectedTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
