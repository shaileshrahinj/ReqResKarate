package services;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; class Parallel {
    //to dramatically cut down execution time
    @Test
    void testParallel() {
        Results results = Runner.path("classpath:services").tags("~@ignore").parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}