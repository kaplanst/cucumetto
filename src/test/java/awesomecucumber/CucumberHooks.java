package awesomecucumber;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BEFORE ALL");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("AFTER ALL");
    }

}
