import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import java.io.File;

public class SeleniumTest {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver");//linux_64

        // Get file
        File file = new File("src/main/ForLoop.html");
        String path = "file://" + file.getAbsolutePath();

        
        EdgeOptions options = new EdgeOptions();
        options.addArguments("headless");
        webDriver = new EdgeDriver(options);


        // Open the HTML file
        webDriver.get(path);
    }

    @After
    public void tearDown() {
        // Close the browser
        webDriver.quit();
    }

    @Test
    public void testSum2() throws InterruptedException {
        WebElement input = webDriver.findElement(By.id("input"));
        WebElement button = webDriver.findElement(By.id("button"));
        WebElement result = webDriver.findElement(By.id("result"));

        input.sendKeys("2");
        button.click();

        Assert.assertEquals("1", result.getText());
        
    }

    @Test
    public void testSum4() throws InterruptedException {
        WebElement input = webDriver.findElement(By.id("input"));
        WebElement button = webDriver.findElement(By.id("button"));
        WebElement result = webDriver.findElement(By.id("result"));

        input.sendKeys("4");
        button.click();

        Assert.assertEquals("6", result.getText());
        
    }

    @Test
    public void testSum41() throws InterruptedException {
        WebElement input = webDriver.findElement(By.id("input"));
        WebElement button = webDriver.findElement(By.id("button"));
        WebElement result = webDriver.findElement(By.id("result"));

        input.sendKeys("41");
        button.click();

        Assert.assertEquals("820", result.getText());
        
    }


}
