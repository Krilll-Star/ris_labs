import java.io.Serializable;

public class Ship implements Serializable {

    private String name;
    private String type;
    private Berth[] composition;

    public Ship(String name, String type, Berth[] composition) {
        this.name = name;
        this.type = type;
        this.composition = composition;
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

    public void display() {
        System.out.printf("%s \"%s\" \n", getType(), getName());
        System.out.printf("Состав:\n");
        for (int i = 0; i < getComposition().length; i++) {
            System.out.println(getComposition()[i].getType());
        }
    }
}
