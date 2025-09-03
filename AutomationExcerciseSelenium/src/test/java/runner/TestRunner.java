package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

    

    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/resources/features", // Directorio de nuestros archivos .feature
                     glue = "steps", // Paquete donde están los steps
                     plugin = {"pretty", "html:target/cucumber-reports.html"},
                     tags = "@login" // Etiquetas para filtrar qué pruebas ejecutar
                     )

                     
public class TestRunner {
@AfterClass
public static void cleanDriver() {
    // Cierra el navegador después de ejecutar todas las pruebas
        BasePage.closeBrowser();
        }
}
