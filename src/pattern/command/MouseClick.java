package pattern.command;

/**
 Действие

 @see Command
 @see ComMain */
class MouseClick implements Command {
    @Override
    public void exeCute() {
        System.out.println("click-click");
    }

    @Override
    public void reveRt() {
        System.out.println("revert");
    }
}

