// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ServerTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void serverTest() {
    // Test name: ServerTest
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8000/");
    // 2 | setWindowSize | 1616x876 | 
    driver.manage().window().setSize(new Dimension(1616, 876));
    // 3 | click | linkText=About us | 
    driver.findElement(By.linkText("About us")).click();
    // 4 | click | linkText=Contact us | 
    driver.findElement(By.linkText("Contact us")).click();
    // 5 | click | linkText=Sign In | 
    driver.findElement(By.linkText("Sign In")).click();
    // 6 | click | linkText=Gallery | 
    driver.findElement(By.linkText("Gallery")).click();
    // 7 | click | id=1 | 
    driver.findElement(By.id("1")).click();
    // 8 | click | css=button | 
    driver.findElement(By.cssSelector("button")).click();
    // 9 | mouseDownAt | id=txtquantity | 4.25,0.6875
    {
      WebElement element = driver.findElement(By.id("txtquantity"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 10 | mouseMoveAt | id=txtquantity | 4.25,0.6875
    {
      WebElement element = driver.findElement(By.id("txtquantity"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 11 | mouseUpAt | id=txtquantity | 4.25,0.6875
    {
      WebElement element = driver.findElement(By.id("txtquantity"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 12 | click | id=txtquantity | 
    driver.findElement(By.id("txtquantity")).click();
    // 13 | type | id=txtquantity | 4
    driver.findElement(By.id("txtquantity")).sendKeys("4");
    // 14 | click | css=td:nth-child(1) > input | 
    driver.findElement(By.cssSelector("td:nth-child(1) > input")).click();
    // 15 | click | css=td:nth-child(3) > input | 
    driver.findElement(By.cssSelector("td:nth-child(3) > input")).click();
    // 16 | click | linkText=Gallery | 
    driver.findElement(By.linkText("Gallery")).click();
    // 17 | click | id=2 | 
    driver.findElement(By.id("2")).click();
    // 18 | click | css=button | 
    driver.findElement(By.cssSelector("button")).click();
    // 19 | mouseDownAt | css=tr:nth-child(2) > td:nth-child(1) | 98,14.6875
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 20 | mouseMoveAt | css=tr:nth-child(2) > td:nth-child(1) | 98,14.6875
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 21 | mouseUpAt | css=tr:nth-child(2) > td:nth-child(1) | 98,14.6875
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 22 | click | css=tr:nth-child(2) | 
    driver.findElement(By.cssSelector("tr:nth-child(2)")).click();
    // 23 | click | css=tr:nth-child(2) | 
    driver.findElement(By.cssSelector("tr:nth-child(2)")).click();
    // 24 | type | id=txtquantity | 7
    driver.findElement(By.id("txtquantity")).sendKeys("7");
    // 25 | click | css=td:nth-child(1) > input | 
    driver.findElement(By.cssSelector("td:nth-child(1) > input")).click();
    // 26 | click | linkText=Gallery | 
    driver.findElement(By.linkText("Gallery")).click();
    // 27 | click | css=tr:nth-child(5) > td:nth-child(3) | 
    driver.findElement(By.cssSelector("tr:nth-child(5) > td:nth-child(3)")).click();
    // 28 | click | id=3 | 
    driver.findElement(By.id("3")).click();
    // 29 | click | css=button | 
    driver.findElement(By.cssSelector("button")).click();
    // 30 | click | css=tr:nth-child(1) | 
    driver.findElement(By.cssSelector("tr:nth-child(1)")).click();
    // 31 | type | id=txtid | 6
    driver.findElement(By.id("txtid")).sendKeys("6");
    // 32 | click | css=tr:nth-child(2) | 
    driver.findElement(By.cssSelector("tr:nth-child(2)")).click();
    // 33 | type | id=txtquantity | 45
    driver.findElement(By.id("txtquantity")).sendKeys("45");
    // 34 | click | css=td:nth-child(1) > input | 
    driver.findElement(By.cssSelector("td:nth-child(1) > input")).click();
    // 35 | click | linkText=Gallery | 
    driver.findElement(By.linkText("Gallery")).click();
    // 36 | click | id=8 | 
    driver.findElement(By.id("8")).click();
    // 37 | click | css=button | 
    driver.findElement(By.cssSelector("button")).click();
    // 38 | mouseDownAt | css=tr:nth-child(2) > td:nth-child(1) | 111,8.6875
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 39 | mouseMoveAt | css=tr:nth-child(2) > td:nth-child(1) | 111,8.6875
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 40 | mouseUpAt | css=tr:nth-child(2) > td:nth-child(1) | 111,8.6875
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 41 | click | css=tr:nth-child(2) | 
    driver.findElement(By.cssSelector("tr:nth-child(2)")).click();
    // 42 | type | id=txtquantity | 2
    driver.findElement(By.id("txtquantity")).sendKeys("2");
    // 43 | click | css=td:nth-child(1) > input | 
    driver.findElement(By.cssSelector("td:nth-child(1) > input")).click();
    // 44 | click | linkText=Gallery | 
    driver.findElement(By.linkText("Gallery")).click();
    // 45 | click | id=7 | 
    driver.findElement(By.id("7")).click();
    // 46 | click | css=button | 
    driver.findElement(By.cssSelector("button")).click();
    // 47 | mouseDownAt | css=html | -4,333
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 48 | mouseMoveAt | css=html | -4,333
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 49 | mouseUpAt | css=html | -4,333
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 50 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 51 | type | id=txtquantity | 5
    driver.findElement(By.id("txtquantity")).sendKeys("5");
    // 52 | click | css=td:nth-child(1) > input | 
    driver.findElement(By.cssSelector("td:nth-child(1) > input")).click();
    // 53 | click | linkText=Gallery | 
    driver.findElement(By.linkText("Gallery")).click();
    // 54 | click | id=6 | 
    driver.findElement(By.id("6")).click();
    // 55 | click | css=button | 
    driver.findElement(By.cssSelector("button")).click();
    // 56 | click | css=tr:nth-child(2) | 
    driver.findElement(By.cssSelector("tr:nth-child(2)")).click();
    // 57 | type | id=txtquantity | 55
    driver.findElement(By.id("txtquantity")).sendKeys("55");
    // 58 | click | css=td:nth-child(1) > input | 
    driver.findElement(By.cssSelector("td:nth-child(1) > input")).click();
    // 59 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 60 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 61 | doubleClick | css=tr:nth-child(3) > td:nth-child(2) > input | 
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 62 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 63 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 64 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 65 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 66 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 67 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 68 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 69 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 70 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 71 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 72 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 73 | click | css=tr:nth-child(1) | 
    driver.findElement(By.cssSelector("tr:nth-child(1)")).click();
    // 74 | type | id=txtid | 1
    driver.findElement(By.id("txtid")).sendKeys("1");
    // 75 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 76 | click | css=tr:nth-child(1) | 
    driver.findElement(By.cssSelector("tr:nth-child(1)")).click();
    // 77 | type | id=txtid | 2
    driver.findElement(By.id("txtid")).sendKeys("2");
    // 78 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 79 | click | css=tr:nth-child(1) | 
    driver.findElement(By.cssSelector("tr:nth-child(1)")).click();
    // 80 | type | id=txtid | 3
    driver.findElement(By.id("txtid")).sendKeys("3");
    // 81 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 82 | click | css=tr:nth-child(1) | 
    driver.findElement(By.cssSelector("tr:nth-child(1)")).click();
    // 83 | type | id=txtid | 4
    driver.findElement(By.id("txtid")).sendKeys("4");
    // 84 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
    // 85 | click | css=tr:nth-child(1) | 
    driver.findElement(By.cssSelector("tr:nth-child(1)")).click();
    // 86 | type | id=txtid | 5
    driver.findElement(By.id("txtid")).sendKeys("5");
    // 87 | click | css=tr:nth-child(3) > td:nth-child(2) > input | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > input")).click();
  }
}
