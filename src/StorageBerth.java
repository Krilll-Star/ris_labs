import java.io.Serializable;

class StorageBerth extends Berth implements Serializable {

    private String cargo;

    public StorageBerth(String type, int square, String cargo) {
        super(type, square);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void display(){
        System.out.printf("%s, %s, %d m^2 \n", getType(), getCargo(), getSquare());
    }
}
