import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger result = factorial(BigInteger.valueOf(3));
        System.out.println(result);
    }

    public static BigInteger factorial(BigInteger value) {
        if (value.equals(BigInteger.valueOf(0)) || value.equals(BigInteger.valueOf(1))) {
            return BigInteger.valueOf(1);
        } else {
            return value.multiply(factorial(value.subtract(BigInteger.valueOf(1))));
        }
    }
}
