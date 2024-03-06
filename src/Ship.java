import java.io.Serializable;
import java.rmi.RemoteException;

public class Ship implements ShipBase, Serializable {

    private String name;
    private String type;
    private Berth[] composition;

    public Ship(String name, String type, Berth[] composition) {
        this.name = name;
        this.type = type;
        this.composition = composition;
    }

    public Ship() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Berth[] getComposition() {
        return composition;
    }

    @Override
    public void display() throws RemoteException {
        System.out.printf("%s \"%s\" \n", getType(), getName());
        System.out.printf("Состав:\n");
        for (int i = 0; i < getComposition().length; i++) {
            System.out.println(getComposition()[i].getType());
        }
    }
}
