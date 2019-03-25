package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;

public class DriverConfigurator {
    public enum OS {
        WINDOWS, LINUX, MAC
    }

    private static OS currentOS = null;
    private static WebDriver driver;
    private static String path = "";


    public static WebDriver getConfiguredDriver() {
        return driver;
    }

    public static void configureBrowser() {
        String browser = System.getProperty("BROWSER");
        if (browser.equals("FIREFOX")) {
            firefoxConfigurator();
        } else if (browser.equals("EDGE")) {
            edgeConfigurator();
        } else if (browser.equals("INTERNET_EXPLORER")) {
            ieConfigurator();
        } else if (browser.equals("CHROME")) {
            chromeConfigurator();
        }
    }


    private static void firefoxConfigurator() {

        if (getOS().equals(OS.WINDOWS)) {
            path = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
        } else if (getOS().equals(OS.MAC)) {
            path = System.getProperty("FIREFOX_BINARY_PATH_MAC");
        } else if (getOS().equals(OS.LINUX)) {
            path = "/usr/local/bin/geckodriver";
        }
        System.setProperty("webdriver.gecko.driver", path);
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        driver = new FirefoxDriver();

    }

    private static void chromeConfigurator() {

        if (getOS().equals(OS.WINDOWS)) {
            path = "C:\\Users\\U173499\\Desktop\\Workspace\\chromedriver.exe";
        } else if (getOS().equals(OS.MAC)) {
            path = System.getProperty("FIREFOX_BINARY_PATH_MAC");
        } else if (getOS().equals(OS.LINUX)) {
            path = "/usr/local/bin/geckodriver";
        }
        System.setProperty("webdriver.chrome.driver", path);
         driver = new ChromeDriver();


    }

    private static void edgeConfigurator() {
        path = System.getProperty("EDGE_BINARY_PATH");
        System.setProperty("webdriver.edge.driver", Paths.get(path).toFile().getAbsolutePath());
        EdgeOptions options = new EdgeOptions();
        EdgeDriverService service = new EdgeDriverService.Builder().usingDriverExecutable(Paths.get(path).toFile())
                .usingAnyFreePort().build();
        driver = new EdgeDriver(service, options);
    }

    private static void ieConfigurator() {
        if (getOS().equals(OS.WINDOWS)) {
            path = System.getProperty("IEDRIVER_BINARY_PATH");
            System.setProperty("webdriver.ie.driver", Paths.get(path).toFile().getAbsolutePath());
            InternetExplorerDriverService service = new InternetExplorerDriverService.Builder().usingAnyFreePort()
                    .withLogLevel(InternetExplorerDriverLogLevel.ERROR).build();
            InternetExplorerOptions options = new InternetExplorerOptions();
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability("nativeEvents", false);
            capabilities.setCapability("ignoreProtectedModeSettings", true);
            capabilities.setCapability("ignoreZoomSetting", true);
            capabilities.setCapability("requireWindowFocus", true);
            options.merge(capabilities);
            driver = new InternetExplorerDriver(service, options);
        } else {
            System.out.println("Internet Explorer doesn't run in this OS");
        }
    }

    public static OS getOS() {

        if (currentOS == null) {
            String system = System.getProperty("os.name").toLowerCase();
            if (system.contains("win")) {
                currentOS = OS.WINDOWS;
            } else if (system.contains("nix") || system.contains("nux") || system.contains("aix")) {
                currentOS = OS.LINUX;
            } else if (system.contains("mac")) {
                currentOS = OS.MAC;
            }
        }
        return currentOS;
    }
}
