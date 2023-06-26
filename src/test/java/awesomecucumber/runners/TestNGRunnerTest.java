package awesomecucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions (
        plugin = {"pretty", "html:target/cucumber.html", "summary"},
        snippets = CAMELCASE,
        tags = "@scenario1 or @scenario2",
        glue = {"awesomecucumber.stepdef" , "awesomecucumber.hooks"},
        features = "src/test/resources/awesomecucumber"
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void beforeClass(){
        System.out.println("\n BEFORE CLASS \n");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\n AFTER CLASS \n");
    }

}
