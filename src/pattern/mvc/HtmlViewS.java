package pattern.mvc;

/**
 * Класс будет печатать в HTML инфо.
 *
 * @author IKudryashov
 * @since 21.05.2018 (17:08)
 */
class HtmlViewS implements ViewVachok {
    /**
     * Код вывода в HTML
     *
     * @param student {@link Student}
     * @see Controllerm
     */
    @Override
    public void showStudent(Student student) {
        System.out.println("<<student>> = " + student.getName());
        System.out.println(">>>>student.getAge()> = " + student.getAge());
    }
}
