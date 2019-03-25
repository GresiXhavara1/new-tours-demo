package factory;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    private static boolean initialized = false;
    public static WebDriver webDriver;
    public static boolean headless = false;

    public WebDriverFactory(){
    }
    /**
     * WebDriverFactoryExtend instance
     */
    private static WebDriverFactory instance = new WebDriverFactory();

    /**
     * @return WebDriverFactory instance
     */
    public static WebDriverFactory getInstance() {
        return instance;
    }
    public WebDriver getDriver() {
        return webDriver;
    }

    public static void setup() {
        if (!initialized) {
            DriverConfigurator.configureBrowser();
            webDriver = DriverConfigurator.getConfiguredDriver();
            initialized = true;
        }
    }

    public static void maximizeScreen(){
        WebDriverFactory.webDriver.manage().window().maximize();
    }
}
