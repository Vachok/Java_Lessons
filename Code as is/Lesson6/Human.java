package Lesson6;

/** Условный человек
 *
 */
class Human { //строка
    int age = 33;
    public static void main(String[] args) {
        Human vachok = new Human();
        System.out.println(vachok.getAge(5, 0.2, true, vachok));
    }

/*
        double getAge(int i, double d, boolean bool, Human vachok) {
блок
        return vachok.getAge(i, d, bool, vachok);
        }
*/
}
