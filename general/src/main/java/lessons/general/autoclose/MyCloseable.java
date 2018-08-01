package lessons.general.autoclose;

class MyCloseable implements AutoCloseable{
    MyCloseable()throws Exception{
        System.out.println("MyCloseable.instance initializer");
    }
    @Override
    public void close() throws Exception {
        System.out.println("MyCloseable.close");
    }
    void doIt() throws Exception{
        System.out.println("MyCloseable.doIt");
    }
}
