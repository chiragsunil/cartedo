package page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LandCartedoFirstPage {

    WebDriver driver;

    public LandCartedoFirstPage() {
        // Initialize the ChromeDriver instance
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    // Method to check if an element is displayed or enabled
    public void checkElementStatus(WebElement element, String elementName) {
        if (element.isDisplayed()) {
            System.out.println(elementName + " is Displayed");
        } else if (element.isEnabled()) {
            System.out.println(elementName + " is Enabled but not displayed");
        } else {
            System.out.println(elementName + " is not Displayed or Enabled. Test Fail");
        }
    }


    public void testElements() {
        driver.get("https://cartedo.com/");

        // Element: Best use of GenAI in Education
        WebElement genAi = driver.findElement(By.xpath("//span[@class='text-sm font-semibold hero-ai-text text-main-black md:text-base']"));
        checkElementStatus(genAi, "Best use of GenAI in Education");

        // Element: Features
        WebElement feature = driver.findElement(By.xpath("//ul[@id='desktop-header-nav']//a[@class='relative home-two-nav-item hover:text-indigo-600'][normalize-space()='Features']"));
        checkElementStatus(feature, "Features");

        //Title
        WebElement learning = driver.findElement(By.xpath("//h1[contains(text(),'Revolutionizing Learning with Text-to-Simulation A')]"));
        checkElementStatus(learning,"title");

        //SubTitle
        WebElement subTitle = driver.findElement(By.xpath("//*[contains(@data-aos, 'fade-up')]"));
        checkElementStatus(subTitle,"subtitle");

        //BookDemo
        // Locate an element that contains a certain class name
        WebElement bookDemo = driver.findElement(By.xpath("//*[contains(@class, 'group text-sm md:text-base w-fit bg-white px-6 md:px-10')]"));
        checkElementStatus(bookDemo,"BOOKDEMO");

        //Usecases
        WebElement useCases = driver.findElement(By.xpath("//span[@class='relative z-10 font-semibold transition-all duration-300 text-main-black font-inter group-hover:text-white']"));
        checkElementStatus(useCases,"UseCases");

        //image
        //WebElement image = driver.findElement(By.xpath("//*[contains(@id, 'home-banner-float-mouse-anim')]"));
        //checkElementStatus(image,"Image");



    }

    public static void main(String[] args) {
        LandCartedoFirstPage landCartedo = new LandCartedoFirstPage(); // Initialize the class
        landCartedo.testElements(); // Run the test method

    }
}
