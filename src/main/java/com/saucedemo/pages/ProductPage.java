package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productText;
    // By productText = By.xpath("//span[@class='title']");

    @CacheLookup
    By productList = By.xpath("//div[@class='inventory_item']");




    public String getProductPerPage() {
        List<WebElement> productElementList = driver.findElements(productList);
        int size = productElementList.size();
        log.info("Verify six products are displayed on page " );
        return String.valueOf(size);

          }


    public String getProductText() {

        log.info("Verify product text is displayed ");
        return getTextFromElement(productText);
    }


}
