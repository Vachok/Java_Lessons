package lessons.generics.extend;


import lessons.generics.StartMe;
import lessons.generics.whatis.GenericsLesson;
import lessons.generics.whatis.Lessons;

import java.util.ArrayList;
import java.util.List;


/**
 * <b>Начало</b>
 * @since 18.07.2018 (12:24)
 *{@link #launchMe()}
@see ParrentClass
 @see GenFace
 */
public class LauncherLTwo implements Lessons {
private static List<String> links = new ArrayList<>();
    /**
     * Наследование Generics.
     * {@link #goLaunch()}
     */
    @Override
    public void launchMe() {
        GenericsLesson saver = new StartMe();
        links.add("Lesson 2. "+this.getClass().getTypeName());
        saver.progressSaver(links, true);
        goLaunch();
    }

    /**{@link #launchMe()}
     * Возможные варианты создания.
     */
    private void goLaunch() {
        ParrentClass parrentClass = new GenParrent<>();
        ParrentClass parrentClass2 = new GenParrent<String>();
        ParrentClass parrentClass3 = new GenParrent();
        GenParrent<String> parrentClass4 = new Child3<String>();
        System.out.print(parrentClass.getClass().getTypeName());
        links.add("Generics 2. Наследование.");
    }
}

/**{@link LauncherLTwo}
 Можно создать Generic на базе класса
 * @since 18.07.2018 (12:31)
 @see GenParrent
 */
class ParrentClass{
}

/**Generic {@link ParrentClass}
 @since 18.07.2018 (12:33)
 @param <T> {@link ParrentClass} */
class GenParrent <T> extends ParrentClass{}

/**{@link ParrentClass}
 * @since 18.07.2018 (12:34)
 * {@link Child2}
 */
class Child extends GenParrent{}

/**{@link Child}
 * @since 18.07.2018 (12:34)
 * @deprecated {@link Child3}
 */
@Deprecated
class Child2 extends GenParrent/*<T = нельзя так>*/{}


/**Profit! {@link Child2}
 * @since 18.07.2018 (12:35)

 */
class Child3<S> extends GenParrent<String>{}

/**Profit! {@link Child2}
 Должно быть соответсвие типов.
 {@link Child4}
 @since 18.07.2018 (12:38)
 @param <T>  */
class Child3v1<T> extends GenParrent<T>{}

/** {@link Child2}
 Возможно и так.
 {@link Child5}
 @param <X> --
 @param <Y> --
 @param <T>  главное соответсвие минимум одного параметра.
 */
class Child4<X,Y,T> extends GenParrent<T>{}

/** Можно
 {@link Child2}
 @param <X>
 @param <Y>
 @param <T>  */
class Child5<X,Y,T> extends GenParrent{}

/**{@link Child2}
 @param <X>
 @param <Y>
 @param <T>  */
class Child6<X,Y,T> extends Child5<X,Y,T>{}

/** {@link Child2}
 @param <X>
 @param <Y>
 @param <T>  */
class Child7<X,Y,T> extends Child5<Integer,Y,String>{}
