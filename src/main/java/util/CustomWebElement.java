package util;

import factory.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CustomWebElement implements WebElement{

    private static final int POLLING_TIME_INTERVALL = 300;
    private final By byIdentifier;
    private Wait<WebDriver> wait;
    private WebDriver webDriver;


    /**
     * Defines a new custom web element.
     *
     * @param byIdentifier
     */
    public CustomWebElement(By byIdentifier) {
        this.webDriver = WebDriverFactory.getInstance().getDriver();
        this.byIdentifier = byIdentifier;
        this.wait = new FluentWait<>(this.webDriver).withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(POLLING_TIME_INTERVALL));
    }
    public WebElement getWebElement(){
        return  this.webDriver.findElement(this.byIdentifier);
    }

    @Override
    public List<WebElement> findElements(By by) {
        return getElement().findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return getElement().findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        return getElement().isDisplayed();
    }

    @Override
    public Point getLocation() {
        return getElement().getLocation();
    }

    @Override
    public Dimension getSize() {
        return getElement().getSize();
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String propertyName) {
        return getElement().getCssValue(propertyName);
    }

    @Override
    public void click() {
        getElement().click();
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) {
        return null;
    }

    @Override
    public void submit() {
        getElement().submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        getElement().sendKeys(keysToSend);
    }

    @Override
    public void clear() {

        getElement().clear();
    }

    @Override
    public String getTagName() {
        return getElement().getTagName();
    }

    @Override
    public String getAttribute(String name) {
        return getElement().getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return getElement().isSelected();
    }

    @Override
    public boolean isEnabled() {
        return getElement().isEnabled();
    }

    @Override
    public String getText() {
        return getElement().getText();
    }


    /**
     * * Methods used for waiting the element to appear in the DOM or to be clickable,
     * scroll page, wait for elements to be removed form the DOM.
     */



    public void waitForText(String text) {
        WebDriverWait wait = new WebDriverWait(this.webDriver, 15);
        wait.until(ExpectedConditions.textToBePresentInElement(this, text));
    }

    public void doubleClick() {
        this.click();
        this.click();
    }

    public void waitForElement() {
        WebDriverWait wait = new WebDriverWait(this.webDriver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.byIdentifier));
    }

    public void waitForElementToBePresent() {
        WebDriverWait wait = new WebDriverWait(this.webDriver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(this.byIdentifier));
    }

    public void waitForElementToBeClickable() {
        WebDriverWait wait = new WebDriverWait(this.webDriver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(this.byIdentifier));
    }

    public void waitForElementNotToBeVisible() {
        WebDriverWait wait = new WebDriverWait(this.webDriver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(this.byIdentifier));
    }
    public void scrollTillView(){
        JavascriptExecutor jsx = (JavascriptExecutor) this.webDriver;
        jsx.executeScript("arguments[0].scrollIntoView(true);", this.getWebElement());
        jsx.executeScript("scrollBy(0," + "-" + "200" + ")", "");
    }

    public void scrollDown(String size) {
        JavascriptExecutor jsx = (JavascriptExecutor) this.webDriver;
        jsx.executeScript("scrollBy(0," + size + ")", "");
    }
    public void scrollDownTillTheEnd() {
        JavascriptExecutor jsx = (JavascriptExecutor) this.webDriver;
        jsx.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollUp(String size) {
        JavascriptExecutor jsx = (JavascriptExecutor) this.webDriver;
        jsx.executeScript("scrollBy(0," + "-" + size + ")", "");
    }

    private WebElement getElement() {
        return wait.until(driver -> driver.findElement(byIdentifier));
    }

    public void waitForElementAndClick() {
        Boolean staleElement = true;
        while (staleElement) {
            try {
                this.webDriver.findElement(this.byIdentifier).click();
                staleElement = false;

            } catch (StaleElementReferenceException e) {
                staleElement = true;
            }
        }
    }

    public boolean elementHasClassWithName(String className) {
        String classes = this.getAttribute("class");
        for (String c : classes.split(" ")) {
            if (c.equals(className)) {
                return true;
            }
        }

        return false;
    }

}
