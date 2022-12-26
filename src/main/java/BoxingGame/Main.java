package BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter joeFraizer = new Fighter("Joe Fraizer", 30, 120, 95, 15);
        Fighter mikeTyson = new Fighter("Mike Tyson", 37 , 110, 110, 20);

        Match jm = new Match(joeFraizer, mikeTyson, 90, 120);

        jm.run();
    }


}
