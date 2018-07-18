package lessons.generics.bnds.genmethods;

/**Научим GENERIC работать.
 * {@link Cell}. Заэкстендим Generic этим классом.
 * Класс может иметь "наследника(ов)"
 * @since 18.07.2018 (14:52)
 */
public class Job{
    /**
     * Like NiKE )
     */
    public void doIt(){
        System.out.println("Job.doIt");
    }
}
class ChildJob extends Job{
}
