public class Example {
    private int speed;
    void addI(long l, int...a) {
        speed = speed + 10;
    }
    static boolean method() {
        return false;
    }
}

class OtherExample extends Example {
    public static void main(String[] args) {
        System.out.println(Example.method());
    }
}


/*    static int i = 5;
    static void method(int i, float f, boolean b, Object o, String s, int... j) {//должен быть последним и только один) {
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(o);
        System.out.println(s);
        for(int k : j) {
            System.out.println(k);
        }
    }*/
/* Метод, который нельзя переопределить
    final void method() {

    }*/
// static |final abstract strictfp  synchronized void method(){ /all mods
// native |@Deprecated
// strictfp |точность не менее скольких символов
// synchronized |многопоточность
// abstract |не может быть final и не может быть static abstract void method();