package com.caiata.cucmber;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CucumberSteps {

    private AndroidDriver<?> androidDriver;
    private WebElement webElement;
    private Properties prop;


    public void acceptCoockie(Properties prop){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("id.accept.cookie"))).click();
    }

    public void acceptAll(Properties prop){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        androidDriver.findElement(By.id(prop.getProperty("id.allow"))).click();
        androidDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        androidDriver.findElement(By.id(prop.getProperty("id.allow"))).click();
    }

    public void search(Properties prop,String q){
        androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        androidDriver.findElement(By.id(prop.getProperty("id.banner.search"))).click();
        webElement = androidDriver.findElement(By.id(prop.getProperty("id.banner.search2")));
        webElement.clear();
        webElement.sendKeys(q);
        androidDriver.findElement(By.xpath(prop.getProperty("xpath.seggested.item"))).click();
    }

    public void suggestedItem(Properties prop){
        androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        androidDriver.findElement(By.xpath(prop.getProperty("xpath.seggested.item"))).click();
    }

    public void clickAppBtn(Properties prop){
        androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        androidDriver.findElement(By.xpath(prop.getProperty(""))).click();
    }

    public String[] printCategory(){
        List<WebElement> listaElementi = (List<WebElement>) androidDriver.findElements(By.className("nav-search-dropdown"));
        String[] tmp = new String[listaElementi.size()];
        for (int i = 0; i < listaElementi.size(); i++) {
            tmp[i] = listaElementi.get(i).getText();
        }
        return tmp;
    }
}
