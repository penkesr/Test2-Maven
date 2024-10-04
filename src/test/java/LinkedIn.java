import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinkedIn {
    public static void main(String[] args) {
        // Set up WebDriverManager to manage the ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open LinkedIn
        driver.get("https://www.linkedin.com");

        // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait

        // Optional: Wait for the cookie consent button and accept cookies if needed
        try {
            WebElement cookieAcceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Accept')]")));
            cookieAcceptButton.click();
            System.out.println("Accepted cookies.");
        } catch (Exception e) {
            System.out.println("No cookie consent banner found or already accepted: " + e.getMessage());
        }

        // Click on the login button
        try {
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
            loginButton.click();
            System.out.println("Clicked the login button.");
        } catch (Exception e) {
            System.out.println("Error while clicking the login button: " + e.getMessage());
        }

        // Wait for the login form to appear and enter credentials
        try {
            // Enter the email
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            emailField.sendKeys("your_email@example.com"); // Replace with your LinkedIn email

            // Enter the password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            passwordField.sendKeys("your_password"); // Replace with your LinkedIn password

            // Click the submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            submitButton.click();
            System.out.println("Logged in successfully.");
        } catch (Exception e) {
            System.out.println("Error during login: " + e.getMessage());
        }

        // Optional: Wait until the home page is loaded
        try {
            wait.until(ExpectedConditions.titleContains("LinkedIn"));
            System.out.println("LinkedIn home page loaded.");
        } catch (Exception e) {
            System.out.println("Error during home page loading: " + e.getMessage());
        }

        // Navigate to the jobs page
        try {
            WebElement jobsLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Jobs")));
            jobsLink.click();
            System.out.println("Navigated to the Jobs page.");
        } catch (Exception e) {
            System.out.println("Error navigating to the Jobs page: " + e.getMessage());
        }

        // Search for jobs with the keyword "QA"
        try {
            // Wait for the search box to be visible and enter "QA"
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, 'Search jobs')]")));
            searchBox.sendKeys("QA");

            // Click the search button
            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@type, 'submit')]")));
            searchButton.click();
            System.out.println("Searched for jobs: 'QA'.");
        } catch (Exception e) {
            System.out.println("Error during job search: " + e.getMessage());
        }

        // Optional: Wait to observe the search results for a few seconds
        try {
            Thread.sleep(5000); // Wait for 5 seconds (for observation, can be adjusted)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser after the operation
        driver.quit();
    }
}
