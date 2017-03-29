import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.{ExpectedCondition, ExpectedConditions}
import org.scalatest.FlatSpec

class CreateCustomTest extends FlatSpec with TestSetUp {

  "A user" should "visit on flipKart.com" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    val title = driver.getTitle
    val pageSource = driver.getPageSource().length
    if (driver.getCurrentUrl == BASE_URL) {
      println("WELCOME TO FlipKart.com with title : " + title)
      println("the lenght of the page source is: " + pageSource)
    } else {
      println("something went wrong")
    }
  }

  "user" should "logged in" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    driver.findElementByCssSelector("ul._3Ji-EC li._2sYLhZ:nth-child(9) a._2k0gmP").click()
    driver.findElementByCssSelector("div._39M2dM input").sendKeys(EMAIL)
    driver.findElementByCssSelector("div._39M2dM:nth-child(2) input").sendKeys(password)
    driver.findElementByCssSelector("div._1avdGP button").click()

  }

  "user" should "select an item" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    driver.findElement(By.cssSelector("div._3Ed3Ub ul._114Zhd li.Wbt_B2:nth-child(1) a")).click()
    webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul._3GtRpC")))
    driver.findElement(By.cssSelector("ul._3GtRpC li._1GPxMV:nth-child(1) ul li._2GG4xt:nth-child(1) ul li._1KCOnI:nth-child(3) a")).click()
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    driver.findElement(By.cssSelector("div._2SxMvQ div.col.zZCdz4:nth-child(1) a")).click()
  }

  "user" should  "add item to cart" in {

    //driver.manage().window().maximize()
    driver.findElementByCssSelector("div._1oaFsP._3YvPug ul li button").click()
    driver.findElementByCssSelector("div._1EA4La div._2BPjzq button").click()
    webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._2qUgWb.HAZdhB div._2zqhDs div._1QdAN_ a")))
    driver.findElementByCssSelector("div._2qUgWb.HAZdhB div._2zqhDs div._1QdAN_ a button").click()
  }

  "user" should "select and add another item to the cart" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    driver.findElement(By.cssSelector("div._3Ed3Ub ul._114Zhd li.Wbt_B2:nth-child(1) a")).click()
    webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul._3GtRpC")))
    driver.findElement(By.cssSelector("ul._3GtRpC li._1GPxMV:nth-child(1) ul li._2GG4xt:nth-child(3) ul li._1KCOnI:nth-child(3) a")).click()
    driver.findElement(By.cssSelector("div._2kSfQ4 div._1CzqlW div._3liAhj a")).click()
    driver.findElementByCssSelector("div._1oaFsP._3YvPug ul li button").click()
    driver.findElementByCssSelector("div._1EA4La div._2BPjzq button").click()
    webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._2qUgWb.HAZdhB div._2zqhDs div._1QdAN_")))
    driver.findElementByCssSelector("div._2qUgWb.HAZdhB div._2zqhDs div._1QdAN_ form button").click()

  }

  "user" should "close window" in {

    driver.close()

  }
}