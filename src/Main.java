import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bill To Information ---
        System.out.println("\n--- Enter Bill To Information ---");
        System.out.print("Bill To Name (e.g., Thendral Supermarket): ");
        String billToName = scanner.nextLine();
        System.out.print("Bill To Address Line 1 (e.g., No.23/2, SBI Colony.): ");
        String billToAddress1 = scanner.nextLine();
        System.out.print("Bill To Address Line 2 (e.g., Ragavendhra Nagar, Chennai - 600124): ");
        String billToAddress2 = scanner.nextLine();
        System.out.print("Bill To GSTIN (e.g., 33APFSDF1ZV): ");
        String billToGstin = scanner.nextLine();
        System.out.print("Bill To Contact Number (e.g., +91-7869825463): ");
        String billToContact = scanner.nextLine();
        System.out.print("Bill To Email (e.g., purchase-team@thendral.com): ");
        String billToEmail = scanner.nextLine();

        // Ship To Information ---
        System.out.println("\n--- Enter Ship To Information ---");
        System.out.print("Ship To Name (e.g., Thendral Supermarket): ");
        String shipToName = scanner.nextLine();
        System.out.print("Ship To Address Line 1 (e.g., No.23/2, SBI Colony.): ");
        String shipToAddress1 = scanner.nextLine();
        System.out.print("Ship To Address Line 2 (e.g., Ragavendhra Nagar, Chennai - 600124): ");
        String shipToAddress2 = scanner.nextLine();
        System.out.print("Ship To GSTIN (e.g., 33APFSDF1ZV): ");
        String shipToGstin = scanner.nextLine();
        System.out.print("Ship To Contact Number (e.g., +91-7869825463): ");
        String shipToContact = scanner.nextLine();
        System.out.print("Ship To Email (e.g., dispatch@thendral.com): ");
        String shipToEmail = scanner.nextLine();


        // Product 1 Input ---
        System.out.println("\n--- Enter Details for Product 1 (e.g., Surf Excel 5 kg) ---");
        System.out.print("Product Code (int): ");
        int code1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Product Name (String): ");
        String name1 = scanner.nextLine();
        System.out.print("HSN Code (int): ");
        int hsn1 = scanner.nextInt();
        System.out.print("Quantity (int): ");
        int qty1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Unit (String, e.g., nos): ");
        String unit1 = scanner.nextLine();
        System.out.print("Rate (double): ");
        double rate1 = scanner.nextDouble();
        System.out.print("Tax Percentage (int, e.g., 5 or 18): ");
        int taxP1 = scanner.nextInt();

        // Product 2 Input ---
        System.out.println("\n--- Enter Details for Product 2 (e.g., Rin 1 kg) ---");
        System.out.print("Product Code (int): ");
        int code2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name (String): ");
        String name2 = scanner.nextLine();
        System.out.print("HSN Code (int): ");
        int hsn2 = scanner.nextInt();
        System.out.print("Quantity (int): ");
        int qty2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unit (String, e.g., nos): ");
        String unit2 = scanner.nextLine();
        System.out.print("Rate (double): ");
        double rate2 = scanner.nextDouble();
        System.out.print("Tax Percentage (int, e.g., 5 or 18): ");
        int taxP2 = scanner.nextInt();

        // Product 3 Input ---
        System.out.println("\n--- Enter Details for Product 3 (e.g., Hamam soap 150 g) ---");
        System.out.print("Product Code (int): ");
        int code3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name (String): ");
        String name3 = scanner.nextLine();
        System.out.print("HSN Code (int): ");
        int hsn3 = scanner.nextInt();
        System.out.print("Quantity (int): ");
        int qty3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unit (String, e.g., nos): ");
        String unit3 = scanner.nextLine();
        System.out.print("Rate (double): ");
        double rate3 = scanner.nextDouble();
        System.out.print("Tax Percentage (int, e.g., 5 or 18): ");
        int taxP3 = scanner.nextInt();

        // Product 4 Input ---
        System.out.println("\n--- Enter Details for Product 4 (e.g., Lux Soap 150 g) ---");
        System.out.print("Product Code (int): ");
        int code4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name (String): ");
        String name4 = scanner.nextLine();
        System.out.print("HSN Code (int): ");
        int hsn4 = scanner.nextInt();
        System.out.print("Quantity (int): ");
        int qty4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unit (String, e.g., nos): ");
        String unit4 = scanner.nextLine();
        System.out.print("Rate (double): ");
        double rate4 = scanner.nextDouble();
        System.out.print("Tax Percentage (int, e.g., 5 or 18): ");
        int taxP4 = scanner.nextInt();

        // Product 5 Input ---
        System.out.println("\n--- Enter Details for Product 5 (e.g., Dove soap 125 g) ---");
        System.out.print("Product Code (int): ");
        int code5 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name (String): ");
        String name5 = scanner.nextLine();
        System.out.print("HSN Code (int): ");
        int hsn5 = scanner.nextInt();
        System.out.print("Quantity (int): ");
        int qty5 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unit (String, e.g., nos): ");
        String unit5 = scanner.nextLine();
        System.out.print("Rate (double): ");
        double rate5 = scanner.nextDouble();
        System.out.print("Tax Percentage (int, e.g., 5 or 18): ");
        int taxP5 = scanner.nextInt();

        // Product 6 Input ---
        System.out.println("\n--- Enter Details for Product 6 (e.g., Vim bar 200 g) ---");
        System.out.print("Product Code (int): ");
        int code6 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name (String): ");
        String name6 = scanner.nextLine();
        System.out.print("HSN Code (int): ");
        String hsn6 = scanner.nextLine();
        System.out.print("Quantity (int): ");
        int qty6 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unit (String, e.g., nos): ");
        String unit6 = scanner.nextLine();
        System.out.print("Rate (double): ");
        double rate6 = scanner.nextDouble();
        System.out.print("Tax Percentage (int, e.g., 5 or 18): ");
        int taxP6 = scanner.nextInt();

        // Product 7 Input ---
        System.out.println("\n--- Enter Details for Product 7 (e.g., Pepsodent 150 g) ---");
        System.out.print("Product Code (int): ");
        int code7 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product Name (String): ");
        String name7 = scanner.nextLine();
        System.out.print("HSN Code (int): ");
        int hsn7 = scanner.nextInt();
        System.out.print("Quantity (int): ");
        int qty7 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unit (String, e.g., nos): ");
        String unit7 = scanner.nextLine();
        System.out.print("Rate (double): ");
        double rate7 = scanner.nextDouble();
        System.out.print("Tax Percentage (int, e.g., 5 or 18): ");
        int taxP7 = scanner.nextInt();
        scanner.close();

        // --- Calculations ---
        double taxM1 = 1.0 + ((double)taxP1 / 100.0);
        double taxM2 = 1.0 + ((double)taxP2 / 100.0);
        double taxM3 = 1.0 + ((double)taxP3 / 100.0);
        double taxM4 = 1.0 + ((double)taxP4 / 100.0);
        double taxM5 = 1.0 + ((double)taxP5 / 100.0);
        double taxM6 = 1.0 + ((double)taxP6 / 100.0);
        double taxM7 = 1.0 + ((double)taxP7 / 100.0);

        // --- Product Amount Calculation ---
        double amount1 = rate1 * qty1 * taxM1;
        double amount2 = rate2 * qty2 * taxM2;
        double amount3 = rate3 * qty3 * taxM3;
        double amount4 = rate4 * qty4 * taxM4;
        double amount5 = rate5 * qty5 * taxM5;
        double amount6 = rate6 * qty6 * taxM6;
        double amount7 = rate7 * qty7 * taxM7;

        // --- Convert/Round all to 2 Decimal Places ---
        amount1 = Math.round(amount1 * 100.0) / 100.0;
        amount2 = Math.round(amount2 * 100.0) / 100.0;
        amount3 = Math.round(amount3 * 100.0) / 100.0;
        amount4 = Math.round(amount4 * 100.0) / 100.0;
        amount5 = Math.round(amount5 * 100.0) / 100.0;
        amount6 = Math.round(amount6 * 100.0) / 100.0;
        amount7 = Math.round(amount7 * 100.0) / 100.0;

        // --- Total Calculation ---
        double subTotal = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;
        subTotal = Math.round(subTotal * 100.0) / 100.0;
        final double DISCOUNT_RATE = 0.006368;

        // --- Discount and Grand Total ---
        double discountAmount = subTotal * DISCOUNT_RATE;
        double grandTotal = subTotal - discountAmount;

        discountAmount = Math.round(discountAmount * 100.0) / 100.0;
        grandTotal = Math.round(grandTotal * 100.0) / 100.0;

        final String SEPARATOR = "=================================================================================================";

        System.out.println("\n\n");
        System.out.println(SEPARATOR);
        System.out.println("| Bill To:                                   | Ship To:                                         |");
        System.out.println(SEPARATOR);
        System.out.println("|                                            |                                                  |");
        System.out.println("| " + billToName + "                       | " + shipToName + "                             |");
        System.out.println("| " + billToAddress1 + "                       | " + shipToAddress1 + "                             |");
        System.out.println("| " + billToAddress2 + "        | " + shipToAddress2 + "              |");
        System.out.println("| GSTIN:" + billToGstin + "                          | GSTIN:" + shipToGstin + "                                |");
        System.out.println("| Contact: " + billToContact + "                    | Contact: " + shipToContact + "                          |");
        System.out.println("| Email: " + billToEmail + "          | Email: " + shipToEmail + "                |");
        System.out.println("|                                            |                                                  |");
        System.out.println(SEPARATOR);
        System.out.println("|                                                                                               |");
        System.out.println("| Payment Date: 7 days from date of delivery   Payment Terms: 100% against invoice              |");
        System.out.println("|                                                                                               |");
        System.out.println(SEPARATOR);
        System.out.println("| S.No | Product Code | Product Name    | HSN code | Quantity | Units | Rate   | Tax |   Amount |");
        System.out.println(SEPARATOR);
        System.out.println("|  1   |     " + code1 + "      | " + name1 + " | " + hsn1 + " |    " + qty1 + "    |  " + unit1 + "  | " + rate1 + "  | " + taxP1 + "%  | " + amount1 + " |");
        System.out.println("|  2   |     " + code2 + "      | " + name2 + "        | " + hsn2 + " |    " + qty2 + "    |  " + unit2 + "  |  " + rate2 + "  | " + taxP2 + "%  |  " + amount2 + " |");
        System.out.println("|  3   |     " + code3 + "      | " + name3 + "| " + hsn3 + " |    " + qty3 + "    |  " + unit3 + "  |  " + rate3 + "  | " + taxP3 + "%  |  " + amount3 + " |");
        System.out.println("|  4   |     " + code4 + "      | " + name4 + "  | " + hsn4 + " |    " + qty4 + "    |  " + unit4 + "  |  " + rate4 + "  | " + taxP4 + "%  |  " + amount4 + " |");
        System.out.println("|  5   |     " + code5 + "      | " + name5 + " | " + hsn5 + " |    " + qty5 + "    |  " + unit5 + "  |  " + rate5 + "  | " + taxP5 + "%  |  " + amount5 + " |");
        System.out.println("|  6   |     " + code6 + "      | " + name6 + "   | " + hsn6 + " |    " + qty6 + "    |  " + unit6 + "  |  " + rate6 + "  | " + taxP6 + "%  |   " + amount6 + " |");
        System.out.println("|  7   |     " + code7 + "      | " + name7 + " | " + hsn7 + " |    " + qty7 + "    |  " + unit7 + "  |  " + rate7 + "  | " + taxP7 + "% |  " + amount7 + " |");
        System.out.println(SEPARATOR);
        System.out.println("|                                                                        Total       | " + subTotal + " |");
        System.out.println("|                                                                        Discounts   |   " + discountAmount + " |");
        System.out.println("|                                                                        Grand total | " + grandTotal + " |");
        System.out.println(SEPARATOR);
    }
}