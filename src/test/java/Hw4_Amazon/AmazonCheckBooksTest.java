package Hw4_Amazon;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonCheckBooksTest {
    private final By ACCEPT_COOKIES_BUTTON = By.id("sp-cc-accept");

    private final By MAIN_MENU_ITEM = By.xpath(".//div[@id = 'nav-xshop']/a");

    private final By CONTINUE_BUTTON = By.xpath("//span[@class= 'a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']");

    private final By ANY_DEPARTMENT_ITEM = By.xpath("//div[@role= 'treeitem']/a");

    private final By BOOK_NUMBER_FOUR = By.xpath("//div[@id= 'gridItemRoot']");
    private final By COUNT_OF_STARS_INKATALOG = By.xpath("//i[@class= 'a-icon a-icon-star a-star-5']/span");
    private final By COUNT_OF_STARS_INBOOK = By.xpath("//i[@data-hook= 'average-star-rating']/span");
    private final By SEE_ALL_REVIEWS = By.xpath("//a[@data-hook= 'see-all-reviews-link-foot']");
    private WebDriver browser;
    private WebDriverWait wait;


    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.amazon.de/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser.findElement(ACCEPT_COOKIES_BUTTON).click();

        browser.findElement(CONTINUE_BUTTON).click();
        try {
            browser.findElement(CONTINUE_BUTTON).click();
        } catch (Exception e) {

        }

        List<WebElement> menuitems = browser.findElements(MAIN_MENU_ITEM);

        for (WebElement menuitem : menuitems) {
            if (menuitem.getText().equals("Best Sellers")) {
                wait.until(ExpectedConditions.elementToBeClickable(menuitem));
                menuitem.click();
                break;
            }
        }


        List<WebElement> sidemenuitems = browser.findElements(ANY_DEPARTMENT_ITEM);

        for (WebElement sidemenuitem : sidemenuitems) {
            if (sidemenuitem.getText().equals("Books")) {
                wait.until(ExpectedConditions.elementToBeClickable(sidemenuitem));
                sidemenuitem.click();
                break;
            }
        }

        List<WebElement> numberofbooks = browser.findElements(BOOK_NUMBER_FOUR);
        numberofbooks.get(3).click();

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser.findElement(SEE_ALL_REVIEWS).click();

    }
}