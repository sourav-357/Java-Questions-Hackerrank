package Day_03;

import java.util.*;

public class javaDatatypes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Move to next line after reading integer
        
        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            try {
                long num = Long.parseLong(input); // Try parsing as long
                System.out.println(input + " can be fitted in:");
                if (num >= -128 && num <= 127)
                    System.out.println("* byte");
                if (num >= -32768 && num <= 32767)
                    System.out.println("* short");
                if (num >= -2147483648L && num <= 2147483647L)
                    System.out.println("* int");
                // No need to check range because it's already a long
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}

