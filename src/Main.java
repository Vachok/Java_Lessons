

public class Main {
    public static void main( String[] args ) {
        MyObject myObject = new MyObject(); // СОЗДАЁТСЯ объект (1 шт)
        myObject.i = 1;
        MyObject myObject1 = myObject; // получились 2 ссылки на 1 объект
        myObject.i = 2;
        System.out.println(myObject.i);
    }
}



class MyObject {
    int i;
    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}