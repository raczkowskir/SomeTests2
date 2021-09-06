public class Singleton {

    private static int instanceNumber = 0;
    private static Singleton singleton;

    private Singleton() {
        instanceNumber++;
    }

    public static Singleton getInstance() {
        System.out.println("The Singleton object ID: " + instanceNumber);
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
