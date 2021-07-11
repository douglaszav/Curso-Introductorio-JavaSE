public class IncrementDecrement {
    /**Clase sobre incrementos*/
    public static void main(String[] args) {
        int lives = 5;
        int live = lives - 1;
        System.out.println(live);
        --live;
        System.out.println(live);
        ++live;
        System.out.println(live);
        ++live;
        int gift = 100 + live;
        System.out.println(gift);
        System.out.println(live);
    }
}
