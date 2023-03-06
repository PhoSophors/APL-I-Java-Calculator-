/**
 * This class used for display menu all in project
 * 
 * @return
 */

public class DisplayMenu {

    public static int Menu(int menu) {

        /* Display all menu for user */
        System.out.println("\n+================= Menu =================+");
        System.out.println("|\t\t\t\t\t |");
        System.out.println("|\t1. Arithmetic\t\t\t |");
        System.out.println("|\t2. Trigonometry\t\t\t |");
        System.out.println("|\t3. Bitwise operator\t\t |");
        System.out.println("|\t4. Money Exchange\t\t |");
        System.out.println("|\t5. Storage Converter\t\t |");
        System.out.println("|\t6. Number System Conversion\t |");
        System.out.println("|\t7. BinaryArithmetic\t\t |");
        System.out.println("|\t8. Exit Program\t\t\t |");
        System.out.println("|\t\t\t\t\t |");
        System.out.println("+========================================+");

        return menu;
    }

    // case 4 Money Exchange
    public static int MoneyExchange(int menu) {

        /** Display money exchange menu for user choice */
        System.out.println("\n\t+========= Money Exchange Menu =========+");
        System.out.println("\t|\t\t\t\t\t|");
        System.out.println("\t|\t1. Riel to Other Currencies.\t|");
        System.out.println("\t|\t2. Other Currencies to Riel.\t|");
        System.out.println("\t|\t\t\t\t\t|");
        System.out.println("\t+=======================================+");

        return menu;
    }

    // case 5 Storage Converter display
    public static int storageConverter(int menu) {

        System.out.println("\n\t+============== Storage Converter ==============+");
        System.out.println("\t|\t\t\t\t\t\t|");
        System.out.println("\t|\t1. Byte to (KB, MB, GB, TB, PB) \t|");
        System.out.println("\t|\t2. Kilobyte to (B, MB, GB, TB, PB) \t|");
        System.out.println("\t|\t3. Megabyte to (B, KB, GB, TB, PB) \t|");
        System.out.println("\t|\t4. Gigabyte to (B, KB, MB, TB, PB) \t|");
        System.out.println("\t|\t5. Terabyte to (B, KB, MB, GB, PB) \t|");
        System.out.println("\t|\t6. Perabyte to (B, KB, MB, GB, TB) \t|");
        System.out.println("\t|\t\t\t\t\t\t|");
        System.out.println("\t+===============================================+");

        return menu;
    } // End 5

    // case 6 NumberSystemConversion
    public static int NumberSystemConversion(int menu) {

        System.out.println("\n\t+===== Welcome to System Number Conversion =====+");
        System.out.println("\t|\t1. Binary convert to other number.\t|");
        System.out.println("\t|\t2. Octal convert to other number.\t|");
        System.out.println("\t|\t3. Decimal convert to other number.\t|");
        System.out.println("\t|\t4. Hexadecimal convert to other number.\t|");
        System.out.println("\t+===============================================+");

        return menu;
    }
    // case 3 Binary Arithmetic 
    public static int BinaryArithmetic(int menu) {

        System.out.println("\n\t+======== Welcome to Binary Arithmetic =========+");
        System.out.println("\t|\t1. Binary Calculator.\t\t\t|");
        System.out.println("\t|\t2. Find One's and Two's Complement.\t|");
        System.out.println("\t+===============================================+");

        return menu;
    }


} // End class

