package esempio_log4j;

import org.apache.logging.log4j.*;

public class Main {

	private static Logger log4jlogger = LogManager.getLogger(Main.class.getName());

	public static void main(String[] args) {
		
		System.out.println("Demo Log4j");
		log4jlogger.info("Log4j Info");
		log4jlogger.debug("Log4j Debug");
		log4jlogger.warn("Log4j Warning");	
		log4jlogger.error("Log4j Error");
		log4jlogger.fatal("Log4j Fatal");


	}

}