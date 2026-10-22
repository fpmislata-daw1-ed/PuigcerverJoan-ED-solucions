package ud4.methods;

public class NextSecond {
    public static String nextSecond(int h, int m, int s){
        s += 1;

        if (s == 60){
            s = 0;
            m += 1;
        }

        if (m == 60){
            m = 0;
            h += 1;
        }

        if (h == 24){
            h = 0;
        }

        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
