package pt.courses.password;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPasswordMd5 {

    private final Logger logger = LoggerFactory.getLogger(TestPasswordMd5.class);
    
    @Test
    void test() {
	
	logger.info("HELLO FROM TestPasswordMd5");
	
	assertEquals("a", "a");
    }
    
}
