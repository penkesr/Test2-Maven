import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChatGPT {
    public static void main(String[] args) {
        // Set up WebDriverManager to manage the ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open ChatGPT website
        driver.get("https://chat.openai.com");

        // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait

        // Handle cookies if a consent banner appears
        handleCookies(driver, wait);

        // Close the "Chrome is being controlled by automated test software" notification
        closeAutomationNotification(driver);

        // Wait for the input text area to be visible
        try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
            String message = "hello chatgpt you are brilliant"; // Message to send
            inputField.sendKeys(message); // Type the message

            // Wait for the send button to be clickable and click it
            WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Send')]"))); // Adjust the XPath as needed
            sendButton.click();
            System.out.println("Sent message: '" + message + "'");
        } catch (Exception e) {
            System.out.println("Error while interacting with ChatGPT: " + e.getMessage());
        }

        // Optional: Wait to observe the response
        try {
            Thread.sleep(5000); // Wait for 5 seconds (for observation, can be adjusted)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Now search for "QA"
        try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
            String searchMessage = "QA"; // Message to search
            inputField.sendKeys(searchMessage); // Type the search message

            // Wait for the send button to be clickable and click it
            WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Send')]"))); // Adjust the XPath as needed
            sendButton.click();
            System.out.println("Sent message: '" + searchMessage + "'");
        } catch (Exception e) {
            System.out.println("Error while sending search message: " + e.getMessage());
        }

        // Optional: Wait to observe the response
        try {
            Thread.sleep(5000); // Wait for 5 seconds (for observation, can be adjusted)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser after the operation
        //driver.quit();
    }

    // Method to handle cookie consent
    private static void handleCookies(WebDriver driver, WebDriverWait wait) {
        try {
            // Wait for the cookie consent button (if it appears)
            WebElement cookieAcceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Accept')]"))); // Adjust the XPath if necessary
            cookieAcceptButton.click();
            System.out.println("Accepted cookies.");
        } catch (Exception e) {
            System.out.println("No cookie consent banner found or already accepted: " + e.getMessage());
        }
    }

    // Method to close the automation notification
    private static void closeAutomationNotification(WebDriver driver) {
        try {
            // Wait for the notification element to be visible and close it
            WebElement closeButton = driver.findElement(By.xpath("//div[contains(text(),'Chrome is being controlled by automated test software')]/following-sibling::button"));
            closeButton.click();
            System.out.println("Closed the automation notification.");
        } catch (Exception e) {
            System.out.println("Automation notification not found or could not be closed: " + e.getMessage());
        }
    }
}
