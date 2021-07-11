public class Arrays {
/**Clase para crear Arrays*/

    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        int[] days = new int[7];
        String[][] cities = new String[4][2];
        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        String[] var6 = androidVersions;
        int i = androidVersions.length;

        int j;
        for(j = 0; j < i; ++j) {
            String androidVersion = var6[j];
            System.out.println(androidVersion);
        }

        System.out.println();
        System.out.println();
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";
        String[][] var14 = cities;
        i = cities.length;

        for(j = 0; j < i; ++j) {
            String[] pair = var14[j];
            String[] var10 = pair;
            int var11 = pair.length;

            for(int var12 = 0; var12 < var11; ++var12) {
                String name = var10[var12];
                System.out.println(name);
            }
        }

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Chango";
        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);

        for(i = 0; i <= 1; ++i) {
            for(j = 0; j <= 0; ++j) {
                for(int k = 0; k <= 0; ++k) {
                    for(int l = 0; l <= 1; ++l) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

    }
}
