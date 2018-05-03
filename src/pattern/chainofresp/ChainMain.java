package pattern.chainofresp;

/**
 <b>Основной класс</b>
 <p>
 Цепочка "ответственности".
 Когда код проходит через несколько итераций. Как пример, кнопки
 <code>OK, Cancel</code> на формах. При нажатии запускается цепь ,
 которая в итоге ведёт к чему-либо.

 @since 03.05.2018 (15:15) */
public class ChainMain {
    /**
     Запускаем цепь событий.

     @param args null

     @see MessagePrinter#print(String)
     @see ConsoleMessagePrinter ->
     @see FileMessagePrinter ->
     @see DatabaseMessagePrinter .
     */
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new ConsoleMessagePrinter();
        FileMessagePrinter fileMessagePrinter = new FileMessagePrinter();
        messagePrinter.setNextMessagePrinter(fileMessagePrinter);
        fileMessagePrinter.setNextMessagePrinter(new DatabaseMessagePrinter());
        messagePrinter.print("tttt");
    }
}

