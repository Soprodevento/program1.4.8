import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger result = factorial(3);
        System.out.println(result);
    }

    public static BigInteger factorial(int value) {
        if (value == 0 || value == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }
}
