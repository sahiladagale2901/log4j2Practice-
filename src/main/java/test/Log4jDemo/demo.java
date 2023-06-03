package test.Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class demo {
	// private static Logger log = LogManager.getLogger(demo.class);

	public static void main(String[] args) {

		Logger logger = LogManager.getLogger(demo.class);
		System.out.println("hello");
		
		logger.info("Info Message Logged !!!");

	}

}
