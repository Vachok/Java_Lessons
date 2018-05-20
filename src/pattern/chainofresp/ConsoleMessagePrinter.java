package pattern.chainofresp;

/**
 @since 03.05.2018 (16:02) */
class ConsoleMessagePrinter extends MessagePrinter {

    @Override
    void printMessage(String message) {
        System.out.println("print to cons: " + message);
    }
}
