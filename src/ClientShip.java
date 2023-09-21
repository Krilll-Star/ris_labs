import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientShip {

    public static final String UNIQUE_HOST_NAME = "server.ship";
    public static final int PORT = 1551;

    public static void main(String[] args) throws RemoteException, NotBoundException {

        final Registry registry = LocateRegistry.getRegistry(PORT);

        ShipBase ship = (ShipBase) registry.lookup(UNIQUE_HOST_NAME);
        ship.display();
    }
}
