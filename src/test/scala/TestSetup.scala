
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

/**
  * Created by knoldus on 3/2/17.
  */
trait TestSetUp {

  val BASE_URL = "https://www.flipkart.com/"
  val EMAIL = "9910091476"
  val password = "knoldus"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/workspace/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)



}