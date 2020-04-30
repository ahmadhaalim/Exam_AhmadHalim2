package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    public void inGoogleSearchPage(){

    }

    public void clickFirstResult(){
        WebElement result= WebDriverInstance.driver.findElement(By.xpath("//h3[contains(text(),'Pikachu - " +
                "Wikipedia bahasa Indonesia, ensiklopedia')]"));
        result.click();
    }
}
