package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleMainPage {
    public void  openGooglePage(){

        WebDriverInstance.driver.get("https://www.google.com/");

    }

    public void inputSearch(String keyword){
        WebElement inputsearch = WebDriverInstance.driver.findElement(By.xpath("//input[@name='q']"));
        inputsearch.sendKeys(keyword);
    }

    public void clickSearch(){
        WebElement submitbutton = WebDriverInstance.driver.findElement(By.xpath("//input[@name='btnK' and @type='submit']"));
        submitbutton.click();
    }

}

