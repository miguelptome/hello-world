package password;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPassword {

    private static final Logger LOG = LoggerFactory.getLogger(TestPassword.class);
    
    @Test
    void test() {
	LOG.info("MIG123");
	assertEquals("a", "a");
    }
    
}
