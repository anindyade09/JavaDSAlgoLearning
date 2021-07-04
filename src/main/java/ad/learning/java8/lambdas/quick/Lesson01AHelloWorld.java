package ad.learning.java8.lambdas.quick;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lesson01AHelloWorld {
	private static final Logger logger = Logger.getLogger(Lesson01AHelloWorld.class.getName());
	private static final String MESSAGE = "Hello World!";

	public static void main(String[] args) {
		logMessageClassicalApproach(MESSAGE);

		logMessageWithWorkDoneOnMessageClassicalApproach(MESSAGE);

		logMessageWithWorkDoneOnMessageByDefiningStandardProcess(process(MESSAGE));

		// User defined behaviour eg.1 To Upper case the message
		logMessageWithWorkDoneOnMessageByUserDefinedProcess(processAsPerUser(MESSAGE, new MessageProcessor() {
			// User defined function / behavior to be done on the message
			public String processMessageAsPerUser(String message) {
				logger.log(Level.INFO, "User defined function to UPPER the string...");
				return message.toUpperCase();
			}
		}));

		// User defined behaviour eg.2 To Lower case the message
		logMessageWithWorkDoneOnMessageByUserDefinedProcess(processAsPerUser(MESSAGE, new MessageProcessor() {
			// User defined function / behavior to be done on the message
			public String processMessageAsPerUser(String message) {
				logger.log(Level.INFO, "User defined function to Lower the string...");
				return message.toLowerCase();
			}
		}));
	}

	/**
	 * Logs the message passed in as it is.
	 * 
	 * @param message Message to be logged.
	 */
	private static void logMessageClassicalApproach(String message) {
		logger.log(Level.INFO, message);
	}

	private static void logMessageWithWorkDoneOnMessageClassicalApproach(String message) {
		logger.log(Level.INFO, message.toUpperCase());
	}

	private static String process(String message) {
		return message.toUpperCase();
	}

	private static void logMessageWithWorkDoneOnMessageByDefiningStandardProcess(String processedMessage) {
		logger.log(Level.INFO, processedMessage);
	}

	// Using User Defined function to process the message using In-Line Interface
	// implementation
	private static String processAsPerUser(String message, MessageProcessor messageProcessor) {
		return messageProcessor.processMessageAsPerUser(message);
	}

	private static void logMessageWithWorkDoneOnMessageByUserDefinedProcess(
			String processedMessageByUserDefinedFunction) {
		logger.log(Level.INFO, processedMessageByUserDefinedFunction);

	}

}

interface MessageProcessor {
	String processMessageAsPerUser(String message);
}