package general.rmip;

import javax.naming.*;
import java.rmi.RemoteException;
import java.util.Enumeration;

public class Client {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();

        Enumeration<NameClassPair> e = context.list("rmi://127.0.0.1:1099");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement().getName()); // вывод списка приложений на хосте
        }
        IMath iMath = (IMath) context.lookup("rmi://127.0.0.1/imath");
        int result = iMath.add(2, 3);
        System.out.println(result);
    }
}
