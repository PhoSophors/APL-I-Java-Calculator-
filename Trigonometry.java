
/**
 * Trigonometry
 * @return
 */

public class Trigonometry {

    // // 1. calculate sin of radian. [float sin(float radain)]
    public static float sin(float radian, float in) {

        // process
        radian = (float) Math.sin(Math.toRadians(in * 180 / Math.PI));
        // output
        System.out.print ("\tsin(" + in + " redain ) = ");
        return radian;
    }

    // 2. Calculate sind of degree. [ float sind(float degree) ]
    public static float sind(float degree, float in) {

        // process
        float value = (float) Math.toRadians(in);
        degree = (float) Math.sin(value);
        // output
        System.out.print ("\tsind(" + in + " degree ) = ");
        return degree;
    }

    // 3. Calculate cos of radian. [float cos(float radian)]
    public static float cos(float radian, float in) {

        // process
        radian = (float) Math.cos(Math.toRadians(in * 180 / Math.PI));
        // output
        System.out.print ("\tcos(" + in + " redain ) = ");
        return radian;
    }

    // 4. calculate cos of degree. [float cosd(float degree)]
    public static float cosd(float degree, float in) {

        // process
        float value = (float) Math.toRadians(in);
        degree = (float) Math.cos(value);
        // ouput
        System.out.print ("\tcosd(" + in + " degree ) = ");
        return degree;
    }

    // 5. calculate tan of radian. [float tan(float radian)]
    public static float tan(float radian, float in) {

        // process
        radian = (float) Math.tan(Math.toRadians(in * 180 / Math.PI)); 
        // output
        System.out.print ("\ttan(" + in + " redain ) = ");
        return radian;
    }

    // 6. calculate tand of degree
    public static float tand(float degree, float in) { 

        // process
        float value = (float) Math.toRadians(in);
        degree = (float) Math.tan(value);
        // output
        System.out.print ("\ttand(" + in + " degree ) = "); 
        return degree;
    }

    // 7. calculate square2 (int)
    public static long square2(long x, float in) {

        // process
        double result = Math.pow(in, 2); 
        // output
        System.out.println("\t" + in + " ^ 2 = " + result);
        return x;
    }

    // 8. calculate square2 (floating-point)
    public static double square2(double x, float in) {

        // process
        float result = (float) Math.pow(in, 2);
        // output
        System.out.print ("\t" + in + " ^ 2 = " + result); 
        return result;
    }

    // 9. calculate square3 (int)
    public static long square3(long x, float in) {

        // process
        double result = Math.pow(in, 3); 
        // output
        System.out.print ("\t" + in + " ^ 3 = " + result);
        return x;
    }

    //10. calculate square3 (floating-point)
       public static double square3(double x, float in) {

        // process
        float result = (float) Math.pow(in, 3); 
        // output
        System.out.print ("\t" + in + " ^ 3 = " + result); 
        return result;
    }

    // 11. convert degree to radain
    public static double degree2radian(double radain, float in) {

        // process
        double radian = in * Math.PI / 180; 
        // output
        System.out.print ( "\t" + in + " degree = "); 
        return radian;
    }
}