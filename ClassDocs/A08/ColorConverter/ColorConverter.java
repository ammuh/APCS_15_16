/***
 * Class that allows you to convert color values from RGB to HSV.
 * @author  Ammar Husain
 * Period 4
 */
public class ColorConverter{
    private int red, blue, green;
    private int hue, saturation, brightness;
    /***
     * Constructor that creates a ColorConverter object with three values. A type parameter is taken and used to assign
     * the variables to the proper instance variables.
     * @param t - Type of color value
     * @param val1 - First color value
     * @param val2 - Second color value
     * @param val3 - Third color value
     */
    public ColorConverter( int t, int val1, int val2, int val3){
        if(t == 1){
            red = val1;
            blue = val2;
            green = val3;
        }
        else{
            hue = val1;
            saturation = val2;
            brightness = val3;
        }
    }
    /***
     * Sets RGB values for current object.
     * @param v1 - RGB value 1
     * @param v2 - RGB value 2
     * @param v3 - RGB value 3
     */
    public void setRGB(int v1,int v2,int v3){
        this.red = v1;
        this.green = v2;
        this.blue = v3;
    }
    /***
     * Sets HSV values for current object.
     * @param v1 - HSV value 1
     * @param v2 - HSV value 2
     * @param v3 - HSV value 3
     */
    public void setHSV(int v1,int v2,int v3){
        this.hue = v1;
        this.saturation = v2;
        this.brightness = v3;
    }
<<<<<<< HEAD
    private double calculateHue(){
        double h = 0;
        double cmax = getMaximum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
        double cmin = getMinimum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
        double delta = cmax - cmin;
        if(delta == 0){
            h= 0;
        }
        if((double)this.red/255 == cmax){
            h= ((((double)this.green/255 - (double)this.blue/255)/delta)%6)*60;
        }
        if((double)this.green/255 == cmax){
            h= ((((double)this.blue/255 - (double)this.red/255)/delta) + 2)*60;
        }
        if((double)this.blue/255 == cmax){
            h= ((((double)this.red/255 - (double)this.green/255)/delta) + 4)*60;
        }
        return h;
    }
    private double calculateSaturation(){
        double cmax = getMaximum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
        double cmin = getMinimum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
        double delta = cmax - cmin;
        if(cmax == 0){
            return 0;
        }else{
            return 100*delta/cmax;
        }
    }
    
    private double calculateBrightness(){
        return 100*getMaximum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
    }
    
=======
    /***
     * Converts the RGB values to HSV values.
     */
>>>>>>> 60ca04074ae225c81de23cf55804658694160c22
    public void RGBtoHSV(){
        //Casts h, s, and v to round down.
        this.hue = (int)calculateHue();
        this.saturation = (int)calculateSaturation();
        this.brightness = (int)calculateBrightness();
    }
    /***
     * Converts the HSV values to RGB values.
     */
    public void HSVtoRGB(){
        //Working variables declared and casted.
        double r, g, b, c, x, m;
        double h = (double)this.hue;
        double s = (double)this.saturation/100;
        double v = (double)this.brightness/100;
        //c, x, and m are found
        c = v * s;
        x = c * (1 - Math.abs((h/60)%2-1));
        m = v - c;
        //Uses switch to find in which range h falls in
        int op = (int)(6*(h/360));
        switch(op){
            case 0:
                r =c;
                g =x;
                b =0;
                break;
            case 1:
                r =x;
                g =c;
                b =0;
                break;
            case 2:
                r =0;
                g =c;
                b =x;
                break;
            case 3:
                r =0;
                g =x;
                b =c;
                break;
            case 4:
                r =x;
                g =0;
                b =c;
                break;
            case 5:
                r=c;
                g=0;
                b=x;
                break;
            default:
                r = 0;
                g=0;
                b=0;
                break;
        }
        //Reconverts rgb values to 255 scale
        r = (r+m)*255;
        g =(g+m)*255;
        b =(b+m)*255;
        //Code for rounding up, checks if there is a decimal, then rounds up accordingly
        if(r - (int)r > 0){
            this.red = (int)r + 1;
        }
        else{
            this.red = (int)r;
        }
        if(g - (int)g > 0){
            this.green = (int)g + 1;
        }
        else{
            this.green = (int)g;
        }
        if(b - (int)b > 0){
            this.blue = (int)b + 1;
        }
        else{
            this.blue = (int)b;
        }
    }
    /***
     * Calculates the hue of from RGB color values.
     * @return - Hue
     */
    private double calculateHue(){
        double h = 0;
        double cmax = getMaximum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
        double cmin = getMinimum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
        double delta = cmax - cmin;
        if(delta == 0){
            h= 0;
        }
        if((double)this.red/255 == cmax){
            h= ((((double)this.green/255 - (double)this.blue/255)/delta)%6)*60;
        }
        if((double)this.green/255 == cmax){
            h= ((((double)this.blue/255 - (double)this.red/255)/delta) + 2)*60;
        }
        if((double)this.blue/255 == cmax){
            h= ((((double)this.red/255 - (double)this.green/255)/delta) + 4)*60;
        }
        return h;
    }
    /***
     * Calculates the saturation of from RGB color values.
     * @return - Saturation
     */
    private double calculateSaturation(){
        double cmax = getMaximum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
        double cmin = getMinimum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
        double delta = cmax - cmin;
        if(cmax == 0){
            return 0;
        }else{
            return 100*delta/cmax;
        }
    }
    /***
     * Calculates the brightness of from RGB color values.
     * @return - Brightness
     */
    private double calculateBrightness(){
        return 100*getMaximum((double)this.red/255, (double)this.blue/255, (double)this.green/255);
    }
    /***
     * Function that takes three parameters and returns the maximum value.
     * @param v1 - value 1
     * @param v2 - value 2
     * @param v3 - value 3
     * @return - Maximum value
     */
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
        else{
            return 0;
        }
    }
    /***
     * Function that takes three parameters and returns the minimum value.
     * @param v1 - value 1
     * @param v2 - value 2
     * @param v3 - value 3
     * @return - Minimum value
     */
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
        else{
            return 0;
        }
    }
    /***
     * Prints out HSV value converted from RGB.
     */
    public void printRGBtoHSV(){
        char c = 176;
        System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (" ,
        red , ", " , green , ", " , blue , ")");
        System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (" , hue
        , (""+ c+", ") , saturation , "%, " , brightness ,
        "%)\n");
    }
    /***
     * Prints out RGB value converted from HSV.
     */
    public void printHSVtoRGB(){
        char c = 176;
        System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (" ,
        hue , (""+ c+", ") , saturation , "%, " , brightness ,
        "%)");
        System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (" ,
        red , ", " , green , ", " , blue , ")\n");
    }
}