package com.caiata.cucmber;

import com.caiata.utils.ManagementDriver;
import com.caiata.utils.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Properties;

import static com.caiata.utils.GlobalParameters.EXT_ANDROID;
import static com.caiata.utils.GlobalParameters.RESOURCES_PATH;

public class CucumberAppTest {
    static private AndroidDriver<?> androidDriver = null;
    static private Properties androidProp = null;
    static private DesiredCapabilities defaultDesiredCapabilities;
    private static CucumberSteps steps = null;

    @Given("start driver app")
    public void beforeAll(){
        defaultDesiredCapabilities = new DesiredCapabilities(new DesiredCapabilities());
        defaultDesiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        defaultDesiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        defaultDesiredCapabilities.setCapability(MobileCapabilityType.APP, RESOURCES_PATH + File.separator +"APKPure_v3.17.22_apkpure.com" + EXT_ANDROID);

        ManagementDriver.startMobileDriver(defaultDesiredCapabilities);
        androidDriver = ManagementDriver.getAndroidDriver();

        androidProp = new Utility().loadProp("app");
        steps = new CucumberSteps();
    }

    @Given("accept cookie")
    public void acceptCookie(){
        steps.acceptCoockie(androidProp);
    }

    @Given("accept all permission")
    public void acceptAll(){
        steps.acceptAll(androidProp);
    }

    @Given("^make a search (.*)$")
    public void search(String item){
        steps.search(androidProp,item);
    }

    @Then("click on the suggested item")
    public void suggestedItem(){
        steps.suggestedItem(androidProp);
    }

    @Then("click on app button")
    public void clickBtnApp(){
        steps.clickAppBtn(androidProp);
    }

    @Then("print category")
    public void printCategory(){
        steps.printCategory();
    }
}
