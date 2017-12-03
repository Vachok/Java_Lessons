

public class Main {
    void useCar (Car car){
        car.driving();
        System.out.println(car.getNumOfSeat());
    }
    public static void main(String[] args){
        Main main = new Main();
        main.useCar(new Car());
    }
}