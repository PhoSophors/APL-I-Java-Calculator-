
/**
 * Money Exchange class
 * @return
 */

public class MoneyExchange {
    
     /**           1. Riel to Other Currencies
     * a. Riel to Dollar        4050 Riel = 1 Dollar
     * b. Riel to Euro          4600 Riel = 1 Euro
     * c. Riel to Franc         4500 Riel = 1 Franc
     * d. Riel to Pound         6000 Riel = 1 Pound
     * e. Riel to Baht          100  Reil = 1 Baht 
     *  */

      // 1. Riel to Dollar        
     public static float riel_to_dollar(float riel, float dollar) { 

      // 4050 Riel = 1 Dollar
        dollar = 4050;
        System.out.print ("\n\t\t" + riel + " riel = ");
        return riel / dollar;
     }

     // 2. Riel to Euro         
     public static float riel_to_euro(float riel, int euro) {

      // 4600 Riel = 1 Euro
        euro   = 4600;
        System.out.print ("\n\t\t" + riel + " riel = ");
        return riel / euro;
     }

     // 3. Riel to Franc         
     public static float riel_to_franc(float riel, int franc) { 
        
      // 4500 Riel = 1 Franc
         franc  = 4500;
         System.out.print ("\n\t\t" + riel + " riel = ");
         return riel / franc;
     }

     // 4. Riel to Pound        
     public static float riel_to_pound(float riel, int pound) {

      //  6000 Riel = 1 Pound
         pound  = 6000;
         System.out.print ("\n\t\t" + riel + " riel = ");
         return riel / pound;
     }
     // 5.  Riel to Baht         
     public static float riel_to_baht(float riel, int baht) {

      //  100  Reil = 1 Baht 
         baht   = 100;
         System.out.print ("\n\t\t" + riel + " riel = ");
         return riel / baht;
     }

     /*
     *            2. Other Currencies to Riel.
     * f. Dollar to Riel        1 Dollar  = 4050 Riel
     * g. Euro to Riel          1 Euro    = 4600 Riel
     * h. Franc to Riel         1 Franc   = 4500 Riel
     * i. Pound to Riel         1 Pound   = 6000 Riel
     * j. Baht to Riel          1 Baht    = 100 Riel
     */

     // 6. Dollar to Riel       
     public static int dollar_to_riel(float OCR, float riel) {

      //  1 Dollar  = 4050 Riel
        riel = 4050;
        System.out.print ("\n\t\t" + OCR + " Dollar = ");
        return (int) (OCR * riel) ;
     } 

     // 7. Euro to Riel          
     public static int euro_to_riel(int OCR, float riel) {

      // 1 Euro    = 4600 Riel
        riel = 4600;
        System.out.print ("\n\t\t" + OCR + " Euro   = ");
        return (int) (OCR * riel);
     } 
  
     // 8. Franc to Riel         
     public static int franc_to_riel(int OCR, float riel) {

      // 1 Franc   = 4500 Riel
        riel = 4500; 
        System.out.print ("\n\t\t" + OCR + " Franc  = ");
        return (int) (OCR * riel);
     } 

     // 9. Pound to Riel         
     public static int pound_to_riel(int OCR, float riel) {

      // 1 Pound   = 6000 Riel
        riel = 6000;
        System.out.print ("\n\t\t" + OCR + " Pound  = ");
        return (int) (OCR * riel);
     } 

     // 10. Baht to Riel          
     public static int baht_to_riel(int OCR, float riel) {

      // 1 Baht    = 100 Riel
        riel = 100; 
        System.out.print ("\n\t\t" + OCR + " Baht   = ");
        return (int) (OCR * riel);
     }
} // End class


