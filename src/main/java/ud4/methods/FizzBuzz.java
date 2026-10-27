package ud4.methods;

public class FizzBuzz {
    public static String fizzBuzz(int n){
        StringBuilder r = new StringBuilder();
        if (n % 3 == 0) r.append("Fizz");
        if (n % 5 == 0) r.append("Buzz");
        // if (n % 7 == 0) r.append("Tazz");
        return r.isEmpty() ? Integer.toString(n) : r.toString();
    }
}
