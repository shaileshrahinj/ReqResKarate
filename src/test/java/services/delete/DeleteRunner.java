package services.delete;

import com.intuit.karate.junit5.Karate;

public class DeleteRunner {
	  @Karate.Test
	    Karate testUsers() {
	        return Karate.run("delete").relativeTo(getClass());
	    }    


}