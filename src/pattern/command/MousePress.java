package pattern.command;

/**
 Действие

 @see Command
 @see ComMain
 @see Receiver */
class MousePress implements Command {
    @Override
    public void exeCute() {
        System.out.println("click-press");
    }

    @Override
    public void reveRt() {
        System.out.println("23");
    }
}
