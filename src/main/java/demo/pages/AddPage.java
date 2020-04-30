package demo.pages;

import demo.driver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddPage {
    public boolean isOnAddPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver,10);
        return wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='New TO-DO']"))).isDisplayed();
    }

    public void insertTitle(String title){
        AndroidElement inputTitle = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));
        inputTitle.sendKeys(title);
    }

    public void insertDescription(String desc){
        AndroidElement inputDescription = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_description"));
        inputDescription.sendKeys(desc);
    }

    public void clickCheckmark(){
        AndroidElement addButton = AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done"));
        addButton.click();
    }
}
