package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class EdgeTest extends BaseTest {

    @Test
    public void testEdgeAmazon() throws InterruptedException {
        Dimension d=new Dimension(600,1000);
        driver.manage().window().setSize(d);
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"a-autoid-4-announce\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a")).click();


        driver.findElement(By.cssSelector(".s-main-slot .s-result-item h2 a")).click();
        System.out.println("✅ Edge selected a laptop and opened product page.");
        Thread.sleep(4000);
    }
}
