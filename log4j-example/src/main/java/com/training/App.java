package com.training;
import java.util.*;

import org.apache.logging.log4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger =
			                    LogManager.getRootLogger();
	
    public static void main( String[] args )
    
    {

    	
    	logger.trace("Trace Message -1");
    	
    	logger.debug("DEBUG Message --2");

    	logger.info("INFO Message ---3");

    	logger.warn("Warning Message ----4");
 
    	   
    	 
    	logger.error("ERROR Message -----5");
    	
    	logger.fatal("FATAL ERROR  Message ------6");
    	   
    	
    	
    	
//        logger.info( "Hello World!" );
//        
//        System.out.println("Enter  a number from 0 to 100 ");
//        Scanner scanner = new Scanner(System.in);
//         int number = scanner.nextInt();
//        		 logger.info("You inserted the number:"+number);
//       if(number > 100) {
//    	   logger.error("You entered a wrong number!");
//           throw new RuntimeException("Wrong Number");
//       } else {
//    	   logger.debug("Number is smaller than 100, -correct!");
//       }

    }
}
