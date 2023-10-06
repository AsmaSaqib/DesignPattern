/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain.of.responsibility;

/**
 *
 * @author sp20-bse-072
 */
public class ChainOfResponsibilityDemo {

//   private static AbstractLogger getChainOfLoggers(){
//
//      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
//      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
//      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
//
//      errorLogger.setNextLogger(fileLogger);
//      fileLogger.setNextLogger(consoleLogger);
//
//      return errorLogger;	
//   }
   private static AbstractLogger getSecondChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger databaselogger = new DatabaseLogger(AbstractLogger.WARNING);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(databaselogger);
      databaselogger.setNextLogger(consoleLogger);

      return errorLogger;	
   }

   public static void main(String[] args) {
//      AbstractLogger loggerChain = getChainOfLoggers();
//
//      loggerChain.logMessage(AbstractLogger.INFO, 
//         "This is an information.");
//
//      loggerChain.logMessage(AbstractLogger.DEBUG, 
//         "This is an debug level information.");
//
//      loggerChain.logMessage(AbstractLogger.ERROR, 
//         "This is an error information.");
    AbstractLogger loggerChain = getSecondChainOfLoggers();
    loggerChain.logOnceMessage(AbstractLogger.INFO, "This is an Information");
     loggerChain.logOnceMessage(AbstractLogger.DEBUG, "This is an debug level information.");
      loggerChain.logOnceMessage(AbstractLogger.ERROR, "This is an error information");
      loggerChain.logOnceMessage(5, "This is an unknow information");
  }
 
    
}
