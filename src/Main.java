

public class Main {

    public static void main( String[] args ) {
    }
}



class ResourceA {

    ResourceB resourceB;


    public synchronized int getI() {
        return resourceB.returnI();
    }


    public synchronized int returnI() {
        return 1;
    }
}



class ResourceB {

    ResourceA resourceA;


    public synchronized int getI() {
        return resourceA.returnI();
    }


    public synchronized int returnI() {
        return 1;
    }
}