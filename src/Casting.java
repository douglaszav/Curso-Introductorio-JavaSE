public class Casting {
/**Casteo en clases*/

    public static void main(String[] args) {
        double monthlyDogs = 2.5D;
        System.out.println(monthlyDogs);
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);
        int a = 30;
        int b = 12;
        System.out.println((double) a / (double) b);
        double c = (double) a / (double) b;
        System.out.println(c);
        char n = 49;
        System.out.println(n);
        short nS = (short) n;
        System.out.println(nS);
    }
}
