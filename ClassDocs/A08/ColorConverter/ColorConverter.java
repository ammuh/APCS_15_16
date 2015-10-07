public class ColorConverter{
    private int value1;
    private int value2;
    private int value3;
    private int type;
    
    public ColorConverter( int t, int val1, int val2, int val3){
        value1 = val1;
        value2 = val2;
        value3 = val3;
        type = t;
    }
    public void setRGB(double v1,double v2,double v3){
        this.value1 = v1;
        this.value2 = v2;
        this.value3 = v3;
    }
    public void setHSV(double v1,double v2,double v3){
        this.value1 = v1;
        this.value2 = v2;
        this.value3 = v3;
    }
    private double calculateSaturation(){
       return; 
    }
    private double calculateBrightness(){
        return;
    }
    public void HSVtoRGB(){
        double h;
        double s;
        double v;
        double cmax = getMaximum(this.value1, this.value2, this.value3);
        double cmin = getMinimum(this.value1, this.value2, this.value3);
        double delta = cmax - cmin;
        //Calculate H
        if(delta == 0){
            h = 0;
        }
        else if((double)this.value1 == cmax){
            h = ((this.value2 - this.value3)/delta)%6;
        }
        else if((double)this.value2 == cmax){
            h = (this.value3);
        }
        else if((double)this.value3 == cmax){
            h = ;
        }
        //Calculate S
        if(cmax == 0){
            s = 0;
        }
        else{
            s = delta/cmax;
        }
        //Do some magic and then at the end:
        this.value1 = (int)h;
        this.value2 = (int)s;
        this.value3 = (int)v;
    }
    public void RGBtoHSV(){
        
    }
    private double getMaximum(double v1,double v2,double v3){
        if(v1>=v2 && v1>=v3){
            return v1;
        }
        else if (v2>=v1 && v2>=v3){
            return v2;
        }
        else if (v3>=v1 && v3>=v2){
            return v3;
        } 
    }
    private double getMinimum(double v1,double v2,double v3){
        if(v1<=v2 && v1<=v3){
            return v1;
        }
        else if (v2<=v1 && v2<=v3){
            return v2;
        }
        else if (v3<=v1 && v3<=v2){
            return v3;
        }
    }
    /*
    a. 6 integer fields for the RGB values – red, green, and blue and three for the HSV values – Hue,
Saturation, and brightness.
b. Constructor that takes four integer arguments – type, value1, value2, value3. If type is 1 then the
passed in values are used to initialize the RGB values. If type is 2 then the passed in values are
used to initialize the HSV values.
c. Method setRGB that takes three integer arguments and sets the RGB values to the passed in
values
d. Method setHSV that takes takes three integer arguments and sets the HSV values to the passed
in values
e. Private method getMaximum that takes three double arguments and finds and returns the largest
of the three numbers. Do not use Math.max to do this.
f. Private method getMinimum that takes three double arguments and finds and returns the
smallest of the three numbers. Do not use Math.min to do this.
g. Private method calculateHue that calculates and returns the hue value based on the formulas.
Do not use if – else statements. Just use if statements for each of the different conditions.
h. Private method calculateSaturation that calculates and returns the saturation value based
on the formulas.
i. Private method calculateBrightness that calculates and returns the brightness value based on the
formulas.
j. Method RGBtoHSV that converts the RGB values to HSV values by calling the private methods
described above. The HSV fields get updated.
k. Method HSVtoRGB that converts the HSV values to RGB values using the formulas. Note that
the values of RGB are always rounded up if the value is less than 255. So if the red value
calculated is 45.3, it should get rounded up to 46. But if the red value is 255.3, it will get rounded
down to 255. You may not use any of the built in Math methods to do this. Write a series of if
statements to do the rounding.*/
}