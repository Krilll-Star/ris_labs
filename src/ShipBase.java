import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ShipBase extends Remote {
    void display() throws RemoteException;
}
