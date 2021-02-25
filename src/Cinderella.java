public class Cinderella extends Human{
    private int shoeSize;

    public Cinderella() {
    }

    public Cinderella(String name, int age, int shoeSize) {
        super(name, age);
        this.shoeSize = shoeSize;
    }


    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getShoeSize() {
        return shoeSize;
    }


    @Override
    public String toString() {
        return "Cinderella{" +
                "shoeSize=" + shoeSize +
                "} " + super.toString();
    }
}
