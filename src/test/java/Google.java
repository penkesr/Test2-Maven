import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Google {
    public static void main(String[] args) {
        // Set up WebDriverManager to manage the ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.google.com");

        // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait

        // Wait until the search box is visible
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        // Enter the search term in the search box
        searchBox.sendKeys("Selenium Automation Tutorials by Naveen Automation Labs");

        // Submit the search
        searchBox.submit();

        // Optional: Wait until the results page is loaded
        wait.until(ExpectedConditions.titleContains("Selenium Automation Tutorials"));

        // Print the title of the results page
        System.out.println("Page Title: " + driver.getTitle());

        // Wait for the first link in the search results to be visible and click it
        try {
            // Locate the first link using CSS selector for <h3> elements
            WebElement firstLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3")));
            firstLink.click();
            System.out.println("Clicked on the first link.");
        } catch (Exception e) {
            System.out.println("First link not found or not clickable: " + e.getMessage());
        }

        // Optional: Wait for the new page to load and print the title
        wait.until(ExpectedConditions.titleIs(driver.getTitle())); // or you can specify a title you expect
        System.out.println("New Page Title: " + driver.getTitle());

        // Close the browser after the operation
        //driver.quit();
    }
}
