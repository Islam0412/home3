import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] home = {3.5, 8.0, 8.6, -9.5, 5.3, 5.0, 5.7, 33.5, -55.64, 66.4, -6.4, 5.55, -76.5, 65.5, 56.6, 98.0};

        double NUM = 0;
        int SUM = 0;

        boolean enter = false;
        for (double address : home) {
            if (address < 0) {
                enter = true;
            } else if (address > 0 && enter) {
                System.out.println(address);
                if (address > 0) {
                    NUM = NUM + address;
                    SUM++;

                }
            }
        }
        System.out.println(home);
        System.out.println("posutive nfumbers" + SUM);
        System.out.println("summa" + NUM);
        System.out.println("average of positive numbers" + NUM / SUM);
        for (int i = 0; i < home.length - 1; i++) {
            for (int j = 0; j < home.length - i - 1; j++) {
                if (home[i] > home[j + 1]) {
                    double fud = home[j];
                    home[j] = home[j + 1];
                    home[j + 1] = fud;

                }
            }
            System.out.println(Arrays.toString(home));
        }
    }
}







