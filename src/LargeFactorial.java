import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {

        System.out.println("50! is \n" + factorial(50));
        String x = "test";

       char y = x.charAt(0);
        System.out.println("y is" + y);

    }

    public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;
      for (int i = 1; i <= n; i++) {
          result = result.multiply(new BigInteger(i + ""));
      }
      return result;
    }
}
