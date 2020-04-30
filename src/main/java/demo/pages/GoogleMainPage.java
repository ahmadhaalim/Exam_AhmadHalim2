package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleMainPage {
    public void  openGooglePage(){

        WebDriverInstance.driver.get("https://www.google.com/");

    }

    public void inputSearch(String keyword){
        WebElement inputsearch = WebDriverInstance.driver.findElement(By.xpath("//input[@name='q']"));
        inputsearch.sendKeys(keyword);
    }

    public void pressEnter(){
        WebElement inputsearch = WebDriverInstance.driver.findElement(By.xpath("//input[@name='q']"));
        inputsearch.sendKeys(Keys.ENTER);
    }

}

