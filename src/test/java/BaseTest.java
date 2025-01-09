import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //beforeall ve afterall static olduğu için statik yazmamıza gerek kalmaz bunu kullanınca
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //bu da methodlrı karışık değil sırayla koşması için
public class BaseTest {
    WebDriver driver;

    @BeforeAll

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
   }




}
