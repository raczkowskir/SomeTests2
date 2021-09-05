public class Printer {
    private int printerId;

    enum Colour {
        black, red, blue
    }

    public Printer(int id) {
        this.printerId = id;
    }

    int getPrinterId() {
        return printerId;
    }

    public Enum printColour(Colour colour) {
        System.out.println("Your colour is: " + colour);
        return colour;
    }
}
