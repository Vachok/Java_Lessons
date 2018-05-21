package pattern.command;

/**
 <b>Основной класс</b>
 <p>
 Есть какая-то команда. {@link Command} и её имплементация {@link MouseClick}

 @since 03.05.2018 (16:58) */
public class ComMain {
    /**
     Выполним команду.
     <p>
     Так делать не нужно:
     <code>public static void main(String[] args) {
     command command = new MouseClick();
     command.exeCute();
     }</code>.
     У команды должен быть ресивер. {@link Receiver}

     @param args null

     @see Command
     */
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        receiver.runCommand();

        receiver.addCommands(new MousePress());
        receiver.addCommands(new MouseClick());
        receiver.runCommands();
    }
}

