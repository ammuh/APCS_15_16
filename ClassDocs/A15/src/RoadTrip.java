import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author your name
 * period #
 *
 */
public class RoadTrip
{
    //list of geo locations
    private ArrayList<GeoLocation> glist;
    
    /**
     * Constructor reads in the geo locations from the given file and adds them to 
     * the list
     * @param fname - file name
     */
    public RoadTrip(String fname)
    {
    	glist = new ArrayList<GeoLocation>();
    	Scanner s;
    	try{
    	    s = new Scanner(new File(fname));
    	    while(s.hasNextLine()){
    	        String n = s.next();
    	        double lat = s.nextDouble();
        	    double lon = s.nextDouble();
        	    addStop(n, lat, lon);
    	    }
    	}catch(Exception e){
    	    System.out.println(e);
    	}
    }
    /**
     * Create a GeoLocation and add it to the road trip
     * @param name - name of the geo location
     * @param latitude - latitude in degrees
     * @param longitude - longitude in degrees
     */
   
    public void addStop(String name, double latitude, double longitude)
    {
        glist.add(new GeoLocation(name, latitude, longitude));
    }

    /**
     * Get the total number of stops in the trip
     * @return total number of stops
     */
    public int getNumberOfStops()
    {
        return glist.size();
    }

    /**
     * Get the total miles of the trip
     * @return the total miles
     */
    
    public double getTripLength()
    {
        double length = 0;
        for (int i = 0; i < glist.size()-1; i++) {
            length += glist.get(i+1).distanceFrom(glist.get(i));
        }
        return length;
    }

    /**
     * Return a formatted toString of the trip
     * @return information about the trip
     */
     
    public String toString()
    {
        String d = "";
        for(int i = 0; i < glist.size(); i++){
            d += (glist.get(i).toString() + "\n");
        }
        String s = "Stops: " + getNumberOfStops() + "\nTotal: " + getTripLength() + "\n";
        return d + s;
    }
}
