package pt.courses.password;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPassword {

    private final Logger logger = LoggerFactory.getLogger(TestPassword.class);
    
    @Test
    void test() {
	
	logger.info("HELLO FROM TestPassword");
	
	assertEquals("a", "a");
    }
    
}
