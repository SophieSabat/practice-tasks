public class Prince extends Human{
    private int foundShoe;

    public Prince() {
    }

    public Prince(String name, int age, int foundShoe) {
        super(name, age);
        this.foundShoe = foundShoe;
    }

    public String found(Cinderella[] all) {
        for (Cinderella cinderella : all) {
            if (cinderella.getShoeSize() == this.foundShoe) {
                return cinderella.toString();
            }
        }
        return "Not found";
    }


    public void setFoundShoe(int foundShoe) {
        this.foundShoe = foundShoe;
    }

    public int getFoundShoe() {
        return foundShoe;
    }


    @Override
    public String toString() {
        return "Prince{" +
                "foundShoe=" + foundShoe +
                "} " + super.toString();
    }
}
