package codesprinters.pos.page;

import org.openqa.selenium.WebDriver;

/**
 * Created by holkins on 2017-05-30.
 */
public abstract class PageObject {

    protected WebDriver driver;

    public PageObject(WebDriver drv) {
        this.driver = drv;
    }

}
