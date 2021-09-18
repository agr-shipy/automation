package com.automation.base;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.automation.base.DriverInstance.getDriver;
import static com.automation.base.WebElementUtils.waitForVisible;
import java.util.List;

public class AssertionUtils {
    public static void assertPresent(WebElement element) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Element %s should be displayed !!!", element.getText()), element.isDisplayed());
    }

    public static void assertNotPresent(List<WebElement> element) {
        Assert.assertTrue(element.size() == 0);
    }

    public static void assertEquals(WebElement element, String actual, String expected) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", actual, expected), actual.contains(expected));
    }
    
    public static void assertEqualsGetAttribute(WebElement element, String attribute, String expected) {
        waitForVisible(element);
        Assert.assertEquals(expected,element.getAttribute(attribute));
    }

    public static void assertEquals(WebElement element, String expected) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", element.getText(), expected), element.getText().contains(expected));
    }

    public static void assertPageTitle(String expected) {
        String actualTitle = getDriver().getTitle();
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", actualTitle  , expected), actualTitle.contains(expected));
    }
}
