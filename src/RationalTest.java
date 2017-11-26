//3.2.7
public class RationalTest {

    public static void main(String[] args) {
        Rational rational1 = new Rational(2, 3);
        Rational rational2 = new Rational(4, 5);
        System.out.printf("%s + %s = %s\n", rational1, rational2, rational1.plus(rational2));
        System.out.printf("%s - %s = %s\n", rational1, rational2, rational1.minus(rational2));
        System.out.printf("%s * %s = %s\n", rational1, rational2, rational1.times(rational2));
        System.out.printf("%s / %s = %s\n", rational1, rational2, rational1.divides(rational2));
    }

}
