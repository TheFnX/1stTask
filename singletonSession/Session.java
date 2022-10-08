package singletonSession;

import factoryDevices.FactoryDevices;
import io.appium.java_client.AppiumDriver;

public class Session {
    private AppiumDriver driver;
    private static Session session = null;
    private Session(){
        driver = FactoryDevices.make("Android").create();
    }

    public static Session getInstance(){
        if (session == null)
            session = new Session();
        return session;
    }

    public void closeApp(){
        driver.quit();
        session = null;
    }

    public AppiumDriver getDriver(){
        return driver;
    }
}
