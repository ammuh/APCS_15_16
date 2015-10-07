public class ColorConverter{
    private int red;
    private int blue;
    private int value3;
    private int type;
    
    public ColorConverter( int t, int val1, int val2, int val3){
        red = val1;
        blue = val2;
        value3 = val3;
        type = t;
    }
    public void setRGB(double v1,double v2,double v3){
        this.red = v1;
        this.blue = v2;
        this.value3 = v3;
    }
    public void setHSV(double v1,double v2,double v3){
        this.red = v1;
        this.blue = v2;
        this.value3 = v3;
    }
    private double calculateSaturation(){
       return; 
    }
    private double calculateBrightness(){
        return;
    }
    public void RGBtoHSV(){
        double h, s, v;
        double cmax = getMaximum(this.red, this.blue, this.value3);
        double cmin = getMinimum(this.red, this.blue, this.value3);
        double delta = cmax - cmin;
        //Calculate H
        if(delta == 0){
            h = 0;
        }
        else if((double)this.red == cmax){
            h = (((this.blue - this.value3)/delta)%6)*60;
        }
        else if((double)this.blue == cmax){
            h = ((this.value3 - this.red)/delta + 2)*60;
        }
        else if((double)this.value3 == cmax){
            h = ((this.red - this.blue)/delta + 4)*60;
        }
        //Calculate S
        if(cmax == 0){
            s = 0;
        }else{
            s = delta/cmax;
        }
        //Do some magic and then at the end:
        this.red = (int)h;
        this.blue = (int)s;
        this.value3 = (int)v;
        this.type = 1;
    }
    public void HSVtoRGB(){
        double r, g, b, c, x, m;
        double h = (double)this.red;
        double s = (double)this.blue;
        double v = (double)this.value3;
        c = v * (double)this.blue;
        x = c * (1 - Math.abs((h/60)%2-1));
        m = (double)v - c;
        if(h<60){
            
        }else if (h<) 
        //Do some magic and then at the end:
        this.red = (int)r;
        this.blue = (int)g;
        this.value3 = (int)b;
        this.type = 1;
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
    public void printRGBtoHSV(){
        char c = 176;
        System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (" ,
        red , ", " , green , ", " , blue , ")");
        System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (" , hue
        , (""+ c+", ") , saturation , "%, " , brightness ,
        "%)\n");
    }
    public void printHSVtoRGB(){
        char c = 176;
        System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (" ,
        hue , (""+ c+", ") , saturation , "%, " , brightness ,
        "%)");
        System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (" ,
        red , ", " , green , ", " , blue , ")\n");
    }
    */

}