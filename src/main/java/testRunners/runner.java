package testRunners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import util.DriverFactory;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"Stepdefinitions", "util"},
        tags = "test",
        plugin = {
                //summary toplam özet , pretty raporu renklendirme için kullanılır
                //raporun yeri ve türü secildi
                "summary","pretty","html:Reports/CucumberReport/Reports.html"
        }

)

// extend edilerek çalıştırılır AbstractTestngCucumberdan
public class runner extends AbstractTestNGCucumberTests {
        static AppiumDriver driver = DriverFactory.getDriver();
}
