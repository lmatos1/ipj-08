//3.2.7
public class Rational {

    private int numerator, denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational plus(Rational b) {
        int num = (numerator * b.denominator) + (denominator * b.numerator);
        int denom = denominator * b.denominator;
        int gcd = Euclid.gcd(Math.max(num, denom), Math.min(num, denom));
        return new Rational(num / gcd, denom / gcd);
    }

    public Rational minus(Rational b) {
        int num = (numerator * b.denominator) - (denominator * b.numerator);
        int denom = denominator * b.denominator;
        int gcd = Euclid.gcd(Math.max(num, denom), Math.min(num, denom));
        return new Rational(num / gcd, denom / gcd);
    }

    public Rational times(Rational b) {
        int num = numerator * b.numerator;
        int denom = denominator * b.denominator;
        int gcd = Euclid.gcd(Math.max(num, denom), Math.min(num, denom));
        return new Rational(num / gcd, denom / gcd);
    }

    public Rational divides(Rational b) {
        int num = numerator * b.denominator;
        int denom = denominator * b.numerator;
        int gcd = Euclid.gcd(Math.max(num, denom), Math.min(num, denom));
        return new Rational(num / gcd, denom / gcd);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
