package locters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab2 {
	 public static void main( String[] args )
	    {
	    	   // Set up WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/checkboxes"); // A real test website

	        // Locate all checkboxes on the page
	        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	        
	        int totalCheckboxes = checkboxes.size();
	        int selectedCount = 0;
	        int unselectedCount = 0;

	        // Iterate through each checkbox and update selection
	        for (WebElement checkbox : checkboxes) {
	            if (!checkbox.isSelected()) {
	                checkbox.click();  // Select the checkbox if not selected
	                selectedCount++;
	            } else {
	                unselectedCount++;
	            }
	        }

	        // Display checkbox status
	        System.out.println("Total checkboxes: " + totalCheckboxes);
	        System.out.println("Now selected checkboxes: " + selectedCount);
	        System.out.println("Already selected checkboxes: " + unselectedCount);
	        
	        
	    }
}
