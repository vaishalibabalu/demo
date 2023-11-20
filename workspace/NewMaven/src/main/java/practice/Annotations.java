package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void Home() {
		System.out.println("HomePage");
	}
	@Test
	 public void Home1() {
    	System.out.println("Login");
    }
    @BeforeMethod
    public void BM() {
    	System.out.println("Login");
    }
    @AfterMethod
    public void AM() {
    	System.out.println("Logout");
    }
    @BeforeClass
    public void BC() {
    	System.out.println("Launch the browser");
   }
    @AfterClass()
    	public void AC() {
    	System.out.println("close the browser");
   }
   @BeforeSuite()
        public void BS() {
	   System.out.println("connect to DB");
   }
   @AfterSuite()
       public void AB() {
	   System.out.println("connect NOT  to DB");

   }
   
    
 }
    


