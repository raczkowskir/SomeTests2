import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Printer_Test {

    Printer printer;
    static int globalId = 0;

//    @BeforeEach
////    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
//    void init() {
//        printer = new Printer(globalId);
//        globalId++;
//    }

    @BeforeAll
    public static void setUpAll() {
        System.out.println("Tests started.");
    }

    @BeforeEach
    public void setUp() {
        printer = new Printer(globalId);
        globalId++;
        System.out.println("Set up tests.");
        System.out.println("SetUp GlobalId: " + globalId);
    }

    @Test
    @Order(2)
    void testPrintColour() {
        System.out.println("Test_1 PrinterId is: " + printer.getPrinterId() +
                " and globalId: " + globalId);
        int a = 0;
//        System.out.println("Variable \"a\":" + a);
//        a++;
//        System.out.println("Variable \"a\":" + a);
//        a++;
//        System.out.println("Variable \"a\":" + a);
//        a++;
//        System.out.println("Variable \"a\":" + a);
        System.out.println("Order 2");
        assertEquals(Printer.Colour.black, printer.printColour(Printer.Colour.black));
    }

    @Test
    @Order(3)
    void testGetPrinterId() {
        System.out.println("Test_2 PrinterId is: " + printer.getPrinterId() +
                " and globalId: " + globalId);
        assertEquals(printer.getPrinterId(), 2);
        System.out.println("Order 3");
    }

    @Test
    @Order(1)
//    @Disabled
//    @Test @Disabled
    public void disableTC() {
        System.out.println("_________Disabled TC.");
        System.out.println("Order 1");
    }

    @AfterAll
    public static void FinishTests() {
        System.out.println("Tests Finished.");
    }


}
