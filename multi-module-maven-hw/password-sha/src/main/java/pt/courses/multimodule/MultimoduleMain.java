package pt.courses.multimodule;

import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultimoduleMain {

    private static final Logger LOG = LoggerFactory.getLogger(MultimoduleMain.class);
    
    public static void main(String[] args) {
	
	IntStream.rangeClosed(1, 10).forEach(counter -> {
	    LOG.info("Counter:{}", counter);
	});
	
    }   
}
