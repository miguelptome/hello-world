package pt.courses.password;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPasswordSha {

    private final Logger logger = LoggerFactory.getLogger(TestPasswordSha.class);
    
    @Test
    void test() {
	
	logger.info("HELLO FROM TestPasswordSha");
	
	assertEquals("a", "a");
    }
    
}
