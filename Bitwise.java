public class Bitwise {
    /**
     *    +==== Bitwise Operator ====+
     * 1. Binary AND Operator ( & )
     * 2. Binary OR Operator ( | )
     * 3. Binary XOR Operator ( ^ )
     * 4. Binary leftShift Operator ( << )
     * 5. Binary rightShift Operator ( >> )
     * 6. Binary bitInversion Operator ( ~ )
     */

     /*** 1. Binary AND Operator ( & ) */
     public static int AND(int a, int b) { 

        System.out.print("\n\t\tAND operator       : " + a + "  &  " + b + "   = ");
         return a & b;
     } // End * 1. Binary AND Operator ( & )

     /*** 2. Binary OR Operator ( | ) */
     public static int OR(int a, int b) {

      System.out.print ("\n\t\tOR operator        : " + a + "  |  " + b + "   = " );
        return a | b;
     } // End * 2. Binary OR Operator ( | )

     /*** 3. Binary XOR Operator ( ^ ) */
     public static int XOR(int a, int b) {

      System.out.print ("\n\t\tXOR operator       : " + a + "  ^  " + b + "   = " );
        return a ^ b;
     } // * 3. Binary XOR Operator ( ^ )

     // * 4. Binary leftShift Operator ( << )
     public static int leftShift(int a, int b) {

      System.out.print ("\n\t\tleftShift          : " + a + "  <<  " + b + " = ");
        return a << b;
     } // End * 4. Binary leftShift Operator ( << )

     // * 5. Binary rightShift Operator ( >> )
     public static int rightShift (int a, int b) {
         
      System.out.print ("\n\t\tRightShift         : " + a + "  >>  " + b + " = ");
        return a >> b;
     } // End * 5. Binary rightShift Operator ( >> )

     /*** 6. Binary bitInversion Operator ( ~ ) */
     public static int bitInversion(int a, int b) {

      System.out.print ("\n\t\tInversion operator : " + "~ " + a + "       = ");
        return ~ a;
     } // End * 6. Binary bitInversion Operator ( ~ )
}
