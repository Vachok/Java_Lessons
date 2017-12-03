//abstract final strictfp class ExampleClass { //private protected нельзя. публичный класс должен иметь имя файла.
}

/*
strictfp class ExampleClass {
    void method(float f){
      f = 0.33f;
    }
}*/

 public abstract class ExampleClass {
     void method(){
         Car car = new Ferrari();
         car.Run();
         car.Stop();
     }

}

abstract class Car{
     int speed;
     abstract void Run(); // нельзя писать тело класса
     void Stop(){
         speed =0;
     }

}

class Ferrari extends Car {
     @Override
    void Run() {
         speed =25;
    }
}
abstract class Ball extends ExampleClass {

}

 class MyFinalClass{
     void someLogic(){

     }
}
abstract final class ExtendsFinalClass extends MyFinalClass{ //так нельзя

}
