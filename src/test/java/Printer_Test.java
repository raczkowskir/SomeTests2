import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Printer_Test {

    @Test
    void testPrintColour() {
        Printer printer = new Printer(2);
        assertEquals(Printer.Colour.black, printer.printColour(Printer.Colour.black));
    }
}
