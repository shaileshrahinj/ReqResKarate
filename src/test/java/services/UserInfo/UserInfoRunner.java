package services.UserInfo;
import com.intuit.karate.junit5.Karate;

public class UserInfoRunner {
	  @Karate.Test
	    Karate testUsers() {
	        return Karate.run("userInfo").relativeTo(getClass());
	    }    


}
