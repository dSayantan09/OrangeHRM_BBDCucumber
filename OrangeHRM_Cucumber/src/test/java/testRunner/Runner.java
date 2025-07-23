package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/hrmtestreport.html","rerun:target/rerun.text"},features = "src/main/java/Feature",glue = {"testRunner"},dryRun = false, monochrome = true)
public class Runner {

}
