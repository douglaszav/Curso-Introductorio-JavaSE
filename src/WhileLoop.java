public class WhileLoop {
    /**Uso del while loop*/
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();

        for(int i = 1; isTurnOnLight && i <= 10; ++i) {
            printSOS();
        }

    }

    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight() {
        isTurnOnLight = !isTurnOnLight;
        return isTurnOnLight;
    }
}