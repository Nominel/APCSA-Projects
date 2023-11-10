package rational;

import java.util.Objects;

//design your Rational class
//write all code for your Rational class here
//test your Rational class with the RationalRunner
class Rational{
    private int numerator;
    private int denominator;

    public Rational(int n,int d){
        numerator=n;
        denominator=d;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public double getDouble(){
        return (double)numerator/denominator;
    }

    public void setRational(int n, int d){
        numerator=n;
        denominator=d;
    }

    public boolean isBigger(Rational r){
        return getDouble()>r.getDouble();
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public boolean equals(Rational r) {
        return getDouble()==r.getDouble();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void add(Rational r){
        numerator = (getNumerator()*r.getDenominator()+r.getNumerator()*getDenominator());
        denominator= (getDenominator()*r.getDenominator());
        reduce();
    }

    @Override
    public String toString() {
        return numerator+" / "+denominator;
    }
}