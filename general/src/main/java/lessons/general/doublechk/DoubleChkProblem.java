package lessons.general.doublechk;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * Проблема double check #685
 * <p>
 *
 * @since 18.12.2018 (15:52)
 */
public class DoubleChkProblem implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(DoubleChkProblem.class.getSimpleName());

    /**
     * @see SingleClass
     */
    private static void dcProb(){
        LOGGER.info("DoubleChkProblem.dcProb");
        SingleClass singleClass = SingleClass.getInstance();
        LOGGER.warning(singleClass.toString());
    }

    @Override
    public void launchMe() {
        linksPut("685-347", "https://youtu.be/5eTQKyK-rGs?t=419", true);
        dcProb();
    }
}
