/**
 * @author Ammar Husain
 * period 4
 */

public class Car {
    private int startOdometer; //Miles used before trip started
    private int currentOdometer; // Miles at end of trip
    private double gallonsConsumed; //Gas consumed in trip

    /**
     * Creates Car object with an initial odo reading.
     * @param initialOdometer initial reading of odometer
     */
    public Car (int initialOdometer){
    	startOdometer = initialOdometer;
    }

    /**
     * Drives car and consumes gas. Sets odo reading and gas consumption to class variables.
     * @param currentReading Reading on odometer at end of trip
     * @param fuelUsed  Fuel used during the trip
     */
    public void fillUp(int currentReading, double fuelUsed){
    	currentOdometer = currentReading;
    	gallonsConsumed = fuelUsed;
    }

    /**
     * Calculates the miles per gallon.
     * @return MPG based on miles traveled and gallons consumed (double)
     */
    public double calculateMPG(){
    	return (currentOdometer - startOdometer)/gallonsConsumed;
    }

    /**
     * Resets trip by setting currentOdometer to startOdometer and gallons consumed to 0.
     */
    public void resetMPG(){
    	startOdometer = currentOdometer;
    	gallonsConsumed = 0;
    }
}
