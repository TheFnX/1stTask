package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCloud implements IDevice {
    @Override
    public AppiumDriver create() {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "betodubal_do5jW4");
        caps.setCapability("browserstack.key", "GHPp6Pp67HHjfanFpMvG");

        // Set URL of the application under test
        caps.setCapability("app", "bs://fe14ab329e5acfad3d0bc57a0a29c07f24e15eb7");

        // Specify device and os_version for testing
        caps.setCapability("device", "Samsung Galaxy S22 Ultra");
        caps.setCapability("os_version", "12.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "MovileTest");
        caps.setCapability("build", "0.1");
        caps.setCapability("name", "WhenDoTest");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver;
        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
            driver = new AndroidDriver<AndroidElement>(
                    new URL("http://hub.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        // Write your test case statements here

        // Invoke driver.quit() after the test is done to indicate that the test is completed.


        return driver;
    }
}
