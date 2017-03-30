
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait TestSetUp {

  val BASE_URL = "https://www.flipkart.com/"
  val EMAIL = "9910091476"
  val password = "knoldus"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/workspace/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)
  val NAME = "Ramandeep Kaur"
  val PINCODE = 110058
  val ADDRESS = "WZ 104 G-Block Hari Nagar New Delhi"
  val PHONE = "9910091476"
  val CHECKOUT_URL = "https://www.flipkart.com/checkout/init"

}