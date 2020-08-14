package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
/*Ruta donde estan los features*/  features = "src/test/java/features",
/*Donde se implementan los escenarios de prueba*/  glue={"seleniumgluecode"}
)


public class AllTestrunner {
}
