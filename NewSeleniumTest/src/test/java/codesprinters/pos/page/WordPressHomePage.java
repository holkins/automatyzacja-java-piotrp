package codesprinters.pos.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by holkins on 2017-05-30.
 */
public class WordPressHomePage extends PageObject {

    public static final String WORDPRESS_URL =  "https://autotestjava.wordpress.com";
    private final By searchField = By.xpath("(//article)[3]//span[@class='comments-link']");

    public void goToWordPress() {
        driver.get(WORDPRESS_URL);
    }

    public WordPressHomePage(WebDriver drv) {
        super(drv);
    }


    public void clickOnThirdComment() {
        WebElement element = driver.findElement(searchField);
        element.click();
    }


}

