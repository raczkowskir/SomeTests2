public class Printer {
    int printerId;
    public Printer(int id) {
        this.printerId = id;
    }

    enum Colour {
        black, red, blue;
    }

    public Enum printColour(Colour colour) {
        System.out.printf("Your colour is: " + colour);
        return colour;
    }
}
