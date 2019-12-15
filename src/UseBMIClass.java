import java.math.*;

public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() +
                " " + bmi1.getStatus());
        BMI bmi2 = new BMI("Susan King", 215, 70);

        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() +
                " " + bmi2.getStatus());
        System.out.println("The maximum integer is " + Integer.MAX_VALUE);
        System.out.println("The minimum positive float is " + Float.MIN_VALUE);
        System.out.println("The maximum double-precision floating-point number is " + Double.MAX_VALUE);
  int result =  Integer.parseInt("5") + 5;
        System.out.println("result is " + result);
        System.out.println("Answer is "+new Double(12.4).compareTo(new Double(12.3)));

        Integer doubleObject = Integer.valueOf("1A",16);
        System.out.println("doubleObject is " + doubleObject.toString());

        BigInteger a = new BigInteger("922337203685477585878946489489489448949848907");
        BigInteger b = new BigInteger("2654894651023054489489584784694894589476264589449798");

        String x = "test";
        x.replace('t','5');

        System.out.println("x now is " + x );

        String[] tokens = "JAVA%HTML%PERL%25".split("%");
        for (int i = 0; i <tokens.length; i++) {
            System.out.print(tokens[i] + " ");
        }

    }
}
