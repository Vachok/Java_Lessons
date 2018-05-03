package pattern.proxer;

/**
 Proxy-class для {@link Reno}.
 <p>

 @see ProxMain */
class CarProxy implements CarP {
    /**
     Создадим экземпляр машинки.
     */
    CarP car = new Reno();

    /**
     Метод будет перехватывать оригинальный {@link CarP#drive()}.
     */
    @Override
    public void drive() {
        System.out.println("proxy");
        car.drive();
    }
}
