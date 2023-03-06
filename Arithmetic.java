/**
 * Arithmetic calculatorclass 
 *      1. sum /2. divide /3. minus /4. multiply /5. modolus
 */

public class Arithmetic { // Arithmetic class

    // 1. calculate sum (a + b)
    public static int sum(int a, int b) { 

        System.out.print ("\n\t\tSum      : " + a + " + " + b + " = " );
        return a + b;
    } /* End sum */

    // 2. calculate divide (a / b)
    public static double divide(float a, float b) { 

        System.out.print ("\n\t\tDevide   : " + a + " / " + b + " = ");
        return (a / b);
    }/** End divide  */

    // 3. calculate munus (a - b)
    public static int minus (int a, int b) { 
    
        System.out.print ("\n\t\tMinus    : " + a + " - " + b + " = ");
        return a - b;
    } /** End minus */

    // 4. calculate multiply (a x b)
    public static int multiply (int a, int b) { 

        System.out.print ("\n\t\tMultiply : " + a + " x " + b + " = " );
        return a * b;
    } // End multiply

    // 5. calculate modolus (a % b)
    public static int modolus (int a, int b) { 
        
        System.out.print ("\n\t\tModolus  : " + a + " % " + b + " = ");
        return a % b;
    } // End modolus
} // End class arithmetic

