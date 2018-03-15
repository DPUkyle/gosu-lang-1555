package path.to.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/helloworld.feature", glue = "classpath:path/to/glue")
public class RunCukesTest {

}
