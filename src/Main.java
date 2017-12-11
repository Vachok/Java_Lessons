

public class Main {
    public static void main( String[] args ) throws Exception {
        MyObject myObject = new MyObject();
        myObject.i = 1;
        NewObject newObject = new NewObject();
        newObject.j = 3;
        myObject.newObject = newObject;
        MyObject myObject1 = myObject.clone();
        myObject1.i = 2;
        System.out.println(myObject.i);
        myObject1.newObject.j = 4;
        System.out.print(myObject.newObject.j);
    }
}



class MyObject implements Cloneable {
    int i;

    NewObject newObject;
    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}



class NewObject {

    int j;
}