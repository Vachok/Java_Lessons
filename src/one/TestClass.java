package one;

public class TestClass {
    private int i = 5;
    protected int j = 6;
    int k = 7;
    public int m = 8;
    void method(){
        TestClass testClass = new TestClass();
        System.out.println(testClass.i);
}

class TestModifiers{
    void method(){
        TestClass testClass = new TestClass();
        System.out.println(testClass.i);
    }
}