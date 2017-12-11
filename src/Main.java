

public class Main {
    public static void main( String[] args ) throws Exception {
        MyObject myObject = new MyObject();
        myObject.i = 1;
        MyObject myObject1 = myObject.clone();
        myObject1.i = 2;
        System.out.println(myObject.i);
    }
}



class MyObject implements Cloneable {
    int i;
    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}