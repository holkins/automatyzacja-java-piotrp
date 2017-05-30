package codesprinters.wordpress;

import codesprinters.pos.TestBase;
import codesprinters.pos.page.WordPressArticlePage;
import codesprinters.pos.page.WordPressHomePage;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by holkins on 2017-05-30.
 */
public class WordPressTest  extends TestBase {

    @Test
    public void addCommentAtWordPress() throws InterruptedException {

        WordPressHomePage wordPress = new WordPressHomePage(driver);
        Long timestamp = System.currentTimeMillis();
        String myComment = "PP timestamp: "  + timestamp;
        String userName = "selenium user";
        String userEmail = "testowyemail@o2.com";

        wordPress.goToWordPress();
        Thread.sleep(1000);
        wordPress.clickOnThirdComment();
        Thread.sleep(3000);

        WordPressArticlePage wordPressArticle = new WordPressArticlePage (driver);


        wordPressArticle.clickOnCommentBox();
        Thread.sleep(1000);

        wordPressArticle.addComment(myComment);
        Thread.sleep(1000);

        wordPressArticle.addEmail(userEmail);
        Thread.sleep(1000);

        wordPressArticle.addAuthor(userName);
        Thread.sleep(1000);

        wordPressArticle.postComment();
        Thread.sleep(5000);



        Assert.assertTrue(driver.getPageSource().contains(myComment));


    /*
           WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(
                ExpectedConditions.titleIs(
                        wordPressArticle.WORDPRESS_ARTICLE_PAGE_TITLE));
*/


    }

}
