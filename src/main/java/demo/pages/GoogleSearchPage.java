package demo.pages;

import demo.webdriver.WebDriverInstance;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    public void inGoogleSearchPage(){

    }

    public void clickFirstResult(String pokename){
        String str = StringUtils.capitalize(pokename);
        WebElement result= WebDriverInstance.driver.findElement(By.xpath("//h3[contains(text(),'"+str+" -" +
                " Wikipedia bahasa Indonesia, ensiklopedia')]"));
        result.click();
    }
}
