
/*  Sucject : APL_I          
    Instructor : Dr. Kor Sokchea
    Class      : ITEM3G7Y2S1
    Name       : Pho SoPhors    
    Lab        : 4 (Due  : Monday,17 Jan 2022 (1:00PM))
    Create     : Saturday, 15 Jan 2022 
    End        : Sunday, 16 Jan 2022 (10:00PM)
*/
import java.util.Scanner;

public class ITECalculator {

    private static Scanner input = new Scanner(System.in);
    // for money exchange
    private static final float dollar = 0, riel = 0;
    private static final int euro = 0, franc = 0, pound = 0, baht = 0;
    // for trigonometry
    private static float radian;
    private static int degree;
    private static long x;
    // for menu getting from display menu class
    private static int menu;
    private static Scanner scan;

    public static void main(String[] args) {

        int choice;
        int condition;

        do {
            // display menu for user
            System.out.println(+DisplayMenu.Menu(menu));
            /* Get choice from user */
            System.out.print("PLEASE CHOICE ONE : ");
            choice = input.nextInt();

            switch (choice) {
                case 1: { // 1. Arithmetic calculator
                    // get input from user
                    System.out.print("\n\n\tPlease enter first number : ");
                    int a = input.nextInt();
                    System.out.print("\tPlease enter secound number : ");
                    int b = input.nextInt();

                    // output arimethmetic
                    System.out.print(+Arithmetic.sum(a, b));
                    System.out.print(+Arithmetic.divide(a, b));
                    System.out.print(+Arithmetic.minus(a, b));
                    System.out.print(+Arithmetic.multiply(a, b));
                    System.out.println(+Arithmetic.modolus(a, b));

                }
                    break; // End case 1

                case 2: { // 2. Trigonometry
                    // get input from user
                    System.out.print("\n\tEnter number to calculate trigonometry : ");
                    float in = input.nextFloat();

                    // output result trigonometry
                    System.out.println(+Trigonometry.sin(radian, in));
                    System.out.println(+Trigonometry.sind(degree, in));
                    System.out.println(+Trigonometry.cos(radian, in));
                    System.out.println(+Trigonometry.cosd(degree, in));
                    System.out.println(+Trigonometry.tan(radian, in));
                    System.out.println(+Trigonometry.tand(degree, in));
                    System.out.println(+Trigonometry.square2(x, in)); // integer
                    System.out.println(+Trigonometry.square2(x, in)); // Floating-point
                    System.out.println(+Trigonometry.square3(x, in)); // integer
                    System.out.println(+Trigonometry.square3(x, in)); // Floating-point
                    System.out.println(+Trigonometry.degree2radian(radian, in) + " radain");
                }
                    break;

                case 3: { // 3. (Bitwise operator)
                    // get input from user
                    System.out.print("\n\n\tPlease enter first number : ");
                    int a = input.nextInt();
                    System.out.print("\tPlease enter secound number : ");
                    int b = input.nextInt();

                    // output bitwise operator
                    System.out.print(+Bitwise.AND(a, b));
                    System.out.print(+Bitwise.OR(a, b));
                    System.out.print(+Bitwise.XOR(a, b));
                    System.out.print(+Bitwise.leftShift(a, b));
                    System.out.print(+Bitwise.rightShift(a, b));
                    System.out.println(+Bitwise.bitInversion(a, b));
                }
                    break;

                case 4: { // 4. Money exchange
                    // display money exchange menu to user
                    System.out.println(+DisplayMenu.MoneyExchange(menu));
                    // get input from user
                    System.out.print("\tPlease choice one : ");
                    choice = input.nextInt();

                    // condition
                    if (choice == 1) { // 1. Riel to Other Currencies.
                        System.out.println("\n\t+==== 1. Riel to Other Currencies. ===+");
                        System.out.print("\n\tEnter your Money : ");
                        int riel = input.nextInt();

                        // output
                        System.out.print(+MoneyExchange.riel_to_dollar(riel, dollar) + "  Dollar.");
                        System.out.print(+MoneyExchange.riel_to_euro(riel, euro) + "  Euro.");
                        System.out.print(+MoneyExchange.riel_to_franc(riel, franc) + "  Franc.");
                        System.out.print(+MoneyExchange.riel_to_pound(riel, pound) + "  Pound.");
                        System.out.println(+MoneyExchange.riel_to_baht(riel, baht) + "      Baht.");

                    } else if (choice == 2) { // 2. Other Currencies to Riel.
                        System.out.println("\n\t+==== 2. Other Currencies to Riel. ===+");
                        System.out.print("\n\tEnter your money : ");
                        int OCR = input.nextInt();

                        // output
                        /** OCR = Other Currencies to Riel. */
                        System.out.print(+MoneyExchange.dollar_to_riel(OCR, riel) + " Riel");
                        System.out.print(+MoneyExchange.euro_to_riel(OCR, riel) + " Riel");
                        System.out.print(+MoneyExchange.franc_to_riel(OCR, riel) + " Riel");
                        System.out.print(+MoneyExchange.pound_to_riel(OCR, riel) + " Riel");
                        System.out.println(+MoneyExchange.baht_to_riel(OCR, riel) + "   Riel");
                    }
                }
                    break; // End Money Exchange case

                case 5: { // Storage Converter
                    // display storage converter menu for user
                    System.out.println(+DisplayMenu.storageConverter(menu));
                    // get choice from user
                    System.out.print("\tChooise one : ");
                    condition = input.nextInt();

                    // condition
                    if (condition == 1) { // 1. Byte to (KB, MB, GB, TB, PB)
                        // get input from user
                        System.out.print("\tEnter number to converter : ");
                        long numByte = (long) input.nextFloat();

                        // output
                        System.out.print(+StorageConverter.byte2KB(numByte) + " KB");
                        System.out.print(+StorageConverter.byte2MB(numByte) + " MB");
                        System.out.print(+StorageConverter.byte2GB(numByte) + " GB");
                        System.out.print(+StorageConverter.byte2TB(numByte) + " TB");
                        System.out.println(+StorageConverter.byte2PB(numByte) + " PB");

                    } else if (condition == 2) { // 2. Kilobyte to (B, MB, GB, TB, PB)
                        // get input from user
                        System.out.print("\tPlease enter number to converter : ");
                        long kilobyte = (long) input.nextFloat();

                        // output
                        System.out.print(+StorageConverter.KB2B(kilobyte) + " B");
                        System.out.print(+StorageConverter.KB2MB(kilobyte) + " MB");
                        System.out.print(+StorageConverter.KB2GB(kilobyte) + " GB");
                        System.out.print(+StorageConverter.KB2TB(kilobyte) + " TB");
                        System.out.println(+StorageConverter.KB2PB(kilobyte) + " PB");

                    } else if (condition == 3) { // 3. Megabyte to (B, KB, GB, TB, PB)
                        // get input from user
                        System.out.print("\tPlease enter number to converter : ");
                        long megabyte = (long) input.nextFloat();

                        // output
                        System.out.print(+StorageConverter.MB2B(megabyte) + " B");
                        System.out.print(+StorageConverter.MB2KB(megabyte) + " KB");
                        System.out.print(+StorageConverter.MB2GB(megabyte) + " GB");
                        System.out.print(+StorageConverter.MB2TB(megabyte) + " TB");
                        System.out.println(+StorageConverter.MB2PB(megabyte) + " PB");

                    } else if (condition == 4) { // 4. Gigabyte to (B, KB, MB, TB, PB)
                        // get input from user
                        System.out.print("\tPlease enter number to converter : ");
                        long gigabyte = (long) input.nextFloat();

                        // output
                        System.out.print(+StorageConverter.GB2B(gigabyte) + " B");
                        System.out.print(+StorageConverter.GB2KB(gigabyte) + " KB");
                        System.out.print(+StorageConverter.GB2MB(gigabyte) + " MB");
                        System.out.print(+StorageConverter.GB2TB(gigabyte) + " TB");
                        System.out.println(+StorageConverter.GB2PB(gigabyte) + " PB");

                    } else if (condition == 5) { // 5. Terabyte to (B, KB, MB, GB, PB)
                        // get input from user
                        System.out.print("\tPlease enter number to converter : ");
                        long terabyte = (long) input.nextFloat();

                        // output
                        System.out.print(+StorageConverter.TB2B(terabyte) + " B");
                        System.out.print(+StorageConverter.TB2KB(terabyte) + " KB");
                        System.out.print(+StorageConverter.TB2MB(terabyte) + " MB");
                        System.out.print(+StorageConverter.TB2GB(terabyte) + " GB");
                        System.out.println(+StorageConverter.TB2PB(terabyte) + " PB");

                    } else if (condition == 6) { // 6. Perabyte to (B, KB, MB, GB, TB)
                        // get input from user
                        System.out.print("\tPlease enter number to converter : ");
                        long petabyte = (long) input.nextFloat();

                        // output
                        System.out.print(+StorageConverter.PB2B(petabyte) + " B");
                        System.out.print(+StorageConverter.PB2KB(petabyte) + " KB");
                        System.out.print(+StorageConverter.PB2MB(petabyte) + " MB");
                        System.out.print(+StorageConverter.PB2GB(petabyte) + " GB");
                        System.out.println(+StorageConverter.PB2TB(petabyte) + " TB");
                    }
                }
                    break; // End case 5

                // Number System Conversion
                case 6: {

                    // display menu of number system conversion
                    System.out.println(+DisplayMenu.NumberSystemConversion(menu));

                    // get choise one option from yser
                    System.out.print("\tPlease choice one : ");
                    int in = input.nextInt();

                    // condition if, else if
                    // if user choice number 1 user can convert number of binary to other number
                    if (in == 1) { // binary

                        scan = new Scanner(System.in);
                        // get input binary number from user
                        System.out.print("\n\tEnter the binary number : ");
                        int binary = scan.nextInt();

                        // get process and ouput from NumberSystem
                        System.out.println(+NumberSystem.binary2Decimal(binary));
                        System.out.println(+NumberSystem.binary2Octal(binary));
                        System.out.println(+NumberSystem.binary2Hex(binary));
                    } // end binary

                    // if user choice number 2 user can convert number of octal to other number
                    else if (in == 2) { // octal
                        scan = new Scanner(System.in);
                        // get input octal number from user
                        // octal number have (0 -> 7)
                        System.out.print("\n\tEnter the octal number : ");
                        int octal = scan.nextInt();

                        // get process and ouput from NumberSystem
                        System.out.println(+NumberSystem.octal2Decimal(octal));
                        System.out.println(+NumberSystem.octal2Binary(octal));
                        System.out.println(+NumberSystem.octal2Hex(octal));
                    } // end octal

                    // if user choice number 3 user can convert number of decimal to other number
                    else if (in == 3) { // decimal
                        scan = new Scanner(System.in);
                        // get input decimal number from user
                        System.out.print("\n\tEnter the decimal number : ");
                        int decimal = scan.nextInt();

                        // get process and ouput from NumberSystem
                        System.out.println(+NumberSystem.decimal2Binary(decimal));
                        System.out.println(+NumberSystem.decimal2Octal(decimal));
                        System.out.println(+NumberSystem.decimal2Hexa(decimal));
                    } // end 3 decimal

                    else if (in == 4) { // Hexadecimal
                        scan = new Scanner(System.in);
                        // get input hexadecimal number from user (Input String example 11B)
                        System.out.print("\n\tEnter the hexadecimal number : ");
                        String hex = scan.nextLine();

                        // get process and ouput from NumberSystem
                        System.out.println(+NumberSystem.hex2Octal(hex));
                        System.out.println(+NumberSystem.hex2Decimal(hex));
                    } // end 4 hexadecimal

                } // end case 6 number system conversion
                    break;
                case 7: {
                    // get display menu to user choise
                    System.out.println(+DisplayMenu.BinaryArithmetic(menu));
                    // get user choise
                    System.out.print("\tPlease choice one to calculate : ");
                    choice = input.nextInt();

                    // condition
                    if (choice == 1) { // binary calculator

                        // getting first binary number from user
                        System.out.print("\n\tEnter first binary number: ");
                        long a1 = input.nextLong();
                        // getting second binary number from user
                        System.out.print("\tEnter second binary number: ");
                        long a2 = input.nextLong();

                        System.out.println(+BinaryArithmetic.binaryAdd((int) a1, a2));
                        System.out.println(+BinaryArithmetic.multiplyBinary(a1, a2));
                        System.out.println(+BinaryArithmetic.divideBinary(a1, a2));

                    } else if (choice == 2) { // find binary 1 and 2 complement
                        StringBuffer str = new StringBuffer("1001001");

                        // System.out.println(+BinaryArithmetic.findOnescomplement(str));
                        // get find Twos complement methods from class binary arithmetic
                        System.out.println(BinaryArithmetic.findTwoscomplement(str));
                    }

                } // end case 7
                    break;
            } // End Swtich
        } while (choice != 10);// End do while loop (if use input number program us exit!!!)
    }  // End main
} // End class