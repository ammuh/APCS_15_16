public class ColorConverter{
    private int red, blue, green;
    private int hue, saturation, brightness;
    
    private int type;
    
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
    public void setRGB(int v1,int v2,int v3){
        this.red = v1;
        this.blue = v2;
        this.green = v3;
    }
    public void setHSV(int v1,int v2,int v3){
        this.hue = v1;
        this.saturation = v2;
        this.brightness = v3;
    }
    private double calculateHue(){
        double h = 0;
         double cmax = getMaximum(this.red, this.blue, this.green);
        double cmin = getMinimum(this.red, this.blue, this.green);
        double delta = cmax - cmin;
         if(delta == 0){
            h= 0;
        }
        else if((double)this.red == cmax){
            h= (((this.blue - this.green)/delta)%6)*60;
        }
        else if((double)this.blue == cmax){
            h= ((this.green - this.red)/delta + 2)*60;
        }
        else if((double)this.green == cmax){
            h= ((this.red - this.blue)/delta + 4)*60;
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
    public void RGBtoHSV(){
        double h, s, v;
        //Calculate H
        h = calculateHue();
        s = calculateSaturation();
        v = calculateBrightness();
        //Calculate S
        
        //Do some magic and then at the end:
        this.hue = (int)h;
        this.saturation = (int)s;
        this.brightness = (int)v;
    }
    public void HSVtoRGB(){
        double r, g, b, c, x, m;
        double h = (double)this.hue;
        double s = (double)this.saturation;
        double v = (double)this.brightness;
        c = v * (double)this.blue;
        x = c * (1 - Math.abs((h/60)%2-1));
        m = (double)v - c;
        int op = 360/(int)h;
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
        r = (r+m)*255;
        g =(g+m)*255;
        b =(b+m)*255;
        
        //Do some magic and then at the end:
        this.red = (int)r;
        this.blue = (int)g;
        this.green = (int)b;
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
        else{
            return 0;
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
        else{
            return 0;
        }
    }
  
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

}