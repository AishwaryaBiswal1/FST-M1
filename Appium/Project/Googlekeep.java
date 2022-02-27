package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Googlekeep {
    // Declare Android driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "appiumClass");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void addnote() {
        // Add task1
        MobileElement addnote = driver.findElementById("com.google.android.keep:id/notes");
        addnote.click();
        MobileElement addtitle = driver.findElementById("com.google.android.keep:id/browse_note_interior_content");
        addtitle.sendKeys("My note");
        MobileElement addcontent = driver.findElementById("com.google.android.keep:id/edit_note_text");
        addcontent.sendKeys("Life is beautiful.");
        MobileElement backbutton= driver.findElementById("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        List<MobileElement> numberOfNote = driver.findElementsByXPath("com.google.android.keep:id/notes");
        System.out.println("Number of task shown currently: " + numberOfNote.size());

        // Assertion for counting task
        Assert.assertEquals(numberOfNote.size(), 1);


    }


    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}
