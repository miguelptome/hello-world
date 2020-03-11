package pt.courses.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestWeb {

    private final Logger logger = LoggerFactory.getLogger(TestWeb.class);
    
    @Test
    void test() {
	
	logger.info("HELLO FROM TestWeb");
	
	assertEquals("a", "a");
    }
    
}
