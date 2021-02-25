public class Main {
    public static void main(String[] args) {

        Cinderella[] cinderellas = new Cinderella[] {
                new Cinderella("Alina", 15, 38),
                new Cinderella("Olya", 23, 35),
                new Cinderella("Vika", 22, 30),
                new Cinderella("Nastya", 29, 41)
        };

        Prince prince = new Prince("Vasya", 25, 30);

        System.out.println(prince.found(cinderellas));

    }
}
