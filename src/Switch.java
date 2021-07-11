public class Switch {
/**Clase Switch*/

    public static void main(String[] args) {
        String colorModeSelected = "Dark";
        byte var3 = -1;
        switch(colorModeSelected.hashCode()) {
            case -400987268:
                if (colorModeSelected.equals("Blue Dark")) {
                    var3 = 2;
                }
                break;
            case 2122646:
                if (colorModeSelected.equals("Dark")) {
                    var3 = 3;
                }
                break;
            case 73417974:
                if (colorModeSelected.equals("Light")) {
                    var3 = 0;
                }
                break;
            case 75265016:
                if (colorModeSelected.equals("Night")) {
                    var3 = 1;
                }
        }

        switch(var3) {
            case 0:
                System.out.println("Seleccionaste Light Mode");
                break;
            case 1:
                System.out.println("Seleccionaste Night Mode");
                break;
            case 2:
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case 3:
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opción");
        }

    }
}
