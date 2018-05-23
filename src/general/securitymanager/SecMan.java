package general.securitymanager;



import java.security.Policy;



public class SecMan extends Policy {
   
   public static void main(String[] args) {
      
      System.setSecurityManager(new SecurityManager());
      System.out.println(System.getProperty("os.name"));
   }
}
/*
c:\Program Files\Java\jre-9.0.4\lib\security\
тут хранятся policy по-умолчанию.
Можно создавать свои policy.
c:\Users\ikudryashov.EATMEAT\.java.policy
Можно создавать policy в самом проекте.

policy состоит из
permission :файл, к которому применяем: :что даём: :сам пермишн:
*/
