import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Citibank2 {
    public static void main(String[] args) {
        // Set up WebDriverManager to manage the ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Citibank
        driver.get("https://www.citibank.com");

        // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait

        // Handle cookie consent if the banner is present
        acceptCookies(driver, wait);

        // Wait until the "Careers" link is visible and click it
        WebElement careersLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Careers")));
        careersLink.click();

        // Optional: Wait until the careers page is loaded
        wait.until(ExpectedConditions.titleContains("Careers"));

        // Print the title of the careers page
        System.out.println("Careers Page Title: " + driver.getTitle());

        // Handle cookie consent on the jobs page
        acceptCookiesOnJobsPage(driver, wait);

        // Wait for the search box in the "Search Jobs" section to be visible using the specified XPath
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search-keyword-19ed77cbdb']")));

        // Enter "QA" in the search box
        searchBox.sendKeys("QA");

        // Wait for the "Search Jobs" button to be clickable and click it
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Search Jobs')]")));
        searchButton.click();

        // Optional: Wait until the results page is loaded
        wait.until(ExpectedConditions.titleContains("Search Results"));

        // Print the title of the search results page
        System.out.println("Search Results Page Title: " + driver.getTitle());

        // Wait for the specific job link to be visible and click it
        try {
            // Locate the specific job link by its text
            WebElement specificJobLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Warsaw, Poland, Poland QA Software Developer")));
            specificJobLink.click();
            System.out.println("Clicked on the job link: Warsaw, Poland, Poland QA Software Developer.");
        } catch (Exception e) {
            System.out.println("Specific job link not found or not clickable: " + e.getMessage());
        }

        // Optional: Wait for the new page to load and print the title
        wait.until(ExpectedConditions.titleIs(driver.getTitle())); // or specify a title you expect
        System.out.println("Job Detail Page Title: " + driver.getTitle());

        // Close the browser after the operation
        driver.quit();
    }

    // Method to handle cookie consent on the main page
    private static void acceptCookies(WebDriver driver, WebDriverWait wait) {
        try {
            // Wait for the cookie consent banner
            List<WebElement> acceptButtons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Accept') or contains(text(),'Accept Cookies')]")));
            for (WebElement button : acceptButtons) {
                if (button.isDisplayed()) {
                    button.click();
                    System.out.println("Accepted cookies on the main page.");
                    break; // Exit after clicking the first visible button
                }
            }
        } catch (Exception e) {
            System.out.println("Cookie consent banner not found or already accepted on the main page: " + e.getMessage());
        }
    }

    // Method to handle cookie consent on the jobs page
    private static void acceptCookiesOnJobsPage(WebDriver driver, WebDriverWait wait) {
        try {
            // Wait for the cookie consent banner on the jobs page
            List<WebElement> acceptButtons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Accept') or contains(text(),'Accept Cookies')]")));
            for (WebElement button : acceptButtons) {
                if (button.isDisplayed()) {
                    button.click();
                    System.out.println("Accepted cookies on the jobs page.");
                    break; // Exit after clicking the first visible button
                }
            }
        } catch (Exception e) {
            System.out.println("Cookie consent banner not found or already accepted on the jobs page: " + e.getMessage());
        }
    }
}
