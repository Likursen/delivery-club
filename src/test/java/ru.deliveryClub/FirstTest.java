package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest extends WebDriverSettings {

    @Test
    public void titleTest() {
        String title = driver.getTitle();
        Assert.assertEquals("Деливио", title);
    }

    @Test
    public void addressButtonTest() {
        By addressButtonXpath = By.xpath("//button[@title='Адрес']");
        driver.findElement(addressButtonXpath);
    }
}