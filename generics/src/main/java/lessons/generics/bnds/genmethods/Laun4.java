package lessons.generics.bnds.genmethods;


import lessons.generics.StartMe;
import lessons.generics.whatis.GenericsLesson;
import lessons.generics.whatis.Lessons;

import java.util.ArrayList;
import java.util.List;


/**
 * <a href="https://youtu.be/5et8IyafnWE?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Bounds</a>
 <p>
 Основная продлема generic-объектов, то, что они слишком "общие."
 Но можно их чему-нибудь научить.
 {@link Job}
 * {@link #firstMeth()}
 * @since 18.07.2018 (14:51)
 */
public class Laun4 implements Lessons {
    public List<String> links = new ArrayList<>();
    @Override
    public void launchMe() {
        GenericsLesson g = new StartMe();
        links.add("Generic Bounds >>>>>>>>>>>>>>\n");
        links.add(this.getClass().getTypeName());
        links.add("https://www.youtube.com/watch?v=5et8IyafnWE&feature=youtu.be&list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX");
        firstMeth();
        g.progressSaver(links, true);
        System.out.println("links = " + links);
    }
    public void showMe(String addToLinks){
        System.out.println(addToLinks);
        links.add(addToLinks);
        System.out.println("links.size: "+ links.size());
    }
    /**
     * Запуск
     * @see Job
     * @see Cell
     */
    private void firstMeth() {
        Cell<Job> cell = new Cell<>();
        cell.setT(new Job());
        cell.doJob();
        childJob();
    }

    /**
     * Можно наследовать, и использовать методы родителя!
     * @see Job
     * @see ChildJob
     */
    private void childJob(){
        Cell<ChildJob> cell = new Cell<>();
        cell.setT(new ChildJob());
        cell.doJob();
        showMe(this.getClass().toGenericString());
    }
}
