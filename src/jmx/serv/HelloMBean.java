package jmx.serv;



public interface HelloMBean {
   
   void sayHello() throws Exception;
   int addIntegers(int a, int b);
   
   
   Person returnPerson();
   
   String getName();
   void setName(String s) throws Exception;
}
