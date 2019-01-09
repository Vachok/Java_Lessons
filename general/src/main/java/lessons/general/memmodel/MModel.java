package lessons.general.memmodel;

import lessons.general.Lessons;

/**
 * Память в java
 * @since 28.12.2018 (16:24)
 */
public class MModel implements Lessons {
    @Override
    public void launchMe() {
        linksPut("687-349", "https://youtu.be/SNZeMmInVmA", true);
        runMe();
    }

    private void runMe() {
        MemoryStack.main(null);
    }
}
