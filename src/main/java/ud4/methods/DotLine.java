package ud4.methods;

import java.util.Locale;
import java.util.Scanner;

public class DotLine {
    public static String dotLine(int length){
        if (length < 0)
            throw new IllegalArgumentException("length should be positive");

        return ".".repeat(length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int length = in.nextInt();
        String result = dotLine(length);
        System.out.println(result);
    }
}
