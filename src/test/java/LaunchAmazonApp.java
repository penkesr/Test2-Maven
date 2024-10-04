import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaunchAmazonApp {
    public static void main(String[] args) {
        // Set up WebDriverManager to manage the ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Amazon
        driver.get("https://www.amazon.com");

        // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait

        // Wait until the search bar is visible
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));

        // Enter the product name in the search box
        searchBox.sendKeys("Samsung Galaxy A15 (SM-155M/DSN), 128GB 6GB RAM, Dual SIM, Factory Unlocked GSM, International Version (Wall");

        // Submit the search
        searchBox.submit();

        // Optional: Wait until the results page is loaded
        wait.until(ExpectedConditions.titleContains("Samsung Galaxy A15"));

        // Print the title of the results page
        System.out.println("Page Title: " + driver.getTitle());

        // Wait for the first product's "Add to Cart" button to be visible and click it
        try {
            // Adjust the XPath to locate the correct "Add to Cart" button
            WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("(//input[@value='Add to Cart'])[1]"))); // Adjust XPath if necessary

            addToCartButton.click();
            System.out.println("Clicked 'Add to Cart' button.");
        } catch (Exception e) {
            System.out.println("Add to Cart button not found or not clickable: " + e.getMessage());
        }

        // Optional: Wait to confirm the item has been added to the cart
        try {
            // Wait for the cart icon to be visible
            WebElement cartIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart")));
            cartIcon.click(); // Click on the cart icon to view the cart
            System.out.println("Navigated to the cart.");
        } catch (Exception e) {
            System.out.println("Cart icon not found or not clickable: " + e.getMessage());
        }

        // Wait for the cart page to load and print the title
        wait.until(ExpectedConditions.titleContains("Shopping Cart"));
        System.out.println("Cart Page Title: " + driver.getTitle());

        // Optionally, you can print the items in the cart or perform further actions

        // Close the browser after the operation
        //driver.quit();
    }
}
