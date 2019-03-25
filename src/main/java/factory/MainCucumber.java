package factory;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCucumber {
    public static void main(String[] args) throws Throwable {
        List<String> optionArguments = new ArrayList<>();
        optionArguments.add("-g");
        optionArguments.add("steps");
        optionArguments.add("-p");
        optionArguments.add("html:test-output/cucumber-html-report");
        optionArguments.add("-p");
        optionArguments.add("json:test-output/cucumber.json");
        optionArguments.add("src/main/resources/features");

        optionArguments.addAll(Arrays.asList(args));


        String headless = optionArguments.stream().filter(test -> test.equals("--headless")).findFirst().orElse(null);
        if (headless != null) {
            WebDriverFactory.headless = optionArguments.remove(headless);
        }

        String tags = System.getProperty("CUCUMBERTAGS");
        if (!tags.isEmpty() && !"ALL".equalsIgnoreCase(tags)) {
            String[] tagsSplitted = tags.split(",");
            for (String tag : tagsSplitted) {
                optionArguments.add("--tags");
                optionArguments.add(tag);
            }
        }

        WebDriverFactory.setup();
        WebDriverFactory.maximizeScreen();

        byte exit = cucumber.api.cli.Main.run(optionArguments.toArray(new String[optionArguments.size()]),
                Thread.currentThread().getContextClassLoader());
        WebDriverFactory.getInstance().getDriver().quit();
        if (0 != exit) {
            System.exit(1);
        }

    }
}
