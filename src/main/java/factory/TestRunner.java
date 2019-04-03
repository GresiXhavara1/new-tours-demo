package factory;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        monochrome = true,
        glue = "steps/RegisterAndLogin",
        tags = {"@Test1"}
)
public class TestRunner{
}
