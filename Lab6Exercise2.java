package locters;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab6Exercise2 {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        
        // Maximize window
        driver.manage().window().maximize();
        System.out.println("Browser window maximized.");

        // Navigate to Demo Web Shop website
        driver.get("https://demowebshop.tricentis.com/");
        System.out.println("Opened Demo Web Shop homepage.");

        // Enter product in search bar
        driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
        System.out.println("Entered search keyword.");

        // Click Search button
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        System.out.println("Clicked search button.");

        Thread.sleep(2000);

        // Get list of products
        List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
        System.out.println("Total products found: " + products.size());

        // Print names and prices
        for (WebElement product : products) 
        {
            String name = product.findElement(By.cssSelector("h2 > a")).getText();

            List<WebElement> priceElement = product.findElements(By.cssSelector(".price"));
            String price = priceElement.isEmpty() ? "Price not available" : priceElement.get(0).getText();

            System.out.println(name + " — " + price);
        }

       
    }
}
