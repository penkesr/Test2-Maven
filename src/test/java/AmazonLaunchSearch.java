import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonLaunchSearch {
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

        // Click on the "Sign In" link
        WebElement signInLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
        signInLink.click();

        // Wait for the email/phone number input field and enter the username/phone number
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
        usernameField.sendKeys("6146871081"); // Your username/phone number

        // Click on the "Continue" button
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Wait for the password input field and enter the password
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")));
        passwordField.sendKeys("@Sairam123"); // Your password

        // Click on the "Sign In" button
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();

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

        // Wait for the first product link to be visible and click it
        try {
            WebElement productLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"))); // Adjust the XPath if necessary
            productLink.click();
            System.out.println("Navigated to the product details page.");
        } catch (Exception e) {
            System.out.println("Product link not found or not clickable: " + e.getMessage());
        }

        // Wait for the "Add to Cart" button to be available on the product details page and click it
        try {
            // Wait for the "Add to Cart" button to be visible and click it
            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("add-to-cart-button"))); // The ID for the "Add to Cart" button
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
        // driver.quit();
    }
}
