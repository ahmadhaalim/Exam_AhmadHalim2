package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WikiArticle {
    public String getName(){
        WebElement name = WebDriverInstance.driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[4]/div[1]" +
                "/table[1]/tbody[1]/tr[1]/th[1]"));
        return name.getText();
    }
    
    public String getId(){
        WebElement id = WebDriverInstance.driver.findElement(By.xpath(""));
        return id.getText();
    }
}
