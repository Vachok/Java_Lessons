package pattern.chainofresp;

/**
 Создадим цепь.
 <p>
 Это несколько объектов, которые содежат ссылки друг на друга.
 И при запуске {@link #print(String)}, они будут вызывать
 {@link #printMessage(String)}, который будет печатать <code>{@link String} message</code>.
 Проверка - если <code>message</code>, не пустой, будет вызываться следующий.

 @see ChainMain
 @since 03.05.2018 (15:36) */
abstract class MessagePrinter {
    MessagePrinter nextMessagePrinter;

    void setNextMessagePrinter(MessagePrinter messagePrinter) {
        nextMessagePrinter = messagePrinter;
    }

    void print(String message) {
        printMessage(message);
        if (nextMessagePrinter != null) {
            nextMessagePrinter.print(message);
        }
    }

    abstract void printMessage(String message);
}
