/***
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 * 
 * @author Ammar Husain
 * Period 4
 *
 */
public class Fraction {
	/***
	 * Instance variables that store values for the numerator and denominator of the fraction
	 */
    private int numerator;
    private int denominator;
    /***
     * Creates Fraction object initialized to 0/1
     */
    public Fraction(){
		this.numerator = 0;
		this.denominator = 1;
    }
    /***
     * Creates a whole number fraction.
     * @param n Whole number to create
     */
	public Fraction(int n){
		this.numerator = n;
		this.denominator = 1;
		this.reduce();
	}
	/***
	 * Creates a fraction with both a numerator and denominator.
	 * @param n Numerator
	 * @param d Denominator
	 */
	public Fraction(int n, int d){
		this.numerator = n;
		this.denominator = d;
		this.reduce();
	}
	/***
	 * Copies a fraction object.
	 * @param other Fraction to copy
	 */
	public Fraction(Fraction other){
		other.reduce();
		this.numerator = other.getNumerator();
		this.denominator = other.getDenominator();
	}
	/***
	 * Gets the numerator of the Fraction.
	 * @return Numerator of the Fraction
	 */
	public int getNumerator(){
		return this.numerator;
	}
	/***
	 * Gets the denominator of the Fraction.
	 * @return Denominator of the Fraction.
	 */
	public int getDenominator(){
		return this.denominator;
	}
	/***
	 * Returns decimal value of the object.
	 * @return Divided value of the fraction.
	 */
	public double getValue(){
		return ((double)this.numerator)/((double)this.denominator);
	}
	/***
	 * Sets the numerator of the fraction.
	 * @param n Numerator of the fraction
	 */
	public void setNumerator(int n){
		this.numerator = n;
	}
	/***
	 * Sets the denominator of the fraction.
	 * @param d denominator of fraction.
	 */
	public void setDenominator(int d){
		this.denominator = d;
	}
	/***
	 * Sets the fraction equal to an existing fraction object.
	 * @param other Fraction to equate current fraction to
	 */
	public void setFraction(Fraction other){
		this.numerator = other.getNumerator();
		this.denominator = other.getDenominator();
	}
	/***
	 * Converts Fraction into string format.
	 * @return Stringified Fraction
	 */
    public String toString(){
        return  (this.numerator + "/" + this.denominator);
    }
    /***
     * Adds fraction to current fraction and then returns sum.
     * @param other Fraction to add
     * @return Fraction object of sum of fraction.
     */
	public Fraction add(Fraction other){
        Fraction addFrac = new Fraction((this.getNumerator()*other.getDenominator()+other.getNumerator()*this.getDenominator()), (this.getDenominator()*other.getDenominator()));
		return addFrac;
	}
	/***
	 * Adds integer to the current fraction
	 * @param m Integer to add to the fraction
	 * @return Sum of the fraction and integer
	 */
	public Fraction add(int m){
        Fraction addFrac2 = new Fraction((this.getNumerator()+this.getDenominator()*m), this.getDenominator());
		return addFrac2;
	}
	/***
	 * Multiplies current fraction by a given fraction.
	 * @param other Fraction to multiply
	 * @return product of the two fractions
	 */
	public Fraction multiply(Fraction other){
        Fraction multFrac = new Fraction(this.getNumerator()*other.getNumerator(), this.getDenominator()*other.getDenominator());
		return multFrac;
	}
	/***
	* Multiplies current fraction by an integer.
	* @param integer to multiply
	* @return product of fraction and integer
	*/
	public Fraction multiply(int m){
        Fraction multFrac2 = new Fraction(this.getNumerator()*m, this.getDenominator());
        return multFrac2;
	}
	/***
	* Reduces fraction into a simplified form.
	*/
    public void reduce(){
    	if (this.denominator < 0) { //Moves negative sign from denominator to numerator
  			this.numerator = -this.numerator;
   			this.denominator = -this.denominator;
		} 
        int factor = MyMathLib.gcf(java.lang.Math.abs(this.numerator), java.lang.Math.abs(this.denominator)); //Takes absolute value to ensure positive inputs into gcf
        this.numerator /= factor;
        this.denominator /= factor;
    }
}
