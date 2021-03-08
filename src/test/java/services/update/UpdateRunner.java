package services.update;

import com.intuit.karate.junit5.Karate;

public class UpdateRunner {
	  @Karate.Test
	    Karate testUsers() {
	        return Karate.run("update").relativeTo(getClass());
	    }    


}