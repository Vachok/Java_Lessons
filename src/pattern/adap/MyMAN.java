package pattern.adap;

/**
 Грузовик.
 <p>
 Грузовик MAN, который тоже нужно вымыть

 @see Car1
 @see Truck
 @see CarWash
 @since 28.04.2018 */
class MyMAN implements Truck {

    public static MyMAN myMAN;

    /**
     Этим методом будем мыть MAN!

     @see AdapterMain#main(String[])
     */
    @Override
    public void cleanMe() {
        System.out.println("MAN чист." + true);
    }
}
