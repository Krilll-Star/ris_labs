import java.io.Serializable;

class LivingBerth extends Berth implements Serializable {

    private int beds;

    public LivingBerth(String type, int square, int beds) {
        super(type, square);
        this.beds = beds;
    }

    public int getBeds() {
        return beds;
    }

    @Override
    public void display(){
        System.out.printf("%s, %d m^2, %d кроватей \n", getType(), getSquare(), getBeds());
    }

}