public class Functions {

        public static void main(String[] args) {
            double y = 3.0D;
            circleArea(y);
            sphereArea(y);
            sphereVolumen(y);
            System.out.println("Pesos a dólares: " + converToDolar(1000.0D, "COP"));
        }

        public static double circleArea(double r) {
            return Math.PI * Math.pow(r, 2.0D);
        }

        public static double sphereArea(double r) { return (Math.PI * 4) * Math.pow(r, 2.0D);
        }

        public static double sphereVolumen(double r) {
            return Math.PI * Math.pow(r, 3.0D);
        }

        public static double converToDolar(double quantity, String currency) {
            byte var4 = -1;
            switch (currency.hashCode()) {
                case 66916:
                    if (currency.equals("COP")) {
                        var4 = 1;
                    }
                    break;
                case 76803:
                    if (currency.equals("MXN")) {
                        var4 = 0;
                    }
            }

            switch (var4) {
                case 0:
                    quantity *= 0.052D;
                    break;
                case 1:
                    quantity *= 3.1E-4D;
            }

            return quantity;
        }
}
