package jmx.serv;



public interface HelloMBean {
   
   void sayHello();
   int addIntegers(int a, int b);
   
   
   Person returnPerson();
   
   String getName();
   void setName();
}
