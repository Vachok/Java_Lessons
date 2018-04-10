package general.rmip;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();
        context.bind("rmi://127.0.0.1:1099/imath", new IMathImpl()); // создание RMI-сервера, на порту 1099 , куда мы повесим класс IMath
//        context.rebind("rmi:imath", new IMathImpl());
//        Naming.bind("imath", new IMathImpl());
    }
}

// https://goo.gl/ESJJHe

class IMathImpl extends UnicastRemoteObject implements IMath {
    protected IMathImpl() throws RemoteException {
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}