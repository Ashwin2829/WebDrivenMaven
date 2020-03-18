import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Ashwin\\eclipse-workspace\\PageObjectModelBasics\\src\\test\\resources\\com\\w2a\\executables\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void doLogin() throws InterruptedException {
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
        driver.findElement(By.id("identifierId")).sendKeys("ashwin.karkera28@gmail.com");
        driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sdf");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
