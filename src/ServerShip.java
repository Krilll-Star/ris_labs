import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerShip {

    public static final String UNIQUE_HOST_NAME = "server.ship";
    public static final int PORT = 1551;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {

        Berth berth = new Berth("Каюта", 25);
        LivingBerth liv_berth = new LivingBerth("Жилая каюта", 30, 50);
        StorageBerth storage = new StorageBerth("Трюм", 20, "провизия");
        Berth cap_berth = new Berth("Каюта капитана", 15);

        //создание корабля
        Berth[] berths = {berth, liv_berth, storage, cap_berth};
        Ship ship = new Ship("Морриган", "Фрегат", berths);

        final Registry registry = LocateRegistry.createRegistry(PORT);

        Remote stub = UnicastRemoteObject.exportObject(ship, 0);
        registry.bind(UNIQUE_HOST_NAME, stub);

        Thread.sleep(Integer.MAX_VALUE);
    }
}
