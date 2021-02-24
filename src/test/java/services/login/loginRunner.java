package services.login;

import com.intuit.karate.junit5.Karate;

	public class loginRunner {
		  @Karate.Test
		    Karate testUsers() {
		        return Karate.run("register").relativeTo(getClass());
		    }    


	}
