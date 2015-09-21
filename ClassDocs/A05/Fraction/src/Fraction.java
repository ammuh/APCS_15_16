
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
		numerator = 0;
		denominator = 1;
    }
	public Fraction(int n){
		numerator = n;
		denominator = 1;
	}
	public Fraction(int n, int d){
		numerator = n;
		denominator = d;
	}
	public Fraction(Fraction other){
		numerator = other.getNumerator();
		denominator = other.getDenominator();
	}

	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	public double getValue(){
		return ((double)numerator)/((double)denominator);
	}
	public void setNumerator(int n){
		numerator = n;
	}
	public void setDenominator(int d){
		denominator = d;

	}
	public void setFraction(Fraction other){
        other.reduce();
		numerator = other.getNumerator();
		denominator = other.getDenominator();

	}/*
    public String toString(){
        reduce();
        return  (numerator + "/" + denominator);
    }
*/
	public Fraction add(Fraction other){
        Fraction addFrac = new Fraction((getNumerator()*other.getDenominator()+other.getNumerator()*getDenominator()), (getDenominator()*other.getDenominator()));

		return addFrac;
	}
	public Fraction add(int m){
        Fraction addFrac2 = new Fraction((getNumerator()+getDenominator()*m), getDenominator());

		return addFrac2;
	}
	public Fraction multiply(Fraction other){
        Fraction multFrac = new Fraction(getNumerator()*other.getNumerator(), getDenominator()*other.getDenominator());

		return multFrac;
	}
	public Fraction multiply(int m){
        Fraction multFrac2 = new Fraction(getNumerator()*m, getDenominator());

        return multFrac2;
	}
    public void reduce(){
        int factor = MyMathLib.gcf(getNumerator(), getDenominator());
        setNumerator(getNumerator()/factor);
        setDenominator(getDenominator() / factor);
    }
}
