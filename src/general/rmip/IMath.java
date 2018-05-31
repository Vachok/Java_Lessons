package general.rmip;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface IMath extends Remote {
    int add(int a, int b) throws RemoteException;
}
