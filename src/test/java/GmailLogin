import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Gmail {
    public static void main(String[] args) {
        // Set up WebDriverManager to manage the ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Gmail login page
        driver.get("https://gmail.com");

        // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait

        // Wait for the email input field to be visible and enter the username
        try {
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
            emailField.sendKeys("penkesr24@gmail.com"); // Enter the username
            // Click the "Next" button
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
            nextButton.click();
            System.out.println("Entered username and clicked 'Next'.");
        } catch (Exception e) {
            System.out.println("Error entering username: " + e.getMessage());
        }

        // Wait for the password input field to be visible and enter the password
        try {
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            passwordField.sendKeys("Sandhya@2025"); // Enter the password
            // Click the "Next" button
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
            nextButton.click();
            System.out.println("Entered password and clicked 'Next'.");
        } catch (Exception e) {
            System.out.println("Error entering password: " + e.getMessage());
        }

        // Optional: Wait to observe the Gmail home page loading
        try {
            wait.until(ExpectedConditions.titleContains("Inbox")); // Wait for the Inbox title
            System.out.println("Logged in to Gmail home page.");
        } catch (Exception e) {
            System.out.println("Error during login: " + e.getMessage());
        }

        // Optional: Wait to observe the Gmail home page for a few seconds
        try {
            Thread.sleep(5000); // Wait for 5 seconds (for observation, can be adjusted)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser after the operation
        driver.quit();
    }
}
