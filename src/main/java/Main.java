public class Main {
    public static void main(String[] args) {
        System.out.println("Ok dziala!");
        Printer printer = new Printer(1);
        printer.printColour(Printer.Colour.black);
    }
}