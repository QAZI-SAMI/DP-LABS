/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logger;

public class Main {
	
   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
      AbstractLogger databaseLogger = new DatabaseLogger (AbstractLogger.WARNING);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(databaseLogger);
      databaseLogger.setNextLogger(consoleLogger);

      return errorLogger;	
   }
   private static AbstractLogger getChainOfLoggers2(){

      AbstractLogger errorLogger2 = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger consoleLogger2 = new FileLogger(AbstractLogger.INFO);
      AbstractLogger databaseLogger2 = new DatabaseLogger (AbstractLogger.WARNING); 

      errorLogger2.setNextLogger(consoleLogger2);
      consoleLogger2.setNextLogger(databaseLogger2);


      return errorLogger2;	
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();
      AbstractLogger loggerChain2 = getChainOfLoggers2();

      loggerChain.logMessage(AbstractLogger.INFO, 
         "This is an information.");

      loggerChain.logMessage(AbstractLogger.DEBUG, 
         "This is an debug level information.");

      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
      loggerChain.logMessage(AbstractLogger.WARNING,
         "This is an Warning Message.");
      


      loggerChain2.logOnceMessage(AbstractLogger.INFO, 
         "This is an Information.");
      loggerChain2.logOnceMessage(AbstractLogger.ERROR, 
         "This is an error information.");
      loggerChain2.logOnceMessage(AbstractLogger.WARNING,
         "This is an Warning Message.");
      loggerChain2.logOnceMessage(AbstractLogger.DEBUG, 
         "This is an debug level information.");
      
      
   }
}
