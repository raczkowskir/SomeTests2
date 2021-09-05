import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Printer_Test {

    Printer printer;
    int globalId = 0;

    @BeforeEach
//    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    void init() {
        printer = new Printer(globalId);
        globalId++;
    }

    @Test
    void testPrintColour() {
        System.out.println("Test_1 PrinterId is: " + printer.getPrinterId() +
                " and globalId: " + globalId);
        int a = 0;
        System.out.println("Variable \"a\":" + a);
        a++;
        System.out.println("Variable \"a\":" + a);
        a++;
        System.out.println("Variable \"a\":" + a);
        a++;
        System.out.println("Variable \"a\":" + a);
        assertEquals(Printer.Colour.black, printer.printColour(Printer.Colour.black));
    }

    @Test
    void testGetPrinterId() {
        System.out.println("Test_2 PrinterId is: " + printer.getPrinterId() +
                " and globalId: " + globalId);
        assertEquals(printer.getPrinterId(), 0);
    }

}
