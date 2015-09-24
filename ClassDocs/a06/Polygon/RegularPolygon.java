public class RegularPolygon{ 
private int myNumSides; // t of sides 
private double mySideLength; // length of side 
private double myR; // radius of circumscribed circle 
private double myr; // radius of inscribed circle 
// constructors 
public RegularPolygon(){
    myNumSides = 3;
} 
public RegularPolygon(int numSides, double sideLength){
    myNumSides = numSides;
    mySideLength = sideLength;
    this.calcR();
    this.calcr();
    
} 
// private methods 
private void calcr(){
    this.myr = .5*mySideLength*(1.0/Math.tan(Math.PI/(double)myNumSides));

}
private void calcR(){
    this.myR = .5*mySideLength*(1.0/Math.sin(Math.PI/(double)myNumSides));

} 
// public methods 
public double vertexAngle(){
    double vangle = ((myNumSides-2)/myNumSides)*180;
 
    return vangle;
} 
public double Perimeter(){
    double perimeter = myNumSides*mySideLength;
  
    return perimeter;
} 
public double Area(){
    double area = .5*myNumSides*Math.pow(myR, 2)*Math.sin(2*Math.PI/myNumSides);
   
    return area;
} 
public int getNumside(){

    return myNumSides;
} 
public double getSideLength(){
   
    return mySideLength;
} 
public double getR(){
  
    return myR;
} 
public double getr(){
     return myr;
} 
}
