

public class Main {
    public static void main( String[] args ) {
        MyObject myObject = new MyObject();
        myObject.i = 1;
        MyObject myObject1 = myObject;
        myObject.i = 2;
        System.out.println(myObject.i);
    }
}



class MyObject {
    int i;
}