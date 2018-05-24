package pattern.templ;

/**
 * Класс реализует шаблон {@link Templatea}
 */
class JobClass extends Templatea {

    @Override
    void stepOne() {
        System.out.println(" step1 ");
    }

    @Override
    void stepTwo() {
        System.out.println(" step2 ");
    }

    @Override
    void stepThree() {
        System.out.println(" step3 ");
    }
}