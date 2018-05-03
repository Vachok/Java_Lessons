package pattern.chainofresp;

/**
 @see MessagePrinter
 @since 03.05.2018 (16:03) */
class FileMessagePrinter extends MessagePrinter {

    @Override
    void printMessage(String message) {
        System.out.println("print to file: " + message);
    }
}
