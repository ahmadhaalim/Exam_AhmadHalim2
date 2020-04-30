package demo.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {
    public static AndroidDriver<AndroidElement> androidDriver;

    public static void initialize(){
        String appiumUrl = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "device");
        caps.setCapability("app", "D:\\android\\TodoApp.apk");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("udid", "c612c64e0604");

        try {
            androidDriver = new AndroidDriver<>(new URL(appiumUrl),caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void quit(){

    }
}
