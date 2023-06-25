package awesomecucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions (plugin = {"pretty", "html:target/cucumber.html"})
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
