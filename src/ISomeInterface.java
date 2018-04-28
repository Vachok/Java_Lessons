interface ISomeInterface extends IOtherInterface { //используется для описания поведения
    /*public static final не учитывается*/ int SOME_VARIABLE = 5; //константа
    int i=5;

/* одно и тоже в интерфейсе    public int i = 5;
    static int i = 5;
    final int i = 5;
    final public int i = 5;
    void addTwoDigits(int one, int two);*/


    void method(){ //в интерфейсе нет метода "с телом"

    }
*/
}
interface IOtherInterface{
    void someMethod
}

interface Bounceble {
    void bounce();
}

class Example implements ISomeInterface, Bounceble {
    public void addTwoDigits(int one, int two){
        SOME_VARIABLE = 5;
    }
    public void someMethod(){

    }
    public void bounce() {

    }
}