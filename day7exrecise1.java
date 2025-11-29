package locters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7exrecise1 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();  // No need to give path

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");

        driver.findElement(By.id("password")).sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        String successText = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Success Message : " + successText);

        if (successText.equals("Logged In Successfully")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

        // Browser stays open until you manually close it
    }
}
