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
     */
    void runCommands() {
        for (Command com : commands) {
            com.exeCute();
        }
    }
}
