package locters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab6Exercise1 {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        
        // Maximize window
        driver.manage().window().maximize();
        System.out.println("Browser window maximized.");

        // Navigate to Demo Web Shop website
        driver.get("https://demowebshop.tricentis.com/");
        System.out.println("Opened Demo Web Shop homepage.");

        // Click Login
        driver.findElement(By.linkText("Log in")).click();
        System.out.println("Navigated to Login page.");

        // Enter email
        driver.findElement(By.id("Email")).sendKeys("testuser@gmail.com");
        System.out.println("Entered email.");

        // Enter password
        driver.findElement(By.id("Password")).sendKeys("Test@123");
        System.out.println("Entered password.");

        // Click Login button
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
        System.out.println("Logged in successfully.");
        
        Thread.sleep(2000);

        // Search for product
        driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
        System.out.println("Entered product name in search bar.");

        driver.findElement(By.cssSelector("input[value='Search']")).click();
        System.out.println("Clicked search button.");

        Thread.sleep(2000);

        // Add first product to cart
        driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
        System.out.println("Added product to cart.");

        Thread.sleep(2000);

        // Get cart item count
        String cartValue = driver.findElement(By.cssSelector("span.cart-qty")).getText();
        System.out.println("Total items in cart: " + cartValue);

        
    }
}
