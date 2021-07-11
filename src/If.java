public class If {
    /**Clase para Ifs*/
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended = fileSended + 1;
            System.out.println("Archivo Enviado");
        } else {
            fileSended = fileSended - 1;
            System.out.println("Por favor enciente tu Bluetooth para iniciar la transferencia");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}