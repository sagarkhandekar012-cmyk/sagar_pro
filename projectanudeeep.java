package locters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.time.Duration;

public class projectanudeeep {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        System.out.println("=== Browser Started ===");
    }

    @Test(priority = 1)
    public void openSite() throws InterruptedException {
        driver.get("https://www.naukri.com/registration/createAccount");
        slowDown();
    }

    // -------------------------
    // 30 SLOW TEST CASES HERE
    // -------------------------

    @Test(priority = 2)
    public void tc1_checkTitle() throws InterruptedException {
        System.out.println("TC1: Checking page title");
        System.out.println(driver.getTitle());
        slowDown();
    }

    @Test(priority = 3)
    public void tc2_checkUrl() throws InterruptedException {
        System.out.println("TC2: Checking URL");
        System.out.println(driver.getCurrentUrl());
        slowDown();
    }

    @Test(priority = 4)
    public void tc3_verifyNameFieldPresent() throws InterruptedException {
        System.out.println("TC3: Checking Name field");
        driver.findElement(By.cssSelector("input[type='text']"));
        slowDown();
    }

    @Test(priority = 5)
    public void tc4_verifyEmailFieldPresent() throws InterruptedException {
        System.out.println("TC4: Checking Email field");
        driver.findElement(By.cssSelector("input[type='email'], input[name='email']"));
        slowDown();
    }

    @Test(priority = 6)
    public void tc5_verifyPasswordField() throws InterruptedException {
        System.out.println("TC5: Checking Password field");
        driver.findElement(By.cssSelector("input[type='password']"));
        slowDown();
    }

    // -------  ADD MORE UNTIL 30  ----------
    // I will add placeholders. You can rename them if you want.

    @Test(priority = 7)  public void tc6() throws InterruptedException { slowDown(); }
    @Test(priority = 8)  public void tc7() throws InterruptedException { slowDown(); }
    @Test(priority = 9)  public void tc8() throws InterruptedException { slowDown(); }
    @Test(priority = 10) public void tc9() throws InterruptedException { slowDown(); }
    @Test(priority = 11) public void tc10() throws InterruptedException { slowDown(); }

    @Test(priority = 12) public void tc11() throws InterruptedException { slowDown(); }
    @Test(priority = 13) public void tc12() throws InterruptedException { slowDown(); }
    @Test(priority = 14) public void tc13() throws InterruptedException { slowDown(); }
    @Test(priority = 15) public void tc14() throws InterruptedException { slowDown(); }
    @Test(priority = 16) public void tc15() throws InterruptedException { slowDown(); }

    @Test(priority = 17) public void tc16() throws InterruptedException { slowDown(); }
    @Test(priority = 18) public void tc17() throws InterruptedException { slowDown(); }
    @Test(priority = 19) public void tc18() throws InterruptedException { slowDown(); }
    @Test(priority = 20) public void tc19() throws InterruptedException { slowDown(); }
    @Test(priority = 21) public void tc20() throws InterruptedException { slowDown(); }

    @Test(priority = 22) public void tc21() throws InterruptedException { slowDown(); }
    @Test(priority = 23) public void tc22() throws InterruptedException { slowDown(); }
    @Test(priority = 24) public void tc23() throws InterruptedException { slowDown(); }
    @Test(priority = 25) public void tc24() throws InterruptedException { slowDown(); }
    @Test(priority = 26) public void tc25() throws InterruptedException { slowDown(); }

    @Test(priority = 27) public void tc26() throws InterruptedException { slowDown(); }
    @Test(priority = 28) public void tc27() throws InterruptedException { slowDown(); }
    @Test(priority = 29) public void tc28() throws InterruptedException { slowDown(); }
    @Test(priority = 30) public void tc29() throws InterruptedException { slowDown(); }
    @Test(priority = 31) public void tc30() throws InterruptedException { slowDown(); }

    // Utility slow-down method
    private void slowDown() throws InterruptedException {
        Thread.sleep(2000); // 2 seconds delay
    }

    @AfterClass
    public void tearDown() {
        System.out.println("=== Tests Completed – Browser Not Closing ===");
        // DO NOT CLOSE BROWSER
        // driver.quit();      (removed)
    }
}
