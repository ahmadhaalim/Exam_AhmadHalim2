package demo.pages;

import demo.driver.AndroidDriverInstance;
import demo.webdriver.WebDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public boolean isOnMainPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver,10);
        return wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='TO-DO-MVP']"))).isDisplayed();
    }

    public void clickAddButton(){
        AndroidElement buttonAdd = AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task"));
        buttonAdd.click();
    }

    public String checkNewAddedToDo(String title){
        AndroidElement toDoTitle = AndroidDriverInstance.androidDriver.findElement(By.id("title"));
        return toDoTitle.getText();
    }

    public void clickCheckToDo(){
        AndroidElement checkmark = AndroidDriverInstance.androidDriver.findElement(By.id("com.example.android." +
                "architecture.blueprints.todomvp.mock:id/complete"));
        checkmark.click();
    }

    public String getCheck(){
        AndroidElement checkmark = AndroidDriverInstance.androidDriver.findElement(By.id("complete"));
        return checkmark.getAttribute("checked");
    }

    public void clickFilter(){
        AndroidElement filter = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));
        filter.click();
    }

    public void clickFilterActive(){
        AndroidElement filter = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.FrameLayout/" +
                "android.widget.ListView/android.widget.LinearLayout[2]"));
        filter.click();
    }

    public void clickfilterComplete(){
        AndroidElement filter = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]"));
        filter.click();


    }
    public String filterLabel(){
        AndroidElement filterLabel = AndroidDriverInstance.androidDriver.findElement(By.id("filteringLabel"));
        return filterLabel.getText();
    }

    public String checkTitleOnOneToDoList(){
        AndroidElement title = AndroidDriverInstance.androidDriver.findElement(By.id("title"));
        return title.getText();
    }

    public void clickThreeDotMenu(){
        AndroidElement menu = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget." +
                "ImageView[@content-desc='More options']"));
        menu.click();
    }

    public void clickClearMenu(){
        AndroidElement menu = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]"));
        menu.click();
    }

    public String clearedCompleteToDo(){
        AndroidElement clear = AndroidDriverInstance.androidDriver.findElement(By.id("noTasksMain"));
        return clear.getText();
    }

    public void clickMenuNavigate(){
        AndroidElement nvg = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget." +
                "ImageButton[@content-desc='Navigate up']"));
        nvg.click();
    }

    public void clickStatistic(){
        AndroidElement stat = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget." +
                "FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget." +
                "LinearLayoutCompat[2]/android.widget.CheckedTextView"));
        stat.click();
    }

    public String getTextStat(){
        AndroidElement stat = AndroidDriverInstance.androidDriver.findElement(By.id("statistics"));
        return stat.getText();
    }


}
