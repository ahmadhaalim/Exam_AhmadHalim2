package demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"html:build/result"},
        stepNotifications = true,
        tags = {"@Web"}
        // Untuk menjalankan lebih dari satu bisa menggunakan or, apabila ingin menjalankan feature atau before after
        // yang memiliki tags "android dan web" maka gunakan tags "@Android and @Web", before after berlaku untuk semua
        // apabila tidak ditentukan sedangkan fitur tagnya spesifik sesuai yang ditentukan di cucumberoptions.
)
public class CucumberRunner {
}
