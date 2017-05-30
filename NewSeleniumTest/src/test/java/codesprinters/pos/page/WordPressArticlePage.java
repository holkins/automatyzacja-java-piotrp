package codesprinters.pos.page;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by holkins on 2017-05-30.
 */
public class WordPressArticlePage extends PageObject {

    public static final String WORDPRESS_ARTICLE_PAGE_TITLE = "nullam-nec-condimentum-tortor";

    public WordPressArticlePage(WebDriver drv) {
        super(drv);
    }

    public void clickOnCommentBox() throws InterruptedException {
        WebElement commentBox = driver.findElement(By.id("comment"));
        commentBox.click();
    }

    public void addComment (String myComment){
        WebElement commentBox = driver.findElement(By.id("comment"));
        commentBox.sendKeys(myComment);
    }

    public void addAuthor(String user) {
        WebElement authorName = driver.findElement(By.id("author"));
        authorName.click();
        authorName.sendKeys(user);
    }

    public void addEmail(String email) {
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.click();
        emailField.sendKeys(email);
    }

    public void postComment(){
        WebElement postButton = driver.findElement(By.id("comment-submit"));
        postButton.click();
    }

    public void hasText() {
        String pageContent = driver.getPageSource();
    }
}
