package demo.hooks;

import demo.webdriver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverHooks {
    @Before(value = "@Web")
    public void initializeWebDriver(){
        WebDriverInstance.initialize();
    }
    @After(value = "@Web")
    public void quitWebDriver(){
        WebDriverInstance.quit();
    }
}
