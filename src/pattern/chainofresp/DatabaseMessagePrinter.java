package pattern.chainofresp;

/**
 @since 03.05.2018 (16:03) */
class DatabaseMessagePrinter extends MessagePrinter {

    @Override
    void printMessage(String message) {
        System.out.println("print to database: " + message);
    }
}
