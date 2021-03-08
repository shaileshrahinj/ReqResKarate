package services.Create;

import com.intuit.karate.junit5.Karate;

public class CreateRunner {
	  @Karate.Test
	    Karate testUsers() {
	        return Karate.run("create").relativeTo(getClass());
	    }    


}