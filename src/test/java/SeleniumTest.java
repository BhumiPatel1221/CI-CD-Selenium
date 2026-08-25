import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {

    @Test
    public void testGoogle() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.google.com");

            String title = driver.getTitle();

            System.out.println("Page Title: " + title);

            assertTrue(title.contains("Google"));
        } finally {
            driver.quit();
        }
    }
}