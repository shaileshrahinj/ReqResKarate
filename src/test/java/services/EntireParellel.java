package services;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.*;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import com.intuit.karate.KarateOptions;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
//import com.intuit.karate.junit5.Karate;
//import com.intuit.karate.junit5.Karate.Test;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@KarateOptions(tags = { "~@ignore" }) 
public class EntireParellel {

	 @Test
	    public void testParallel() {
	      //  System.setProperty("karate.env", "dev"); // ensure reset if other tests (e.g. mock) had set env in CI
	        Results results = Runner.path("classpath:demo").tags("~@ignore").parallel(5);
	        generateReport(results.getReportDir());
	        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);        
	    }
	    
	    public static void generateReport(String karateOutputPath) {        
	        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[] {"json"}, true);
	        List<String> jsonPaths = new ArrayList(jsonFiles.size());
	        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
	        Configuration config = new Configuration(new File("target"), "demo");
	        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
	        reportBuilder.generateReports();        
	    }
	    
}
