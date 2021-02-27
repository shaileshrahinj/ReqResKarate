package services.ListOfResources;

import com.intuit.karate.junit5.Karate;

public class ResourceRunner {
	  @Karate.Test
	    Karate testUsers() {
	        return Karate.run("resources").relativeTo(getClass());
	    }    


}