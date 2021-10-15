import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {
    @Test
    public void testFirst() throws InterruptedException {
        //arrange
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:/Users/Aysylu/Documents/Java/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";
        String expectedHeaderText = "Welcome to 99 Bottles of Beer";


        //act
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        Thread.sleep(3000);

        String actualResult = driver.getCurrentUrl();

        //assert

        Assert.assertEquals(actualResult, expectedResult);

        driver.close();
        driver.quit();
    }

//    @Test
//    public void 1
}
