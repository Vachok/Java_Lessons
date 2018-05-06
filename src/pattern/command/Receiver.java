package pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 Зачем?
 Мы инкапсулируем всю информацию о комнде, в отдельный класс.
 Потому что имплементаций может быть много.

 @see MouseClick
 @see MousePress
 @since 03.05.2018 (17:09) */
class Receiver {
    /**
     Можно создать целый лист команд.

     @see ComMain#main(String[])
     */
    List<Command> commands = new ArrayList<>();
    /**
     Одна команда.

     @see #commands
     */
    Command command = new MouseClick();

    /**
     Добавим команд
     @param command {@link Command}
     */
    void addCommands(Command command) {
        commands.add(command);
    }

    /**
     Запустить одну команду.
     */
    void runCommand() {
        command.exeCute();
    }

    /**
     Или лист команд.
     <p>
     Суть ресивера, что независимо от того откуда и сколько раз нам надо выполнить команду,
     у нас есть единый обработчик. И у него есть настроенные методы.
     */
    void runCommands() {
        try {
            for (Command com : commands) {
                com.exeCute();
            }
        } catch (Exception e) {
            for (Command command : commands) {
                command.reveRt();
            }
        }
    }
}
